package org.gonzaleztobias.servicio.archivo;

import com.opencsv.CSVWriter;
import org.gonzaleztobias.App;
import org.gonzaleztobias.dominio.CajaDeAhorro;
import org.gonzaleztobias.dominio.Cliente;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArchivoServicioImpl implements ArchivoServicio{

    private final String UBICACION_ARCHIVO = "/src/main/java/org/gonzaleztobias/recursos/";
    @Override
    public void exportarCuentasACsv(List<Cliente> clientes, String nombreArchivo) {
        String ruta = System.getProperty("user.dir").concat(UBICACION_ARCHIVO).concat(nombreArchivo);
        try(CSVWriter writer = new CSVWriter(new FileWriter(ruta))) {
            //Encabezado, se puede modificar para dejar solo los datos que se deseen
            String[] encabezado = {"ID Cliente", "Nombre cliente", "Direccion", "Tipo de Cuenta", "Saldo en cuenta", "ID Cuenta"};
            writer.writeNext(encabezado);

            for (Cliente cl : clientes) {
                cl.ordenarCuentasPorSaldo();
                for (CajaDeAhorro cuenta : cl.getCuentas()) {
                    String datos[] ={
                            //Se puede modificar para coincidir con los datos deseados en encabezado, comentar segun no se quieran
                            String.valueOf(cl.getId()), // ID Cliente
                            cl.getNombre(), // nombre y apellido cliente
                            cl.getDireccion(), // direccion de cliente
                            this.tipocuenta(cuenta), // Indica si es una caja de ahorro o una cuenta corriente
                            String.valueOf(cuenta.getSaldo()), // Saldo actual en cuenta (Muestra ordenador segun metodo en linea 24)
                            String.valueOf(cuenta.getId()) // Obtiene el ID de la Caja o Cuenta segun corresponde

                    };
                    writer.writeNext(datos);
                }

            }
            writer.close(); //Es lo que ocaciona el error "Stream closed" pero al verificar que en clase no lo corrigieron se mantiene para cerrar el escritor
            System.out.println("Finalizada la exportacion exitosa");

        } catch (IOException e){
            System.out.println("Algo salio mal: " + e.getMessage());
        }

    }

    private String tipocuenta(CajaDeAhorro cuenta){
        if (cuenta.getId() == 1 ) {
            return "Caja de Ahorro";
        }
         else {
            return "Cuenta Corriente";
        }
    }
}

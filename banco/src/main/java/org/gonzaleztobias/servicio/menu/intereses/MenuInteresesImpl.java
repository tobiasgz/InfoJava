package org.gonzaleztobias.servicio.menu.intereses;


import org.gonzaleztobias.App;
import org.gonzaleztobias.dominio.CajaDeAhorro;
import org.gonzaleztobias.dominio.Cliente;

public class MenuInteresesImpl implements MenuIntereses {
    @Override
    public void generarIntereses() {
        for (Cliente cliente : App.banco.getClientes()) {
            for (CajaDeAhorro cuenta :cliente.getCuentas()) {
                interesPorCuenta(cuenta);

                }
            }

        }
    private void interesPorCuenta(CajaDeAhorro cuenta){
        if (cuenta.getTipo() == 2){
            if (cuenta.getSaldo() < 0){
                cuenta.generarInteres();
            }
        } else cuenta.generarInteres();
    }

}

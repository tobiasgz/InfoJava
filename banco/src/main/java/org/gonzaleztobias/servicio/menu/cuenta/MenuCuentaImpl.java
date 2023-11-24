package org.gonzaleztobias.servicio.menu.cuenta;

import org.gonzaleztobias.dominio.CajaDeAhorro;
import org.gonzaleztobias.dominio.Cliente;
import org.gonzaleztobias.dominio.CuentaCorriente;
import org.gonzaleztobias.entrada.InputConsoleService;
import org.gonzaleztobias.servicio.cliente.ClienteServicio;
import org.gonzaleztobias.servicio.menu.cliente.MenuCliente;

import java.util.Optional;


public class MenuCuentaImpl implements MenuCuenta{
    private ClienteServicio clienteServicio;

    public void setMenuCliente(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }

    public MenuCuentaImpl(ClienteServicio clienteServicio) {
        this.clienteServicio = clienteServicio;
    }

    @Override
    public void crearCuenta() {
        System.out.println("Elija que tipo de cuenta quiere crear:");
        System.out.println("1. Caja de Ahorro");
        System.out.println("2. Cuenta Corriente");
        int opc = InputConsoleService.getScanner().nextInt();
        System.out.println("ingrese el id del cliente para asociar la cuenta");
        Long id = InputConsoleService.getScanner().nextLong();
        Optional<Cliente> clienteOptimal = clienteServicio.seleccionarCliente(id);
        switch (opc) {
            case 1:
                if (clienteOptimal.isPresent()){
                    CajaDeAhorro caja = new CajaDeAhorro(clienteOptimal.get(), clienteOptimal.get().cantidadCuentas()+1);
                    clienteOptimal.get().setCuentas(caja);
                    System.out.println("Creacion de Caja de Ahorro Exitosa");
                }
                break;
            case 2:
                if (clienteOptimal.isPresent()){
                    CuentaCorriente cuenta = new CuentaCorriente(clienteOptimal.get(), clienteOptimal.get().cantidadCuentas()+1);
                    clienteOptimal.get().setCuentas(cuenta);
                    System.out.println("Creacion de Cuenta Corriente Exitosa");
                }
                break;
        }

    }

    public void mostrarCuentas(){
        System.out.println("Ingrese el id del cliente para visualizar las cuentas");
        Long id = InputConsoleService.getScanner().nextLong();
        Optional<Cliente> clienteOptional = clienteServicio.seleccionarCliente(id);
        if (clienteOptional.isPresent()){
            clienteOptional.get().mostrarCuentas();
        }
    }
}


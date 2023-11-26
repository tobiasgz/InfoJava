package org.gonzaleztobias.servicio.menu.depositar;


import org.gonzaleztobias.dominio.CajaDeAhorro;
import org.gonzaleztobias.dominio.Cliente;
import org.gonzaleztobias.entrada.InputConsoleService;
import org.gonzaleztobias.servicio.cliente.ClienteServicio;
import org.gonzaleztobias.servicio.cuenta.CuentaServicio;

import java.util.Optional;

public class MenuDepositarImpl implements MenuDepositar {

    private ClienteServicio clienteServicio;

    private CuentaServicio cuentaServicio;

    public MenuDepositarImpl(ClienteServicio clienteServicio, CuentaServicio cuentaServicio) {
        this.clienteServicio = clienteServicio;
        this.cuentaServicio = cuentaServicio;
    }

    @Override
    public void depositar() {
        Double monto;

        Cliente cl;


        System.out.println("Ingrese ID de cliente para depositar ");
        Long id = InputConsoleService.getScanner().nextLong();
        Optional<Cliente> cliente = clienteServicio.seleccionarCliente(id);
        if (cliente.isPresent()){
            cl = cliente.get();
            cl.mostrarCuentas();

            System.out.println("Ingrese ID de cuenta a depositar");
            Long idCaja = InputConsoleService.getScanner().nextLong();
            Optional<CajaDeAhorro> cajaElejida = cuentaServicio.seleccionarCuenta(idCaja,cl);
            if (cajaElejida.isPresent()){
                System.out.println("Ingrese monto a depositar");
                monto = InputConsoleService.getScanner().nextDouble();
               if (monto > 0){
                    cajaElejida.get().setSaldo(monto);
                    System.out.println("Deposito realizado correctamente en id cliente " + cl.getId() + " y cuenta: " + cajaElejida.get().getId());
                    System.out.println("Saldo actual: " + cajaElejida.get().getSaldo());

               } else System.out.println("No ingrese numero negativos, deposito no realizado");

            }



        }



    }
}

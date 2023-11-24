package org.gonzaleztobias;

import org.gonzaleztobias.dominio.Banco;
import org.gonzaleztobias.entrada.InputConsoleService;
import org.gonzaleztobias.servicio.cliente.ClienteServicio;
import org.gonzaleztobias.servicio.cliente.ClienteServicioImpl;
import org.gonzaleztobias.servicio.cuenta.CuentaServicioImpl;
import org.gonzaleztobias.servicio.menu.cliente.MenuCliente;
import org.gonzaleztobias.servicio.menu.cliente.MenuClienteImpl;
import org.gonzaleztobias.servicio.menu.cuenta.MenuCuenta;
import org.gonzaleztobias.servicio.menu.cuenta.MenuCuentaImpl;
import org.gonzaleztobias.servicio.menu.depositar.MenuDepositar;
import org.gonzaleztobias.servicio.menu.depositar.MenuDepositarImpl;
import org.gonzaleztobias.servicio.menu.principal.MenuPrincipal;
import org.gonzaleztobias.servicio.menu.principal.MenuPrincipalImpl;

public class App {

    public static Banco banco = new Banco("ICBC");
    public static void main( String[] args ) {
        InputConsoleService.createScanner();
        MenuCliente menuCliente = new MenuClienteImpl();
        MenuCuenta menuCuenta = new MenuCuentaImpl(new ClienteServicioImpl());
        MenuDepositar menuDepositar = new MenuDepositarImpl(new ClienteServicioImpl(), new CuentaServicioImpl(new ClienteServicioImpl()));

        MenuPrincipal menuPrincipal = new MenuPrincipalImpl(menuCliente, menuCuenta, menuDepositar);
        menuPrincipal.iniciar();



    }


}

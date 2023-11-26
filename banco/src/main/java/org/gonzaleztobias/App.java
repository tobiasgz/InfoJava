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
import org.gonzaleztobias.servicio.menu.intereses.MenuIntereses;
import org.gonzaleztobias.servicio.menu.intereses.MenuInteresesImpl;
import org.gonzaleztobias.servicio.menu.principal.MenuPrincipal;
import org.gonzaleztobias.servicio.menu.principal.MenuPrincipalImpl;
import org.gonzaleztobias.servicio.menu.transferir.MenuTransferir;
import org.gonzaleztobias.servicio.menu.transferir.MenuTransferirImpl;

public class App {

    public static Banco banco = new Banco("GLMZ");
    public static void main( String[] args ) {
        InputConsoleService.createScanner();
        MenuCliente menuCliente = new MenuClienteImpl();
        MenuCuenta menuCuenta = new MenuCuentaImpl(new ClienteServicioImpl());
        MenuDepositar menuDepositar = new MenuDepositarImpl(new ClienteServicioImpl(), new CuentaServicioImpl(new ClienteServicioImpl()));
        MenuTransferir menuTransferir = new MenuTransferirImpl(new CuentaServicioImpl(new ClienteServicioImpl()), new ClienteServicioImpl());
        MenuIntereses menuIntereses = new MenuInteresesImpl();

        MenuPrincipal menuPrincipal = new MenuPrincipalImpl(menuCliente, menuCuenta, menuDepositar, menuTransferir, menuIntereses);
        menuPrincipal.iniciar();


    }


}

package org.gonzaleztobias.servicio.menu.principal;

import org.gonzaleztobias.App;
import org.gonzaleztobias.dominio.Cliente;
import org.gonzaleztobias.entrada.InputConsoleService;
import org.gonzaleztobias.servicio.menu.cliente.MenuCliente;
import org.gonzaleztobias.servicio.menu.cuenta.MenuCuenta;
import org.gonzaleztobias.servicio.menu.depositar.MenuDepositar;

public class MenuPrincipalImpl implements MenuPrincipal{

    private MenuCliente menuCliente;

    private MenuCuenta menuCuenta;

    private MenuDepositar menuDepositar;

    public MenuPrincipalImpl(MenuCliente menuCliente, MenuCuenta menuCuenta, MenuDepositar menuDepositar){
        this.menuCliente = menuCliente;
        this.menuCuenta = menuCuenta;
        this.menuDepositar = menuDepositar;
    }


    @Override
    public void iniciar() {
        int opc;
        do {
            System.out.println("1. Crear Cliente");
            System.out.println("2. Crear Cuenta");
            System.out.println("3. Ver Clientes del Banco");
            System.out.println("4. Ver mi Cuenta");
            System.out.println("5. Depositar");
            System.out.println("6. Transferir");
            System.out.println("0. Cerrar sistema");

            System.out.println("Ingrese una opcion");
            opc = InputConsoleService.getScanner().nextInt();

            switch (opc){
                case 1:
                    menuCliente.crearCliente();
                    break;
                case 2:
                    menuCuenta.crearCuenta();
                    break;
                case 3:
                    System.out.println(App.banco.getClientes());
                    for (Cliente cliente:App.banco.getClientes()) {
                        System.out.println(cliente.getNombre());
                        System.out.println(cliente.getDireccion());
                        System.out.println(cliente.getId());
                        System.out.println(cliente.getCuentas());

                    }
                    break;
                case 4:
                    menuCuenta.mostrarCuentas();
                    break;

                case 5:
                    menuDepositar.depositar();
                    break;
                case 0:
                    System.out.println("Sistema cerrado");
                    break;

            }





        }while (opc != 0);


    }
}

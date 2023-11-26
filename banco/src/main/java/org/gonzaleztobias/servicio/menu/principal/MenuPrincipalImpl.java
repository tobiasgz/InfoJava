package org.gonzaleztobias.servicio.menu.principal;

import org.gonzaleztobias.App;
import org.gonzaleztobias.dominio.Cliente;
import org.gonzaleztobias.entrada.InputConsoleService;
import org.gonzaleztobias.servicio.menu.cliente.MenuCliente;
import org.gonzaleztobias.servicio.menu.cuenta.MenuCuenta;
import org.gonzaleztobias.servicio.menu.depositar.MenuDepositar;
import org.gonzaleztobias.servicio.menu.intereses.MenuIntereses;
import org.gonzaleztobias.servicio.menu.transferir.MenuTransferir;

public class MenuPrincipalImpl implements MenuPrincipal{

    private MenuCliente menuCliente;

    private MenuCuenta menuCuenta;

    private MenuDepositar menuDepositar;

    private MenuTransferir menuTransferir;

    private MenuIntereses menuIntereses;

    public MenuPrincipalImpl(MenuCliente menuCliente, MenuCuenta menuCuenta, MenuDepositar menuDepositar, MenuTransferir menuTransferir, MenuIntereses menuIntereses){
        this.menuCliente = menuCliente;
        this.menuCuenta = menuCuenta;
        this.menuDepositar = menuDepositar;
        this.menuTransferir = menuTransferir;
        this.menuIntereses = menuIntereses;
    }


    @Override
    public void iniciar() {
        int opc;
        do {
            System.out.println();
            System.out.printf("Bienvenidos al banco %s \n", App.banco.getNombre());
            System.out.println("1. Crear Cliente");
            System.out.println("2. Crear Cuenta");
            System.out.println("3. Ver Clientes del Banco");
            System.out.println("4. Ver cuentas de cliente por ID");
            System.out.println("5. Depositar");
            System.out.println("6. Transferir");
            System.out.println("7. Generar intereses en todas las cuentas");
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
                    for (Cliente cliente:App.banco.getClientes()) {
                        System.out.println(cliente.getNombre());
                        System.out.println(cliente.getDireccion());
                        System.out.println(cliente.getId());
                        System.out.println("tiene " + cliente.cantidadCuentas() + " cuentas");
                        System.out.println();

                    }
                    break;
                case 4:
                    menuCuenta.mostrarCuentas();
                    break;

                case 5:
                    menuDepositar.depositar();
                    break;
                case 6:
                    menuTransferir.transferir();
                    break;

                case 7:
                    menuIntereses.generarIntereses();
                    break;

                case 0:
                    System.out.println("Sistema cerrado");
                    break;

            }





        }while (opc != 0);


    }
}

package org.gonzaleztobias.servicio.menu.cliente;

import org.gonzaleztobias.App;
import org.gonzaleztobias.dominio.Cliente;
import org.gonzaleztobias.entrada.InputConsoleService;


public class MenuClienteImpl implements MenuCliente{

    @Override
    public void crearCliente() {
        InputConsoleService.getScanner().nextLine();
        System.out.println("Ingrese su  y apellido");
        String nombre = InputConsoleService.getScanner().nextLine().trim();
        Long id = App.banco.cantidadClientes()+1;
        System.out.println("Ingrese su direccion");
        String direccion = InputConsoleService.getScanner().nextLine().trim();

        Cliente cliente = new Cliente(id, nombre, direccion);
        App.banco.setClientes(cliente);

        System.out.println("Cliente creado con exito" + " Su numero de id es: " + cliente.getId());
    }

}

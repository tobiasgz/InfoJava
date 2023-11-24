package org.gonzaleztobias.servicio.menu.cuenta;

import org.gonzaleztobias.dominio.Cliente;
import org.gonzaleztobias.servicio.cliente.ClienteServicio;
import org.gonzaleztobias.servicio.menu.cliente.MenuCliente;

public interface MenuCuenta {
    void crearCuenta();

    void mostrarCuentas();

    void setMenuCliente(ClienteServicio clienteServicio);
}

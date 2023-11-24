package org.gonzaleztobias.servicio.cliente;

import org.gonzaleztobias.dominio.Cliente;

import java.util.Optional;

public interface ClienteServicio {

    Optional<Cliente> getClienteById(Long id);

    Optional<Cliente> seleccionarCliente(Long id);
}

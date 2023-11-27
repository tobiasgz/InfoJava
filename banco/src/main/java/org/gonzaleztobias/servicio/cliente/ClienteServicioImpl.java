package org.gonzaleztobias.servicio.cliente;

import org.gonzaleztobias.App;
import org.gonzaleztobias.dominio.Cliente;
import java.util.Optional;

public class ClienteServicioImpl implements ClienteServicio {

    @Override
    public Optional<Cliente> getClienteById(Long id) {
        Cliente cliente = App.banco.getClientesById(id);

        if (cliente == null) {
            return Optional.empty();
        } else {
            return Optional.of(cliente);
        }

    }

    public Optional<Cliente> seleccionarCliente(Long idCliente) {
        System.out.println("Buscando cliente...");
        Optional<Cliente> cliente = this.getClienteById(idCliente);

        if (cliente.isEmpty()) {
            System.out.println("No existe el cliente con id : " + idCliente);
            return Optional.empty();
        } else {
            System.out.println("cliente seleccionado");
            return cliente;

        }
    }
}

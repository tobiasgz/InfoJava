package org.gonzaleztobias.servicio.archivo;

import org.gonzaleztobias.dominio.Cliente;

import java.util.List;

public interface ArchivoServicio {
    void exportarCuentasACsv(List<Cliente> clientes, String nombreArchivo);
}

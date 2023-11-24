package org.gonzaleztobias.servicio.cuenta;

import org.gonzaleztobias.dominio.CajaDeAhorro;
import org.gonzaleztobias.dominio.Cliente;

import java.util.Optional;

public interface CuentaServicio {
    Optional<CajaDeAhorro> seleccionarCuenta(Long idCuenta, Cliente cliente);
}

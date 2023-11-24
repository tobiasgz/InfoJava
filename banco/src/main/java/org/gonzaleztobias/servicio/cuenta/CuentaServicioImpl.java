package org.gonzaleztobias.servicio.cuenta;

import org.gonzaleztobias.dominio.CajaDeAhorro;
import org.gonzaleztobias.dominio.Cliente;
import org.gonzaleztobias.entrada.InputConsoleService;
import org.gonzaleztobias.servicio.cliente.ClienteServicio;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Optional;

public class CuentaServicioImpl implements CuentaServicio{

    private ClienteServicio clienteServicio;

    private Long idCuenta;

    private Long idCliente;

    private Cliente cliente;

    public CuentaServicioImpl(ClienteServicio clienteServicio) {

    }

    public CajaDeAhorro getCuentaById(Long idCuenta) {
        for (CajaDeAhorro cuenta : cliente.getCuentas()) {
            if (idCuenta.equals(cuenta.getId())){
                return cuenta;
            }

        }
        return null;
    }

    @Override
    public Optional<CajaDeAhorro> seleccionarCuenta(Long idCuenta, Cliente cliente){
        this.cliente = cliente;

        CajaDeAhorro cajaElejida = this.getCuentaById(idCuenta);
        if (cajaElejida == null) {
            System.out.println("Cuenta o Caja no Encontrada");
            return Optional.empty();
        } else {
            return Optional.of(cajaElejida);
        }
    }



}

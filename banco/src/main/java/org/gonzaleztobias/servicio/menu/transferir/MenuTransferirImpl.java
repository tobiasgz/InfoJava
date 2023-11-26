package org.gonzaleztobias.servicio.menu.transferir;

import org.gonzaleztobias.dominio.CajaDeAhorro;
import org.gonzaleztobias.dominio.Cliente;
import org.gonzaleztobias.entrada.InputConsoleService;
import org.gonzaleztobias.servicio.cliente.ClienteServicio;
import org.gonzaleztobias.servicio.cuenta.CuentaServicio;

import java.util.Optional;

public class MenuTransferirImpl implements MenuTransferir {

    private CuentaServicio cuentaServicio;

    private ClienteServicio clienteServicio;

    public MenuTransferirImpl(CuentaServicio cuentaServicio, ClienteServicio clienteServicio) {
        this.cuentaServicio = cuentaServicio;
        this.clienteServicio = clienteServicio;
    }

    @Override
    public void transferir() {
        boolean bandera = false;
        Double monto;
        Cliente clienteOrigen;
        Cliente clienteDestino;
        CajaDeAhorro cuentaOrigen = null;
        CajaDeAhorro cuentaDestino = null;
        System.out.println("Ingrese el ID del cliente origen");
        clienteOrigen = this.elegirCliente();
        System.out.println("Ingre el ID del cliente destino");
        clienteDestino = this.elegirCliente();
        if (clienteOrigen != null && clienteDestino != null){
            System.out.println("Ingrese el ID de la cuenta del cliente origen");
            cuentaOrigen = this.elegirCuenta(clienteOrigen);
            System.out.println("Ingrese el ID de la cuenta del cliente destino");
            cuentaDestino = this.elegirCuenta(clienteDestino);

        }
        if (cuentaOrigen != null && cuentaDestino != null){
            System.out.println("Ingrese monto a transferir");
            monto = InputConsoleService.getScanner().nextDouble();
            if (monto < cuentaOrigen.getSaldoParaTransferir()){
                cuentaOrigen.setSaldo(-monto);
                cuentaDestino.setSaldo(monto);
            } else System.out.println("No hay fondos suficientes");


        } else System.out.println("Cuenta Origen o Cuenta Destino no elegida(s)");



    }

    private Cliente elegirCliente(){
        Cliente cliente;
        Long idCliente = InputConsoleService.getScanner().nextLong();
        Optional<Cliente> clienteOptional = clienteServicio.seleccionarCliente(idCliente);
        if (clienteOptional.isPresent()){
            return  cliente = clienteOptional.get();
        } else {
            return cliente = null;
        }

    }

    private CajaDeAhorro elegirCuenta(Cliente cliente){
        CajaDeAhorro caja;
        Long idCuenta = InputConsoleService.getScanner().nextLong();
        Optional<CajaDeAhorro> cuentaOptional = cuentaServicio.seleccionarCuenta(idCuenta, cliente);
        if (cuentaOptional.isPresent()){
            return caja = cuentaOptional.get();
        } else {
            return null;
        }
    }




}

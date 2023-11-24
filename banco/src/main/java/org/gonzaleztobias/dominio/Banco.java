package org.gonzaleztobias.dominio;

import org.gonzaleztobias.App;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nombre;

    public List<Cliente> clientes = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public Long cantidadClientes(){
        return Long.valueOf(this.getClientes().size());
    }

    public Cliente getClientesById(Long id){
        for (Cliente cl : this.getClientes()) {
            if (id.equals(cl.getId())){
                return cl;
            }
        }
        return null;
    }
}

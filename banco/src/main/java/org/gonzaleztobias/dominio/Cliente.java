package org.gonzaleztobias.dominio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private Long id;

    private String nombre;

    private String direccion;

    private List<CajaDeAhorro> cuentas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<CajaDeAhorro> getCuentas() {
        return cuentas;
    }

    public void mostrarCuentas(){
        System.out.printf("Las cajas de %s son : \n", this.nombre);
        for (CajaDeAhorro caja :this.getCuentas()) {
            if (caja.getTipo() == 1){
                System.out.printf("%d %s %.2f \n", caja.getId(),"Caja de Ahorro tiene un saldo de: ", caja.getSaldo());
            } else System.out.printf("%d %s %.2f \n", caja.getId(),"Cuenta Corriente tiene un saldo de ", caja.getSaldo());
        }
    }

    public void setCuentas(CajaDeAhorro cuentas) {
        this.cuentas.add(cuentas);
    }

    public Cliente(Long id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Long cantidadCuentas() { return Long.valueOf(this.cuentas.size());} //incrementa el ID al crear al cuenta
}

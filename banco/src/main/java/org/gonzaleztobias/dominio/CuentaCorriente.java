package org.gonzaleztobias.dominio;

public class CuentaCorriente extends CajaDeAhorro{
    private Double descubierto;

    public Double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(Double descubierto) {
        this.descubierto = descubierto;
    }

    public CuentaCorriente(Cliente titular,Long id) {
        super(titular, id);
        this.descubierto = 50000D;
        super.tipo = 2;
    }
}

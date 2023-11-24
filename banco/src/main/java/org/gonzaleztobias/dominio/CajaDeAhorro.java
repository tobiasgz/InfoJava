package org.gonzaleztobias.dominio;

public class CajaDeAhorro {

    protected Long id;

    protected Cliente titular;

    protected Double saldo = 0D;

    protected Double interes;

    protected Integer tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo += saldo;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Integer getTipo() {
        return tipo;
    }

    public CajaDeAhorro(Cliente titular, Long id) {
        this.id = id;
        this.titular = titular;
        this.tipo = 1;
    }
}

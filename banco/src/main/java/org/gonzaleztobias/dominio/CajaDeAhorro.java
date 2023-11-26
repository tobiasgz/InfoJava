package org.gonzaleztobias.dominio;

public class CajaDeAhorro {

    protected Long id;

    protected Cliente titular;

    protected Double saldo = 0D;

    protected final Double interes = 1.1D;

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

    public Double getSaldoParaTransferir(){
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        if (saldo > 0){
            this.saldo += saldo;
        } else {
            this.ayudaSaldo(saldo);
        }

    }

    public void generarInteres() {
        this.saldo = saldo * interes;
    }

    public Integer getTipo() {
        return tipo;
    }

    public CajaDeAhorro(Cliente titular, Long id) {
        this.id = id;
        this.titular = titular;
        this.tipo = 1;
    }

    private void ayudaSaldo(Double saldo){
        if (this.saldo < (-1)*saldo){

        } else {
            this.saldo += saldo;
        }
    }
}

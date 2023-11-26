package org.gonzaleztobias.dominio;

public class CuentaCorriente extends CajaDeAhorro{
    private final Double descubierto = 50001D;

    public Double getDescubierto() {
        return descubierto;
    }


    @Override
    public void setSaldo(Double saldo){
        if (saldo > 0){
            this.saldo += saldo;
        } else {
            this.ayudaSaldo(saldo);
        }


    }

    @Override
    public Double getSaldoParaTransferir(){
        Double saldoADevolver = this.saldo + descubierto;
        return saldoADevolver;

    }



    private void ayudaSaldo(Double saldo){
        Double saldoTemporal = this.saldo + descubierto;
        if (saldoTemporal >= ((-1)*(saldo))){
            saldoTemporal += saldo;
            if (saldoTemporal < 50000){
                this.saldo = saldoTemporal - descubierto;
            }
        } else System.out.println("Fondos insuficientes");

    }

    public CuentaCorriente(Cliente titular,Long id) {
        super(titular, id);
        super.tipo = 2;
    }
}

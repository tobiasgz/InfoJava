En este repositorio esta la aplicacion de un Banco desarrollada para el informatorio como
parte de un trabajo practico integrador java y maven

Con respecto a las convecciones tenemos las siguientes:


Clientes:
1. Los clientes tienen un ID unico pero pueden tener todas las cuentas que deseen, cada una separada por un ID segun el orden de creacion
2. Es posible transferir dinero entre clientes y/o entre cuentas siempre que tenga montos disponibles o el descubierto sin embargo no es posible traspasar el limite del descubierto

Tanto Caja de Ahorro como Cuenta Corriente:
1. Ambos estan destinados unicamente a Personas fisicas ya que no esta implementado un Cliente que sea una empresa
2. Ambas cuentas generaran intereses, la forma en que se hara se detallara mas adelante en este documento
3. Una vez abierta la cuenta y generada la misma no es posible modificar los datos ni de la cuenta, ni de los clientes


Cuenta Corriente:
 1. Tiene un descubierto actualmente $50.000 que es fijo de momento
 2. En caso de estar en negativo la cuenta generara intereses para que ese saldo negativo siga      
    aumentando como medida para incentivar no quedar en negativo, en caso de generar interes estos pueden superar el limite de descubierto para que quede debiendo aun mas al banco

Caja de Ahorro
1. No tiene disponibilidad de quedar en descubierto
2. En caso de tener plata en la cuenta esta generara intereses (actualmente limitado a un 10% del saldo
)

package CuentasBancarias;

public class Cuenta {

    int saldo, noCuenta;

    public Cuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public void abonar(int saldo) {
        this.saldo += saldo;
        System.out.println("Se acredito saldo en la cuenta No." + this.noCuenta + " con exito.");
    }

    public void debitar(int cantidad) {
        boolean siPuedeDebitar = cantidad <= this.saldo;

        if (siPuedeDebitar) {
            this.saldo -= cantidad;
            System.out.println("Se debito saldo en la cuenta No." + this.noCuenta + " con exito.");
        } else {
            System.out.println("Operacion sin exito.");
        }
    }

    public void consulta() {

        System.out.println("Su saldo actual de la cuenta No." + this.noCuenta + " es de: Q." + this.saldo);
    }

}

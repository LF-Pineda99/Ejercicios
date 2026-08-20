package CuentasBancarias;

public class CrearCuenta {

    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(4512);
        Cuenta segundaCuenta = new Cuenta(1245);
        
        //Abono a cuenta
        primeraCuenta.abonar(1000);
        segundaCuenta.abonar(900);
        
        //Debito a cuenta
        primeraCuenta.debitar(500);
        segundaCuenta.debitar(100);
        
        //Consulta de saldos
        primeraCuenta.consulta();
        segundaCuenta.consulta();
        
    }
}

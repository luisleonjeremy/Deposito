package cuentas;

public class Main {

    public static void main(String[] args) {

        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta(
                "Antonio López",
                "1000-2365-85-1230456789",
                2500,
                0
        );

        saldoActual = cuenta1.estado();

        System.out.println("El saldo actual es " + saldoActual);

        operaciones(cuenta1);

        saldoActual = cuenta1.estado();

        System.out.println("El saldo actual es " + saldoActual);
    }

    /**
     * Método que realiza operaciones de ingreso y retirada.
     *
     * @param cuenta Cuenta bancaria
     */
    public static void operaciones(CCuenta cuenta) {

        cuenta.retirar(2300);
        cuenta.ingresar(685);
    }
    // Comentario para un segundo commit
}
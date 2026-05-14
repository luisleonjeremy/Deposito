package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite realizar operaciones de ingreso y retirada de dinero.
 *
 * @author TuNombre
 * @version 1.0
 * @since 2026
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * Número de cuenta.
     */
    private String cuenta;

    /**
     * Saldo disponible.
     */
    private double saldo;

    /**
     * Tipo de interés de la cuenta.
     */
    private double tipoInteres;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     *
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * Devuelve el saldo actual.
     *
     * @return saldo actual de la cuenta
     */
    public double estado() {
        return saldo;
    }

    /**
     * Permite retirar dinero de la cuenta.
     *
     * @param cantidad Cantidad a retirar
     */
    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta: " + cantidad);

            if (cantidad <= 0) {
                throw new Exception("No se puede retirar una cantidad negativa");
            }

            if (estado() < cantidad) {
                throw new Exception("No hay suficiente saldo");
            }

            saldo = saldo - cantidad;

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Permite ingresar dinero en la cuenta.
     *
     * @param cantidad Cantidad a ingresar
     */
    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta: " + cantidad);

            if (cantidad < 0) {
                throw new Exception("No se puede ingresar una cantidad negativa");
            }

            saldo = saldo + cantidad;

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
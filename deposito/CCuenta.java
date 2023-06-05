package cuentas;

public class CCuenta {
    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
    
    /**
     * Número de la cuenta.
     */
    private String cuenta;
    
    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;
    
    /**
     * Tipo de interés de la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta.
     * 
     * @param nom   Nombre del titular de la cuenta.
     * @param cue   Número de la cuenta.
     * @param sal   Saldo inicial de la cuenta.
     * @param tipo  Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta.
     * 
     * @param cantidad  Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     * 
     * @param cantidad  Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o superior al saldo disponible.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (saldo < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo -= cantidad;
    }
}


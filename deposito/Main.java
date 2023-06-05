package cuentas;

public class Main {

    /**
     * Método que realiza las operaciones con el objeto cuenta1.
     * 
     * @param cantidad Cantidad a ingresar en la cuenta.
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    public static void main(String[] args) {
        operativa_cuenta(695);
    }
}


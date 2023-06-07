public class Main {

    /**
     * Método que realiza las operaciones con el objeto cuenta1.
     * 
     * @param cantidad Cantidad a ingresar en la cuenta.
     */
    public static void operativa_cuenta(float cantidad) {
        // Crear una instancia de la clase CCuenta llamada cuenta1
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        // Obtener el saldo actual de la cuenta y mostrarlo en la consola
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            // Intentar retirar 2300 de la cuenta1
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            // Mostrar mensaje de ingreso en cuenta
            System.out.println("Ingreso en cuenta");
            
            // Intentar ingresar la cantidad especificada en la cuenta1
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    public static void main(String[] args) {
        // Llamar al método operativa_cuenta y pasas un valor.
        operativa_cuenta(695);
    }
}


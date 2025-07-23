package ManejoCadenas;

public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparación de cadenas
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // Comparacion de cadenas (==) comparan la referencia 
        System.out.println("cadena1 == cadena2: " + (cadena1 == cadena2)); // true, porque apuntan al mismo objeto en el pool de cadenas
        // Comparamos cadena1 con cadena3 (referencias no contenido)
        System.out.println("cadena1 == cadena3: " + (cadena1 == cadena3)); // false, porque son objetos diferentes

        // Comparar contenido se usa el metodo equals
        System.out.println("cadena1 es igual en contenido a (cadena3): " + cadena1.equals(cadena3));
    }
}

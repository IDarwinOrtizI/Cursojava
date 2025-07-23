package ManejoCadenas;

public class MetodosDeCadenas {
    public static void main(String[] args) {
        // Ejemplo de métodos de cadenas
        var cadena = "Hola Mundo";
        
        // Longitud de la cadena
        System.out.println("Longitud de la cadena: " + cadena.length());
        
        // Convertir a mayúsculas
        System.out.println("En mayúsculas: " + cadena.toUpperCase());
        
        // Convertir a minúsculas
        System.out.println("En minúsculas: " + cadena.toLowerCase());
        
        // Reemplazar una parte de la cadena
        System.out.println("Reemplazando 'Mundo' por 'Java': " + cadena.replace("Mundo", "Java"));
        
        // Obtener un carácter en una posición específica
        System.out.println("Carácter en la posición 5: " + cadena.charAt(5));
    }
}

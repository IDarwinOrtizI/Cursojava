package ManejoCadenas;

public class ManejoSubCadenas {
    public static void main(String[] args) {
        // Tema de subcadenas
        var cadena = "Hola Mundo";
        System.out.println("Cadena original: " + cadena);

        // Subcadena 
        var subcadena1 = cadena.substring(0, 4); // "Hola"
        System.out.println("Subcadena de 0 a 4: " + subcadena1);

        // var subcadena2 = cadena.substring(5); // "Mundo"
        var subcadena2 = cadena.substring(5, 10); // "Mundo"
        System.out.println("Subcadena de 0 a 4: " + subcadena2);
    }
}

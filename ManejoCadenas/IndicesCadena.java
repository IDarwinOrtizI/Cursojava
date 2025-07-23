package ManejoCadenas;

public class IndicesCadena {
    public static void main(String[] args) {
        // manejo de indices en cadenas
        var cadena = "Hola Mundo";
        

        // Recuperar el primer caracter
        var primerCaracter = cadena.charAt(0);
        System.out.println("primerCaracter= " + primerCaracter);
        // Recuperar el ultimo caracter
        var ultimoCaracter = cadena.charAt(cadena.length() - 1);
        System.out.println("ultimoCaracter= " + ultimoCaracter);
        // Ejercicio
        var caractermid= cadena.charAt(0 + (cadena.length() - 1) / 2); //cuentan espacios
        System.out.println("caractermid= " + caractermid);
    }
}

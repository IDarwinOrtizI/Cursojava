package ManejoCadenas;

public class CadenasEnJava {
    public static void main(String[] args) {
        System.out.println("Manejo de Cadenas en Java");
        var cadena = "Hola ";
        System.out.println("cadena= " + cadena);
        var cadena2 = new String("Mundo");
        System.out.println("cadena2= " + cadena2);
        var cadena3 = cadena + cadena2;
        System.out.println("cadena3= " + cadena3);

        // Cadena multiples lineas (text block)
        var cadena4 = """
                Este es un ejemplo
                de una cadena
                que ocupa varias lineas.
                """;
        System.out.println("cadena4= " + cadena4);
    }
}

package ManejoCadenas;

public class InmutabilidadCadenas {
    public static void main(String[] args) {
        // manejo de inmutabilidad de cadenas
        var cadena = "Hola";
        System.out.println("cadena= " + cadena);
        
        var cadena2 = cadena;
        cadena = "Adios";
        System.out.println("cadena= " + cadena);
        System.out.println("cadena2= " + cadena2);
    }
}

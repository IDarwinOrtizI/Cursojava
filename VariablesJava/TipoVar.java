package VariablesJava;

public class TipoVar {
    public static void main(String[] args) {
        // sin uso de var
        String nombre = "Darwin";
        System.out.println("Nombre: " + nombre);
        // uso de var
        var nombre2 = "Sebastian";
        System.err.println("Nombre2: " + nombre2);
        var edad = 22;
        System.out.println("edad" +edad);
        var sueldo = 1000.50;
        System.out.println("Sueldo: " + sueldo);
        var disponible = true;
        System.out.println("Disponible: " + disponible);

        // se debe inicializar la variable en la misma linea 

        // se debe poder inferir el tipo de dato
        //var apellido = null  Esto generará un error de compilación porque no se puede inferir el tipo de dato de null
    }
}

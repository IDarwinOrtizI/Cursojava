package VariablesJava;

public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros (su valor default es 0)
        byte tipobyte = 127; // 8 bytes
        System.out.println("tipobyte: " + tipobyte);
        short tiposhort = 32767; // 16 bytes
        System.out.println("tiposhort: " + tiposhort);
        int tipoInt = 2147483647; // 32 bytes
        System.out.println("tipoInt: " + tipoInt);
        long tipoLong = 987654321098765432L; // 64 bytes // L o l al final para indicar que es un long
        System.out.println("tipoLong: " + tipoLong);    


        // punto flotante (Valor default 0.0)
        float tipoFloat = 3.14F; // 32 bytes // F o f al final para indicar que es un float
        System.out.println("tipoFloat: " + tipoFloat);
        double tipoDouble = 3.1415D; // 64 bytes  // D o d al final para indicar que es un double (Opcional)
        System.out.println("tipoDouble: " + tipoDouble);


        // Caracteres ('\u0000' es el valor por defecto)
        char tipoChar = 'A'; // Caracteres del juego unicode, 16 bytes
        System.out.println("tipoChar: " + tipoChar);
        tipoChar = 65; // También se puede asignar un valor numérico (65 = 'A' en unicode)
        System.out.println("tipoChar (numérico): " + tipoChar); 


        // Booleanos  (false)
        boolean tipoBoolean = true; // 1 byte
        System.out.println("tipoBoolean: " + tipoBoolean);  
        tipoBoolean = false; // También puede ser false
        System.out.println("tipoBoolean: " + tipoBoolean);


        // Tipos Object (Referencia)
        String nombre = null; // Por defecto es null
        System.out.println("nombre: " + nombre);

        nombre = "Darwin Ortiz"; // Asignación de un valor
        System.out.println("nombre: " + nombre);
    }
}

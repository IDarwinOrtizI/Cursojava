package VariablesJava;

public class EjercicioReserva {
    public static void main(String[] args) {
        String nombre = "Darwin Ortiz";
        byte DiasEstancia = 5;
        double tarifaDiaria = 90.50;
        boolean vistaAlMar = true;

        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Dias De Instancia: " + DiasEstancia);
        System.out.println("TarifaDiaria: " + tarifaDiaria);
        System.out.println("Cuenta con vista al mar?: " + vistaAlMar);

        nombre = "Darwin Ortiz";
        DiasEstancia = 7;
        tarifaDiaria = 200.50;
        vistaAlMar = false;

        System.out.println();
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Dias De Instancia: " + DiasEstancia);
        System.out.println("TarifaDiaria: " + tarifaDiaria);
        System.out.println("Cuenta con vista al mar?: " + vistaAlMar);

    }
}

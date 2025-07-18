package VariablesJava;

public class EjercicioTienda {
    public static void main(String[] args) {
        System.out.println("*** Tienda de Productos ***");
        String producto1 = "Iphone 15 pro max";
        double precio1 = 4700000.00;
        int cantidad1 = 5;
        boolean disponible1 = true;

        // Imprimir detalles del producto 1
        System.out.println("Producto: " + producto1);
        System.out.println("Precio: $" + precio1);  
        System.out.println("Cantidad disponible: " + cantidad1);
        System.out.println("Disponible: " + (disponible1 ? "Sí" : "No"));

        // Modificar los valores del producto 1
        producto1 = "Iphone 12 pro max";
        precio1 = 4500000.00;
        cantidad1 = 0;
        disponible1 = false;

        // Imprimir los nuevos detalles del producto 1
        System.out.println();
        System.out.println("Producto: " + producto1);
        System.out.println("Precio: $" + precio1);  
        System.out.println("Cantidad disponible: " + cantidad1);
        System.out.println("Disponible: " + (disponible1 ? "Sí" : "No"));

    }
}

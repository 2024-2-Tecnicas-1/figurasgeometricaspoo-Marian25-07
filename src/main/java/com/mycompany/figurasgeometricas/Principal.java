package com.mycompany.figurasgeometricas;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar nombre y color de la figura
        System.out.println("Ingrese el nombre de la figura:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el color de la figura:");
        String color = sc.nextLine();

        // Seleccionar tipo de figura
        System.out.println("Seleccione el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo):");
        int tipoFigura = sc.nextInt();

        FiguraGeometrica figura = null;

        // Solicitar los datos necesarios para cada tipo de figura
        switch (tipoFigura) {
            case 1 -> {
                System.out.println("Ingrese el radio del círculo:");
                double radio = sc.nextDouble();
                figura = new Circulo(nombre, color, radio);
            // Complejidad temporal: O(1) - Crear objeto Círculo
            }
            case 2 -> {
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2 = sc.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
            // Complejidad temporal: O(1) - Crear objeto Rectángulo
            }
            case 3 -> {
                System.out.println("Ingrese el valor de la base del triángulo:");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double altura = sc.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
            // Complejidad temporal: O(1) - Crear objeto Triángulo
            }
            default -> System.out.println("Opción no válida.");
        }

        // Mostrar resultados si se ha creado una figura
        if (figura != null) {
            System.out.println("Área de la figura: " + figura.obtenerArea());
            System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());
        // Complejidad temporal: O(1) - Llamadas a métodos constantes
        }

        sc.close();
        // Complejidad temporal: O(1) - Cierre del Scanner
    }
}
    


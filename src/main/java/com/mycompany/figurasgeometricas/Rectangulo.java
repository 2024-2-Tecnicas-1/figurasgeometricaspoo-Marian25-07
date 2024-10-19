package com.mycompany.figurasgeometricas;

/**
 *
 * @author kerly
 */
class Rectangulo extends FiguraGeometrica{
   
    private double lado1, lado2;

    public Rectangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);  // Llamada al constructor de la superclase/
        this.lado1 = lado1;
        this.lado2 = lado2;
        // Complejidad temporal: O(1) - Asignación de variables simples
    }

    @Override
    public double obtenerArea() {
        return lado1 * lado2;  // Fórmula del área del rectángulo
        // Complejidad temporal: O(1) - Fórmula matemática simple
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);  // Fórmula del perímetro del rectángulo
        // Complejidad temporal: O(1) - Fórmula matemática simple
    }

    public double getLado1() {
        return lado1;
        // Complejidad temporal: O(1)
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
        // Complejidad temporal: O(1)
    }

    public double getLado2() {
        return lado2;
        // Complejidad temporal: O(1)
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
        // Complejidad temporal: O(1)
    }
}
 


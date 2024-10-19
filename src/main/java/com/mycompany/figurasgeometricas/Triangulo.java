package com.mycompany.figurasgeometricas;

/**
 *
 * @author kerly
 */
class Triangulo extends FiguraGeometrica {
    private double base, altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
        // Complejidad temporal: O(1) - Asignación de variables simples
    }

    @Override
    public double obtenerArea() {
        return (base * altura) / 2;  // Fórmula del área del triángulo
    // Complejidad temporal: O(1) - Fórmula matemática simple
    }

    @Override
    public double obtenerPerimetro() {
        return 3 * base;  // Perímetro asumiendo triángulo equilátero
    // Complejidad temporal: O(1) - Fórmula matemática simple
    }

    public double getBase() {
        return base;
    // Complejidad temporal: O(1)
    }

    public void setBase(double base) {
        this.base = base;
    // Complejidad temporal: O(1)
    }

    public double getAltura() {
        return altura;
    // Complejidad temporal: O(1)
    }

    public void setAltura(double altura) {
        this.altura = altura;
    // Complejidad temporal: O(1)
    }
}

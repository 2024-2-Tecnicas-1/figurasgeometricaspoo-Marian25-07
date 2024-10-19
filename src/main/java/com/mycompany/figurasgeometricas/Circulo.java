package com.mycompany.figurasgeometricas;

/**
 *
 * @author kerly
 */
class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);  // Llamada al constructor de la superclase
        this.radio = radio;
         // Complejidad temporal: O(1) - Asignación de variables simples
    }
    @Override 
    public double obtenerArea() {
        return Math.PI * radio * radio;  // Fórmula del área del círculo
         // Complejidad temporal: O(1) - Fórmula matemática simple
    }
    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;  // Fórmula del perímetro del círculo
         // Complejidad temporal: O(1) - Fórmula matemática simple
    }

    public double getRadio() {
        return radio;
        // Complejidad temporal: O(1)
    }

    public void setRadio(double radio) {
        this.radio = radio;
        // Complejidad temporal: O(1)
    }
}
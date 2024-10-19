package com.mycompany.figurasgeometricas;
/**
 *
 * @author kerly
 */
public class FiguraGeometrica {
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
        // Complejidad temporal: O(1) - Asignación de variables simples
    }

    // Métodos getter y setter para acceder a los atributos privados
    public String getNombre() {
        return nombre;
        // Complejidad temporal: O(1)
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        // Complejidad temporal: O(1)
    }

    public String getColor() {
        return color;
        // Complejidad temporal: O(1)
        
    }

    public void setColor(String color) {
        this.color = color;
        // Complejidad temporal: O(1)
    }

    // Métodos por defecto para sobreescribir en clases derivadas
    public double obtenerArea() {
        return 0;
        // Complejidad temporal: O(1)
    }

    public double obtenerPerimetro() {
        return 0;
        // Complejidad temporal: O(1)
    }
}  

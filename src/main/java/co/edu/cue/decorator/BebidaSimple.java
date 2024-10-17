package co.edu.cue.decorator;

// BebidaSimple.java
public class BebidaSimple implements Bebida {
    @Override
    public String obtenerDescripcion() {
        return "Bebida simple";
    }

    @Override
    public double costo() {
        return 1.0; // Costo base de la bebida simple
    }
}

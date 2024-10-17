package co.edu.cue.decorator;

// DecoradorConSirope.java
public class DecoradorConSirope extends DecoradorBebida {
    public DecoradorConSirope(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", con sirope";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.6; // Añade el costo del sirope
    }
}

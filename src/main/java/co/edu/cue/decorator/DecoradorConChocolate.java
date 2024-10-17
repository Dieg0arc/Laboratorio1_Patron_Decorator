package co.edu.cue.decorator;


// DecoradorConChocolate.java
public class DecoradorConChocolate extends DecoradorBebida {
    public DecoradorConChocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion() + ", con chocolate";
    }

    @Override
    public double costo() {
        return bebida.costo() + 0.7; // Añade el costo del chocolate
    }
}
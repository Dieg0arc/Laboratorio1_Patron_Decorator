package co.edu.cue.decorator;

// DecoradorBebida.java
public abstract class DecoradorBebida implements Bebida {
    protected Bebida bebida;

    public DecoradorBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public String obtenerDescripcion() {
        return bebida.obtenerDescripcion();
    }

    @Override
    public double costo() {
        return bebida.costo();
    }
}

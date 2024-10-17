package co.edu.cue.decorator;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear una bebida simple
        Bebida bebida = new BebidaSimple();
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Añadir sirope a la bebida
        bebida = new DecoradorConSirope(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Añadir crema a la bebida
        bebida = new DecoradorConCrema(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());

        // Añadir chocolate a la bebida
        bebida = new DecoradorConChocolate(bebida);
        System.out.println(bebida.obtenerDescripcion() + " $" + bebida.costo());
    }
}

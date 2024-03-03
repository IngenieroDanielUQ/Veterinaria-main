package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Mascota animal = new Mascota("Pamela", "Perro", "Pinscher", (byte) 2, "Femenino", "Negro", (float) 3.4);
        System.out.println("Datos de la mascota");
        System.out.println(animal);
        animal.toString();
    }
}
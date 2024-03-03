package co.edu.uniquindio.poo;


import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; // Aserciones de JUnit 5

public class MascotaTest {

    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");

        Mascota animal = new Mascota("Pamela", "Perro", "Pinscher", (byte) 2, "Femenino", "Negro", (float) 3.4f);

        assertEquals("Pamela", animal.nombre());
        assertEquals("Perro", animal.especie());
        assertEquals("Pinscher", animal.raza());
        assertEquals(2, animal.edad());
        assertEquals("Femenino", animal.genero());
        assertEquals("Negro", animal.color());
        assertEquals(3.4f, animal.peso());

        System.out.println("Datos completos");
        LOG.info("Finalizando test datos COMPLETOS");
    }

    @Test
    public void datosVacios() {
        LOG.info("Inicio datos vacios");
        assertThrows(Throwable.class, () -> new Mascota("", "", "", (byte) 0, "", "", 0f));
        LOG.info("Finalización de datos vacios");
    }

    @Test
    public void edadNegativa() {
        LOG.info("Inicio edad negativa");
        assertThrows(Throwable.class, () -> new Mascota("Pamela", "Perro", "Pinscher", (byte) -2, "Femenino", "Negro", 3.4f));
        LOG.info("Finalización de edad negativa");
    }

    @Test
    public void pesoNegativo() {
        LOG.info("Inicio peso negativo");
        assertThrows(Throwable.class, () -> new Mascota("Pamela", "Perro", "Pinscher", (byte)2, "Femenino", "Negro", -3.4f));
        LOG.info("Finalización de peso negativo");
    }

    @Test
    public void datosNull() {
        LOG.info("Iniciado test datos nulos");
        assertThrows(Throwable.class, () -> new Mascota(null, null, null, (byte)0, null, null, 0));
        LOG.info("Finalizando test datos Nulos");
    }
}
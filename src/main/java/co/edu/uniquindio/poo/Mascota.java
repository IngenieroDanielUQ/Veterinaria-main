package co.edu.uniquindio.poo;


public record Mascota(
    String nombre,
    String especie,
    String raza,
    byte edad,
    String genero,
    String color,
    float peso
) {

    public Mascota(String nombre, String especie, String raza, byte edad, String genero, String color, float peso) {
        // Validar nombre no vacío
        if (nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        // Validar especie no vacía
        if (especie.isEmpty()) {
            throw new IllegalArgumentException("La especie no puede estar vacía");
        }

        // Validar raza no vacía
        if (raza.isEmpty()) {
            throw new IllegalArgumentException("La raza no puede estar vacía");
        }

        // Validar edad positiva
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser un valor positivo");
        }

        // Validar genero no vacío
        if (genero.isEmpty()) {
            throw new IllegalArgumentException("El genero no puede estar vacío");
        }

        // Validar color no vacío
        if (color.isEmpty()) {
            throw new IllegalArgumentException("El color no puede estar vacío");
        }

        // Validar peso positivo
        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser un valor positivo");
        }

        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.genero = genero;
        this.color = color;
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return 
                "\n" + //
                                        "Nombre:" + nombre + 
                "\n" + //
                                        "Especie: " + especie +  
                "\n" + //
                                        "Raza: " + raza +
                "\n" + //
                                        "Edad: " + edad +
                "\n" + //
                                        "Genero: " + genero +
                "\n" + //
                                        "Color:" + color +
                "\n" + //
                                        "" + //
                                        "Peso en KG:" + peso;
    }
}
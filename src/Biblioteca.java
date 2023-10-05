import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Atributos
    private List<Libro> librosDisponibles;

    // Constructor
    public Biblioteca() {
        this.librosDisponibles = new ArrayList<>();
    }

    // Métodos
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibrosDisponibles() {
        for (Libro libro : librosDisponibles) {
            System.out.println(libro);
        }
    }
}
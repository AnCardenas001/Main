import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("El código Da Vinci", "Dan Brown", 656);
        Libro libro3 = new Libro("1984", "George Orwell", 326);
        Libro libro4 = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
        Libro libro5 = new Libro("La Odisea", "Homero", 448);

        bibliotecaKonradLorenz.registrarLibro(libro1);
        bibliotecaKonradLorenz.registrarLibro(libro2);
        bibliotecaKonradLorenz.registrarLibro(libro3);
        bibliotecaKonradLorenz.registrarLibro(libro4);
        bibliotecaKonradLorenz.registrarLibro(libro5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el título del libro que desea buscar: ");
        String tituloBuscado = scanner.nextLine();

        Libro libroEncontrado = bibliotecaKonradLorenz.buscarLibro(tituloBuscado);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado.toString());
        } else {
            System.out.println("Libro no encontrado.");
        }

        System.out.println("Libros Disponibles:");
        bibliotecaKonradLorenz.mostrarLibrosDisponibles();
    }
}

public class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Método toString para obtener una representación en cadena del libro
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Número de Páginas: " + numeroPaginas;
    }
}
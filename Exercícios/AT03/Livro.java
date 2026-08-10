public class Livro {
    String titulo;
    String autor;
    int paginas;
    int publicacao;

    public Livro(String titulo, String autor, int paginas, int publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.publicacao = publicacao;
    }

    @Override
    public String toString() {
        return " Título: " + titulo +
                " \nAutor: " + autor +
                " \nNúmero de páginas: " + paginas +
                " \nAno de publicação: " + publicacao;
    }
}

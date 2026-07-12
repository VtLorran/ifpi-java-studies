import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private Autor autor;
    private List<Capitulo> capitulos;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = new ArrayList<>();
    }

    public void adicionarCapitulo(String tituloCapitulo, int numero) {
        Capitulo capituloNovo = new Capitulo(tituloCapitulo, numero);
        this.capitulos.add(capituloNovo);
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Capitulo> getCapitulos() {
        return new ArrayList<>(capitulos);
    }
}

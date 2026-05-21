public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("J.K Rowling");

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", autor);
        livro1.adicionarCapitulo("O menino que sobreviveu", 1);
        livro1.adicionarCapitulo("O vidro que sumiu", 2);
        livro1.adicionarCapitulo("As cartas de ninguém", 3);

        Livro livro2 = new Livro("Harry Potter e a Câmara Secreta", autor);
        livro2.adicionarCapitulo("O pior aniversário", 1);
        livro2.adicionarCapitulo("O aviso de Dobby", 2);
        livro2.adicionarCapitulo("A Toca", 3);

        Livro livro3 = new Livro("Harry Potter e o Prisioneiro de Azkaban", autor);
        livro3.adicionarCapitulo("O berrador", 1);
        livro3.adicionarCapitulo("O Erros de Tia Guida", 2);
        livro3.adicionarCapitulo("O Nôitibus Andante", 3);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Dona Marcinha");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        /* -------- || -------- */

        System.out.println("Seja bem vindo à " + biblioteca.getNome());
        
        for (Livro l : biblioteca.getLivros()) {
            System.out.println("Livro: " + l.getTitulo());
            System.out.println("Autor: " + l.getAutor().getNomeAutor());
            System.out.println("Capítulos: ");
            l.getCapitulos().forEach(c -> 
                System.out.println("  [Cap. " + c.getNumeroCapitulo() + "] " + c.getTituloCapitulo())
            );
        }
    }
}
package src.main.java.com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca();
        
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("Duna", "Frank Herbert", 1965);
        Livro livro3 = new Livro("1984", "George Orwell", 1949);
        Livro livro4 = new Livro("1984", "Georgei Orwelli", 1950);
        
        biblioteca1.adicionarLivro(livro1);
        biblioteca1.adicionarLivro(livro2);
        biblioteca1.adicionarLivro(livro3);
        biblioteca1.adicionarLivro(livro4);
        
        
        //biblioteca1.removerLivro("O Senhor dos Anéis");
        
        biblioteca1.listarLivros();
    }
}

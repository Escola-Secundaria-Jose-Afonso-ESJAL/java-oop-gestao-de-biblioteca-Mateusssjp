package  src.main.java.com.example;

import java.util.ArrayList;

public class Biblioteca {
    private static final int MAX_LIVROS = 100; // Variável de classe
    private ArrayList<Livro> livros; // Variável de instância

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public boolean adicionarLivro(Livro livro) {
        if (livros.size() < MAX_LIVROS) {
            for (int i = 0; i < livros.size(); i++) {
                if (livros.get(i).getTitulo() != livro.getTitulo()) {
                    livros.add(livro); 
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean removerLivro(String titulo) {
        return true;
    }

    public void listarLivros() 
    {
        System.out.println("Livros disponíveis:");
        
        for (int i = 0; i < livros.size(); i++) 
        {
            Livro livrosDisponiveis = livros.get(i);
            System.out.println(
                livrosDisponiveis.getTitulo() + 
                " | Autor: " + livrosDisponiveis.getAutor() +
                " | Ano: " + livrosDisponiveis.getAno()
            );
        }
        
        System.out.print("\n");
    }
}

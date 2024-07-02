package exercicio4.model;

import java.io.Serializable;

public class Livro extends ItemBiblioteca implements Aluguel{

    public Livro(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void alugarItem(String NomeCliente) {
        System.out.println(NomeCliente+" alugou o livro "+this.titulo+".");
        this.disponivel = false;
    }

    @Override
    public void retornaItem() {
        System.out.println("Livro "+this.titulo+" devolvido com sucesso.");
        this.disponivel = true;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Autor do livro: "+this.autor);
        System.out.println("Titulo do livro: "+this.titulo);
        System.out.println("Disponibilidade do livro: "+this.disponivel);
    }
}

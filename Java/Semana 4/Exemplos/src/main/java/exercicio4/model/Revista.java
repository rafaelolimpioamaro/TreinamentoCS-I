package exercicio4.model;


public class Revista extends ItemBiblioteca implements Aluguel{

    public Revista(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void alugarItem(String NomeCliente) throws Exception {
        if (this.disponivel == false){
            throw new Exception("Erro: O item "+this.titulo+" já está sendo alugado.");
        }
        else{
            System.out.println(NomeCliente+" alugou a revista "+this.titulo+".");
            this.disponivel = false;
        }

    }

    @Override
    public void retornaItem() {
        System.out.println("Livro "+this.titulo+" devolvido com sucesso.");
        this.disponivel = true;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Autor da revista: "+this.autor);
        System.out.println("Titulo da revista: "+this.titulo);
        System.out.println("Disponibilidade da revista: "+this.disponivel);
    }
}

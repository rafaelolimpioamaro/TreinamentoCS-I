package exercicio4.model;

public abstract class ItemBiblioteca {
    protected String titulo;
    protected String autor;
    protected boolean disponivel;


    public ItemBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    abstract void mostrarDetalhes();

    void checarStatus(){
        if(disponivel)
            System.out.println("Status do item "+this.titulo+" : Disponivel");
        else
            System.out.println("Status  do item "+this.titulo+" : Aprovado");
    }
}

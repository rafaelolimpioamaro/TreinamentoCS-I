package exercicio4.controller;

import exercicio4.model.ItemBiblioteca;
import exercicio4.model.Livro;
import exercicio4.model.Revista;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Crime e castigo","Fiódor Dostoiévski");
        Livro livro2 = new Livro("Assim Falou Zaratustra","Friedrich Nietzsche");
        Livro livro3 = new Livro("O Príncipe","Nicolau Maquíavel");

        Revista revista1 = new Revista("Proposta Indecente","Veja");
        Revista revista2 = new Revista("A Derrota do Consórcio","Oeste");
        Revista revista3 = new Revista("Coleções","Vogue");

        livro1.alugarItem("João");
        livro1.mostrarDetalhes();
        livro1.retornaItem();
        livro1.mostrarDetalhes();

        try{
            revista1.alugarItem("Maria");
            revista1.mostrarDetalhes();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            revista1.alugarItem("João");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

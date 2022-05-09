package Aluno.Atividade1;

public class Main {
    public static void main(String[] args) throws Exception{
        Livro livro = new Livro(1847, "O Morro dos Ventos Uivantes", "Emily Bronte");
        System.out.println("Título: "+livro.getTitulo()+"\nAutor(a): "+livro.getAutor()+"\nAno: "+livro.getAno());
    }
}

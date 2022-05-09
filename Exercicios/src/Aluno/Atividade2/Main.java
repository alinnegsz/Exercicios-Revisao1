package Aluno.Atividade2;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Emily Bronte", "emilybronte@gmail.com", 'f');
        Author author2 = new Author("Lucy Maud Montgomery", "montgomerylucy@gmail.com", 'f');
        
        Book book = new Book("O Morro dos Ventos Uivantes", author, 29.99);
        Book book2 = new Book("Anne da Ilha", author2, 16.00, 17);
        
        book.setQty(36);

        //testando todos os métodos
        System.out.println("\nAuthor\nNome: "+author.getName()+"\nEmail: "+author.getEmail()+"\nGênero (f ou m): "+author.getGender());
        System.out.println("\nTestando o método toString()\n");
        System.out.println(author.toString());

        System.out.println("Author\nNome: "+author2.getName()+"\nEmail: "+author2.getEmail()+"\nGênero (f ou m): "+author2.getGender());
        System.out.println("\nTestando o método toString()\n");
        System.out.println(author2.toString());

        System.out.println("\nBook\nTítulo: "+book.getName()+"\n"+book.getAuthor()+"\nPreço: "+book.getPrice()+"\nQuantidade: "+book.getQty());
        System.out.println("\nTestando o método toString()\n");
        System.out.println(book.toString());

        System.out.println("\nBook\nTítulo: "+book2.getName()+"\n"+book2.getAuthor()+"\nPreço: "+book2.getPrice()+"\nQuantidade: "+book2.getQty());
        System.out.println("\nTestando o método toString()\n");
        System.out.println(book2.toString());
    }
}

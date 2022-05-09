package Aluno.Atividade2;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author.toString();
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    @Override
    public String toString() {
        return "Book [author=" + author + ", name=" + name + ", price=" + price + ", qty=" + qty + "]";
    }
    
}

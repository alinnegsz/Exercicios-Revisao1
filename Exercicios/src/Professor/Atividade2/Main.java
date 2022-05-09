package Professor.Atividade2;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(0001, 1200.99, "PC da Positivo");
        Produto produto2 = new Produto(0002, 2000.00, "Iphone 6");

        ItemPedido itemPedido = new ItemPedido(produto1, 1);
        ItemPedido itemPedido2 = new ItemPedido(produto2, 2);

        Pedido pedido = new Pedido();

        pedido.adicionar_item(itemPedido);
        pedido.adicionar_item(itemPedido2);

        System.out.println("-----Detalhes do Pedido-----");
        pedido.verItens();
        System.out.println("\nValor total: "+pedido.getValor_total());
    }
}

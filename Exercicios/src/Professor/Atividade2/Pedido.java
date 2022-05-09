package Professor.Atividade2;

import java.util.ArrayList;
import java.util.Iterator;

public class Pedido {
    private ArrayList<ItemPedido> itens;
    private double valor_total;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionar_item(ItemPedido it) {
        itens.add(it);
        double valorItem;
        valorItem = it.getProduto().getValor() * it.getQuantidade();
        atualizaValorTotal(valorItem);
    }

    private void atualizaValorTotal(double valor) {
        this.valor_total = this.valor_total + valor;
    }

    public void verItens(){
        Iterator it = itens.iterator();
        ItemPedido item;
        while(it.hasNext()){
            item = (ItemPedido) it.next();
            System.out.println("\nNome: "+item.getProduto().getDescricao()+"\nValor unitário: "+item.getProduto().getValor()+"\nQuantidade: "+item.getQuantidade());
        }
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(float valor_total) {
        this.valor_total = valor_total;

    }

}

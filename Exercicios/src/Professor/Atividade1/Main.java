package Professor.Atividade1;

public class Main {
    public static void main(String[] args) throws Exception {
        Jogador jogador = new Jogador(12, "Marcelo", true);
        System.out.println("Nome: "+jogador.getNome()+"\nPontuação: "+jogador.getPontuacao()+"\nAtivado: "+jogador.isAtivado());
    }
}

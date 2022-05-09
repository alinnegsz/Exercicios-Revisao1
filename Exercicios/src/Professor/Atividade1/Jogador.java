package Professor.Atividade1;

public class Jogador {
    private double pontuacao;
    private String nome;
    private boolean ativado;

    public Jogador(double pontuacao, String nome, boolean ativado) {
        this.pontuacao = pontuacao;
        this.nome = nome;
        this.ativado = ativado;
    }

    public double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAtivado() {
        return ativado;
    }

    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }
}

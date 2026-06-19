public class JogadorSintetico extends Jogador {

    public JogadorSintetico(String nome, char cor) {
        super(nome, cor);
    }
    public boolean jogar(Tabuleiro tabuleiro, String nomeDaPeca, int numeroDaCasa) {
        System.out.println("Jogador Sintético fez sua jogada.");
        return true;
    }
}

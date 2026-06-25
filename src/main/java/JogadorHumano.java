public class JogadorHumano extends Jogador {
    public JogadorHumano(String nome, char cor) {
        super(nome, cor); 
    }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String NomeDaPeca, int numeroDaCasa) {
        System.out.println(getNome() + " (Humano) fez sua jogada com " + NomeDaPeca);
        return true;
    }
}

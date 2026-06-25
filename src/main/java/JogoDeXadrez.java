public class JogoDeXadrez implements Jogo {

    public static void main(String[] args) {
        JogoDeXadrez partida = new JogoDeXadrez();
        partida.iniciar();
        System.out.println("Gemini AI");
    }

    @Override
    public void iniciar() {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador1 = new JogadorHumano("Humano", 'b');
        Jogador jogador2 = new JogadorSintetico("Sintetico", 'p');

        while (!tabuleiro.acabouOJogo()) {
            jogador1.jogar(tabuleiro, "P1b", 12);
            if (tabuleiro.acabouOJogo()) {
                break;
            }
            jogador2.jogar(tabuleiro, "H1p", 24);
            break; 
        }
    }
}

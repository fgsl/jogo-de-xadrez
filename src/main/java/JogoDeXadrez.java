class JogoDeXadrez implements Jogo{
    public static void main(String[] args) {
        System.out.println("Felipe Fonseca Sanches");
    }
    public void iniciar() {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador1 = new JogadorHumano("Humano");
        Jogador jogador2 = new JogadorSintetico("Sintetico");

        while (!tabuleiro.acabouOJogo()) {
            jogador1.jogar();
            if (tabuleiro.acabouOJogo()) {
                break;
            }
            jogador2.jogar();
        }
    @Override
    public void iniciar() {
        Tabuleiro tabuleiro = new Tabuleiro();
        Jogador jogador1 = new JogadorHumano("Humano", 'b');
        Jogador jogador2 = new JogadorSintetico("Sintetico", 'p');

        while (!tabuleiro.acabouOJogo()) {
            jogador1.jogar(tabuleiro, "Peão", 12);
            if (tabuleiro.acabouOJogo()) {
                break;
            }
            jogador2.jogar(tabuleiro, "Cavalo", 24);
        }
    }

    public static void main(String[] args) {
        JogoDeXadrez partida = new JogoDeXadrez();
        partida.iniciar();
        System.out.println("SEU NOME COMPLETO"); 
    }
}


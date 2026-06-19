import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class JogoDeXadrez extends Jogo {

    public JogoDeXadrez() {
        this.tabuleiro = new Tabuleiro();
        this.jogador1 = new JogadorHumano("Felipe", 'b');
        this.jogador2 = new JogadorSintetico("IA-Bot", 'p');
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando partida de Xadrez...");
        tabuleiro.mostrarTabuleiro();
        
        if (!tabuleiro.acabouOJogo()) {
            System.out.println("O jogo está em andamento.");
        }
    }

    public static void main(String[] args) {
        JogoDeXadrez partida = new JogoDeXadrez();
        partida.iniciar();
    }
}

abstract class Jogo {
    protected Tabuleiro tablero; 
    protected Tabuleiro tabuleiro; 
    protected Jogador jogador1;
    protected Jogador jogador2;

    public abstract void iniciar();
}

class Tabuleiro {
    private Peca[][] casas; 

    public Tabuleiro() {
        this.casas = new Peca[8][8]; 
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        casas[0][0] = new Torre(1, 'b'); 
        casas[0][1] = new Cavalo(1, 'b');
        casas[0][2] = new Bispo(1, 'b');
        casas[0][3] = new Rainha(1, 'b');
        casas[0][4] = new Rei(1, 'b');
        casas[0][5] = new Bispo(2, 'b');
        casas[0][6] = new Cavalo(2, 'b');
        casas[0][7] = new Torre(2, 'b');
        
        for (int i = 0; i < 8; i++) {
            casas[1][i] = new Peao(i + 1, 'b');
        }
    }

    public void mostrarTabuleiro() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (casas[i][j] != null) {
                    System.out.print(casas[i][j].getNome() + " "); 
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }

    public boolean acabouOJogo() {
        return false;
    }
}

interface JogadorInterface {
    boolean jogar(Tabuleiro tabuleiro, String nomeDaPeca, int numeroDaCasa);
}

abstract class Jogador implements JogadorInterface {
    private String nome;
    private char cor;

    public Jogador(String nome, char cor) {
        if (cor != 'b' && cor != 'p') {
            throw new IllegalArgumentException("A cor deve ser 'p' (preta) ou 'b' (branca).");
        }
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() { return nome; }
    public char getCor() { return cor; }
}

class JogadorHumano extends Jogador {
    public JogadorHumano(String nome, char cor) { super(nome, cor); }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String nomeDaPeca, int numeroDaCasa) {
        System.out.println("Jogador Humano " + getNome() + " jogou.");
        return true;
    }
}

class JogadorSintetico extends Jogador {
    public JogadorSintetico(String nome, char cor) { super(nome, cor); }

    @Override
    public boolean jogar(Tabuleiro tabuleiro, String nomeDaPeca, int numeroDaCasa) {
        System.out.println("Jogador Sintético " + getNome() + " jogou.");
        return true;
    }
}

abstract class Peca {
    private String nome;

    public Peca(String tipo, int numero, char cor) {
        this.nome = tipo + numero + cor;
    }

    public String getNome() { return this.nome; }
}

class Rei extends Peca { public Rei(int n, char c) { super("K", n, c); } }
class Rainha extends Peca { public Rainha(int n, char c) { super("Q", n, c); } }
class Torre extends Peca { public Torre(int n, char c) { super("T", n, c); } }
class Bispo extends Peca { public Bispo(int n, char c) { super("B", n, c); } }
class Cavalo extends Peca { public Cavalo(int n, char c) { super("H", n, c); } }
class Peao extends Peca { public Peao(int n, char c) { super("P", n, c); } }

public abstract class Jogador {
    private char simbolo;
    private String nome;

    public Jogador(String nome, char simbolo) {
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return this.simbolo;
    }

    public String getNome() {
        return this.nome;
    }
}
public abstract class Jogador implements JogadorInterface {
    private String nome;
    private char cor;

    public Jogador(String nome, char cor) {
        if (cor != 'p' && cor != 'b') {
            throw new IllegalArgumentException("A cor deve ser 'p' (preta) ou 'b' (branca).");
        }
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return this.nome;
    }

    public char getCor() {
        return this.cor;
    }
}

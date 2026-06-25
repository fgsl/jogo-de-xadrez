public abstract class Peca {
    private String nome;

    public Peca(String tipo, int numero, char cor) {
        this.nome = tipo + numero + cor;
    }

    public String getNome() {
        return this.nome;
    }
}

class Rei extends Peca { public Rei(int n, char c) { super("K", n, c); } }
class Rainha extends Peca { public Rainha(int n, char c) { super("Q", n, c); } }
class Torre extends Peca { public Torre(int n, char c) { super("T", n, c); } }
class Bispo extends Peca { public Bispo(int n, char c) { super("B", n, c); } }
class Cavalo extends Peca { public Cavalo(int n, char c) { super("H", n, c); } }
class Peao extends Peca { public Peao(int n, char c) { super("P", n, c); } }


private String[][] casas = new String[8][8];

public class Tabuleiro {
    private Peca[][] casas;
    private int rodadas = 0;

    public Tabuleiro() {
        casas = new Peca[8][8];
        colocarPecas();
        mostrar();
    }

    public void colocarPecas() {
        casas[0][0] = new Torre(1, 'p');
        casas[0][1] = new Cavalo(1, 'p');
        casas[0][2] = new Bispo(1, 'p');
        casas[0][3] = new Rainha(0, 'p');
        casas[0][4] = new Rei(0, 'p');
        casas[0][5] = new Bispo(2, 'p');
        casas[0][6] = new Cavalo(2, 'p');
        casas[0][7] = new Torre(2, 'p');

        for (int j = 0; j < 8; j++) {
            casas[1][j] = new Peao(j + 1, 'p');
            casas[6][j] = new Peao(j + 1, 'b');
        }

        casas[7][0] = new Torre(1, 'b');
        casas[7][1] = new Cavalo(1, 'b');
        casas[7][2] = new Bispo(1, 'b');
        casas[7][3] = new Rainha(0, 'b');
        casas[7][4] = new Rei(0, 'b');
        casas[7][5] = new Bispo(2, 'b');
        casas[7][6] = new Cavalo(2, 'b');
        casas[7][7] = new Torre(2, 'b');
    }

    public void mostrar() {
        System.out.println("    a   b   c   d   e   f   g   h");
        System.out.println("  +---+---+---+---+---+---+---+---+");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " |");
            for (int j = 0; j < 8; j++) {
                if (casas[i][j] == null) {
                    System.out.print("   |");
                } else {
                    System.out.print(casas[i][j].getNome() + "|");
                }
            }
            System.out.println(" " + (8 - i));
            System.out.println("  +---+---+---+---+---+---+---+---+");
        }
        System.out.println("    a   b   c   d   e   f   g   h");
    }

    public boolean acabouOJogo() {
        return rodadas >= 3;
    }

    public void incrementarRodada() {
        this.rodadas++;
    }
}

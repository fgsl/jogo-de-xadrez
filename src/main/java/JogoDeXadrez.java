 import java.util.Scanner;

public class JogoDeXadrez implements Jogo {

    public static void main(String[] args) {
        JogoDeXadrez partida = new JogoDeXadrez();
        partida.iniciar();
        System.out.println("Gemini AI");
    }

    @Override
    public void iniciar() {
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner leitor = new Scanner(System.in);

        while (!tabuleiro.acabouOJogo()) {
            boolean jogadaValida = false;

            while (!jogadaValida) {
                System.out.println("Qual peça você quer mover?");
                String peca = leitor.nextLine().trim();

                System.out.println("Para qual casa você deseja mover?");
                String casa = leitor.nextLine().trim();

                if (tabuleiro.casaLivre(casa)) {
                    if (tabuleiro.moverPeca(peca, casa)) {
                        jogadaValida = true;
                        tabuleiro.mostrar();
                    } else {
                        System.out.println("Peça não encontrada no tabuleiro. Tente novamente.");
                    }
                } else {
                    System.out.println("Não pode mover a peça porque já existe outra peça na casa de destino.");
                }
            }

            System.out.println("Deseja continuar jogando? (SIM/NÃO)");
            String resposta = leitor.nextLine().trim().toUpperCase();
            if (resposta.equals("NÃO") || resposta.equals("NAO")) {
                break;
            }
        }
    }
}

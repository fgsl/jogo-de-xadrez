import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

// Mudado de JogoDeXadrezTest para JogoDaVelhaTest
public class JogoDaVelhaTest {

    @Test
    public void verificarJogadorCorValida() {
        Jogador jogador = new JogadorHumano("Felipe", 'b'); 
        assertEquals('b', CapsLockEvitado(jogador.getCor()));
    }

    @Test
    public void verificarJogadorCorInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            new JogadorHumano("Invalido", 'x');
        });
    }

    @Test 
    public void verificarTabuleiroFimDeJogo() {
        Tabuleiro tabuleiro = new Tabuleiro();
        assertFalse(tabuleiro.acabouOJogo());
    }    

    private char CapsLockEvitado(char c) {
        return Character.toLowerCase(c);
    }
}

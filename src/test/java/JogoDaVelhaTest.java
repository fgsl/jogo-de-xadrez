import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class JogoDaVelhaTest {

    @Test 
    public void verificarJogador() { // ADICIONADO: public
        Jogador jogador = new JogadorHumano("Felipe", 'W');
        char cor = jogador.getCor();
        
        assertEquals('W', cor);
    }
    
    @Test 
    public void verificarTabuleiro() { // ADICIONADO: public
        Tabuleiro tabuleiro = new Tabuleiro();
        assertFalse(tabuleiro.acabouOJogo());
    }    
}

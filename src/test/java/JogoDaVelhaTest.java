import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;

public class JogoDaVelhaTest {

@Test
public void verificarJogador() {
    Jogador jogador = new JogadorHumano("Felipe", 'b'); 
    char cor = jogador.getCor();
    
    assertEquals('b', cor);
}
    }
    
    @Test 
    public void verificarTabuleiro() { // ADICIONADO: public
        Tabuleiro tabuleiro = new Tabuleiro();
        assertFalse(tabuleiro.acabouOJogo());
    }    
}

import static org.junit.Assert.*;
import org.junit.Test;

public class TestRomanos {

	@Test
	public void Converte_valores_simples(){
		Romanos romanos = new Romanos();
		assertEquals(1,romanos.conversor("I"),0.5);
		assertEquals(5,romanos.conversor("V"),0.5);
		assertEquals(10,romanos.conversor("X"),0.5);
		assertEquals(50,romanos.conversor("L"),0.5);
	}
}

package media;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MediaTest {
	
	@Test
	public void validaAprovado() {
		double nota1 = 5;
		double nota2 = 5;
		
		Media media = new Media(nota1, nota2);
		
		assertEquals("Aprovado", media.getResultado());
	}
	
	@Test
	public void validaReprovado() {
		double nota1 = 4;
		double nota2 = 5;
		
		Media media = new Media(nota1, nota2);
		
		assertEquals("Reprovado", media.getResultado());
	}

}

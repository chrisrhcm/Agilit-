package Plat;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RecetteTest {
	private Recette rct;
	
	@Test
	public void tesRecetteConstructeur() {
		rct = new Recette(12);
		assertNotNull(new Recette(12));
	}
	
	@Test
    public void testGetNbIng() {
		rct = new Recette(10);
        assertEquals(10, rct.getNbIng());
    }

    @Test
    public void testSetNbIng() {
    	rct = new Recette(10);
        assertEquals(10, rct.getNbIng());
    }

	@Test
	public void testAjouterIng() {
		rct = new Recette();
		assertEquals(10, rct.ajouterIng(10));
		
	}
	
}

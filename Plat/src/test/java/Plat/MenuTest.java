package Plat;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MenuTest {
	
	@Test
	public void testMenu() {
			Plat plat1 = new Plat();
			Plat plat2 = new Plat();
			Menu menu = new Menu();
			plat1.setMenu(menu);
			plat2.setMenu(menu);
			List<Plat> p = new ArrayList<Plat>();
			p.add(plat1);
			p.add(plat2);
			menu.ajouterPlat(plat1);
			menu.ajouterPlat(plat2);
			
	assertEquals(2, menu.getPlats().size());
	assertEquals(p,menu.getPlats());
	assertEquals(plat1.getMenu(),menu);
	assertEquals(plat1.getMenu(),menu);
	
	}

}



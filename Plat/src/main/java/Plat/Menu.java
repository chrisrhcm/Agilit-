package Plat;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public class Menu {
	private List<Plat> plats;
	
	public Menu() {
		plats=new ArrayList<>();
	}
	
	public Menu(List<Plat> plats) {
		super();
		this.plats = plats;
	}

	public List<Plat> getPlats() {
		return plats;
	}

	public void setPlats(List<Plat> plats) {
		this.plats = plats;
	}
	
	public List<Plat> ajouterPlat(Plat p) {
		plats.add(p);
		return plats;
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        boolean result = true;
        		for (Plat p : plats)
        			result = result && Objects.equals(plats, menu.plats);
       return result;
    }
    
	
}

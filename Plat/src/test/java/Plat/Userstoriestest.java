package Plat;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Userstoriestest {

    @Test
    public void testUserstory(){
        Plat plat1 = new Plat();
        Plat plat2 = new Plat();
        ArrayList<Plat> p = new ArrayList<Plat>();
        p.add(plat1);
        p.add(plat2);
        plat1.setNom("couscous");
        plat2.setNom("kebab");
        USsteps us = new USsteps();
        us.laSuppressionDUnPlatNecessiteLExistanceDUnPlat(p, plat1);
        assertEquals(false, p.contains(plat1));

        us.laModificationDUnPlatNecessiteLExistenceDUnPlat(plat2, "kfc");
        assertEquals("kfc", plat2.getNom());

    }
}

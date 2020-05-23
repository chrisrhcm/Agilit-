package Plat;

import Plat.Plat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.naming.Name;
import java.util.List;

public class USsteps {
    @Given("^la suppression d'un plat necessite l'existance d'un plat$")
    public void laSuppressionDUnPlatNecessiteLExistanceDUnPlat(List<Plat> liste, Plat plat) {
        if(liste.contains(plat)){
            lUtilisateurLaSupprime(liste,plat);
        }
    }

    @When("^l'utilisateur la supprime$")
    public void lUtilisateurLaSupprime(List<Plat> liste, Plat p) {
        liste.remove(p);
        lePlatEstRetireDuMenu(liste);
    }

    @Then("^le plat est retire du menu$")
    public void lePlatEstRetireDuMenu(List<Plat> liste) {
        for(Plat i: liste){
            System.out.println(i.getNom());
        }
    }

    @Given("^la modification d'un plat necessite l'existence d'un plat$")
    public void laModificationDUnPlatNecessiteLExistenceDUnPlat(Plat plat, String name) {
        Plat p = new Plat();
        if(plat.getClass() == p.getClass()){
            lUtilisateurLaModifie(plat, name);
        }
    }

    @When("^l'utilisateur la modifie$")
    public void lUtilisateurLaModifie(Plat p, String name) {
        p.setNom(name);
        lePlatEstModifie(p);
    }

    @Then("^le plat est modifie$")
    public void lePlatEstModifie(Plat p) {
        System.out.println("le nom du plat est modifie en "+p.getNom());
    }
}

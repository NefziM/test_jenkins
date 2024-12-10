package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListeSteps {
  
  @Given("je suis un utilisateur connecte")
  public void je_suis_un_utilisateur_connecte() {
      System.out.println("Inside Step - un utilisateur connecte ");
  }

  @When("je consulte la liste des livres")
  public void je_consulte_la_liste_des_livres() {
      System.out.println("Inside Step - un utilisateur consulte la liste des livres ");
  }

  @Then("je devrais voir tous les livres disponibles a la bibliotheque")
  public void je_devrais_voir_tous_les_livres_disponibles_a_la_bibliotheque() {
      System.out.println("Inside Step - un utilisateur voir tous les livres disponibles a la bibliotheque ");
  }
}

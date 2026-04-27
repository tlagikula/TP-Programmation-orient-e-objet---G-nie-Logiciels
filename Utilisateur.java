import java.util.ArrayList;
import java.util.List;

public class Utilisateur {

    private String nom;
    private String prenom;
    private String numeroAdherent;
    private List<Emprunt> emprunts;

    public Utilisateur(String nom, String prenom, String numeroAdherent) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroAdherent = numeroAdherent;
        this.emprunts = new ArrayList<>();
    }

    public void emprunter(Exemplaire exemplaire) {
        if (exemplaire.estDisponible()) {
            Emprunt emprunt = new Emprunt(this, exemplaire);
            emprunts.add(emprunt);
            exemplaire.setDisponible(false);
        } else {
            System.out.println("Exemplaire non disponible");
        }
    }

    public void rendre(Exemplaire exemplaire) {
        exemplaire.setDisponible(true);
    }
}
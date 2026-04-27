import java.util.Date;

public class Emprunt {

    private Date dateEmprunt;
    private Date dateRetourPrevue;
    private Utilisateur utilisateur;
    private Exemplaire exemplaire;

    public Emprunt(Utilisateur utilisateur, Exemplaire exemplaire) {
        this.utilisateur = utilisateur;
        this.exemplaire = exemplaire;
        this.dateEmprunt = new Date();

        // +14 jours (simplifié)
        this.dateRetourPrevue = new Date(this.dateEmprunt.getTime() + (14L * 24 * 60 * 60 * 1000));
    }

    public Date getDateRetourPrevue() {
        return dateRetourPrevue;
    }
}
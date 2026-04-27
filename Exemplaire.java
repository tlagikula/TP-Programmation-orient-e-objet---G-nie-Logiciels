public class Exemplaire {

    private int id;
    private String etat;
    private boolean disponible;
    private Livre livre;

    public Exemplaire(int id, String etat, Livre livre) {
        this.id = id;
        this.etat = etat;
        this.livre = livre;
        this.disponible = true;
    }

    public boolean estDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Livre getLivre() {
        return livre;
    }
}

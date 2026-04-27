public class Main {
    public static void main(String[] args) {

        Livre livre = new Livre("Clean Code", "Robert Martin", "123456");

        Exemplaire ex1 = new Exemplaire(1, "neuf", livre);

        Utilisateur user = new Utilisateur("Dupont", "Jean", "A001");

        user.emprunter(ex1);

        System.out.println("Disponible ? " + ex1.estDisponible());
    }
}
package TD2;

public class EtudiantMaster extends Etudiant {
    public EtudiantMaster(String nom, String adresse, int numero) {
        super(nom, adresse, numero);
    }

    @Override
    public void afficher() {
        super.afficher();
    }

    @Override
    public void afficherProfil() {
        System.out.println("Etudiants en Master ");
    }
}

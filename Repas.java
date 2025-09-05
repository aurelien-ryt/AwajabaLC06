import java.text.SimpleDateFormat;
import java.util.Date;

public class Repas {
    private int numero;      // Le numéro du repas
    private Date date;       // La date du repas

    // Constructeur
    public Repas(int numero, Date date) {
        this.numero = numero;
        this.date = date;
    }

    // Getter et Setter pour le numéro
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Getter et Setter pour la date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Méthode pour afficher les informations du repas
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return "Repas #" + numero + " - " + sdf.format(date);
    }

    // Méthode principale pour tester
    public static void main(String[] args) {
        // Crée un repas avec numéro 1 et une date spécifique
        Repas repas1 = new Repas(1, new Date());
        System.out.println(repas1);
    }
}

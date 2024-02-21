// Klasse Auto
public class Auto extends Voertuig
{
    // velden
    private boolean heeftOpenDak; 

    // Constructor
    public Auto(String merk, String kleur)
    {
        super(merk, kleur);

        // Initialiseer velden
        this.heeftOpenDak = false;
    }

    // Accessor methode(n) (getter)
    public boolean getHeeftOpenDak()
    {
        return this.heeftOpenDak;
    }

    // Methoden
    public void printInfo()
    {
        System.out.println("Voertuig, merk " + this.getMerk() + ", kleur " + this.getKleur() + ", heeft open dak: " + heeftOpenDak);
    }
}

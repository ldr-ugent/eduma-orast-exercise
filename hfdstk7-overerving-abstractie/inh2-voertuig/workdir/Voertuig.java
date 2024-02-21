public class Voertuig  
{
    private String merk;
    private String kleur;

    public Voertuig(String merk, String kleur)
    {
        this.merk = "BASE" + merk;
        this.kleur = "BASE" + kleur;
    }

    public String getMerk()
    {
        return this.merk;
    }

    public String getKleur()
    {
        return this.kleur;
    }

    public void printInfo()
    {
        System.out.println("Voertuig, merk " + this.merk + ", kleur " + this.kleur);
    }
}


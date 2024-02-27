// Klasse Fruitsap
public class Fruitsap extends Drank
{
    // velden
    private String fruitSoort;

    // Constructor
    public Fruitsap(String merk, String fruitSoort)
    {
        super(merk);

        // Initialiseer velden
        this.fruitSoort = fruitSoort;
    }

    // Accessor methode(n) (getter)
    public String getFruitSoort()
    {
        return this.fruitSoort;
    }

    // printInfo methode
    public String getInfo()
    {
        return "Fruitsap, merk : " + getMerk() + ", fruitsoort : " + fruitSoort;
    }
}

public class Zakgeld  
{

    private double hoeveelZakgeld;
    private double maximumBedragPerAankoop;

    public Zakgeld(double hoeveelZakgeld, double maximumBedragPerAankoop)
    {
        this.hoeveelZakgeld = hoeveelZakgeld;
        this.maximumBedragPerAankoop = maximumBedragPerAankoop;
    }

    public boolean magIkDitKopen(double prijs)
    {
        return prijs<=hoeveelZakgeld && prijs<=maximumBedragPerAankoop;
    }

}
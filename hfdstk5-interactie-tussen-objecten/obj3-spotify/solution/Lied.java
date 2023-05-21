public class Lied  
{
    private String naam;
    private Persoon uitvoerder;
    private Persoon componist;

    public Lied(String naam)
    {
        this.naam = naam;
    }

    public void setUitvoerder(Persoon uitvoerder)
    {
        this.uitvoerder = uitvoerder;
    }

    public void setUitvoerderViaNaam(String voornaam, String achternaam)
    {
        this.uitvoerder = new Persoon(voornaam, achternaam);
    }

    public void setComponist(Persoon componist)
    {
        this.componist = componist;
    }

    public String getInfo()
    {
        return this.naam + ", uitvoerder " + uitvoerder.getNaam() + ", componist " + componist.getNaam(); 
    }

    public Persoon getUitvoerder()
    {
        return this.uitvoerder;
    }

    public Persoon getComponist()
    {
        return this.componist;
    }

}
public class Persoon  
{
    private String voornaam;
    private String achternaam;

    public Persoon(String voornaam, String achternaam)
    {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String getVoornaam()
    {
        return this.voornaam;
    }

    public String getAchternaam()
    {
        return this.achternaam;
    }

    public String getNaam()
    {
        return this.voornaam + " " + this.achternaam;
    }
}
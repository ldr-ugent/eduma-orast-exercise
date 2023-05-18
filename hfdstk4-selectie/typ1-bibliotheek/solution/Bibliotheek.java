public class Bibliotheek  
{

    public int geefJaarVanDruk(String drukVermelding)
    {
        int beginIndex = drukVermelding.length()-4;
        String deelMetJaar = drukVermelding.substring(beginIndex);
        int jaar = Integer.parseInt(deelMetJaar);

        return jaar;
    }

}
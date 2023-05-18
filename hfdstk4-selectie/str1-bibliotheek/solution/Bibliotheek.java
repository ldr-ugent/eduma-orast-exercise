public class Bibliotheek  
{

    public String geefCodeVoorBoek(String auteur)
    {
        String code;
        if (auteur.length()<4)
        {
            code = auteur;
        }
        else
        {
            code = auteur.substring(0,4);
        }

        code = code.toUpperCase();

        return code;
    }

}
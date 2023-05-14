public class EurovisieSongfestivalPuntenTelling  
{

    public int plaatsNaarPunten(int plaats)
    {
        int punten;
        if (plaats == 1)
        {
            punten = 12;
        }
        else if (plaats == 2)
        {
            punten = 10;
        }
        else
        {
            punten = 8 - plaats + 3;
        }

        return punten;
    }

}
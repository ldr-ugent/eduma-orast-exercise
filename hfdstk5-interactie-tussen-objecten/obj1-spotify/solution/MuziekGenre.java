public class MuziekGenre  
{
    private String naam;
    private int minimumBPM;
    private int maximumBPM;

    public MuziekGenre(String naam, int minimumBPM, int maximumBPM)
    {
        this.naam = naam;
        this.minimumBPM = minimumBPM;
        this.maximumBPM = maximumBPM;
    }

    public String getNaam()
    {
        return this.naam;
    }

    public int getMinimumBPM()
    {
        return this.minimumBPM;
    }

    public int getMaximumBPM()
    {
        return this.maximumBPM;
    }

    public boolean IsCorrectBPM(int bpm)
    {
        return bpm>=minimumBPM && bpm<=maximumBPM;
    }

}
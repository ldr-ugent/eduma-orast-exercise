public class Alarmsysteem  
{

    public boolean moetAfgaanNaBeweging(int afstand, double grootteBewegendObject)
    {
        boolean moetAfgaan = afstand < 500 && grootteBewegendObject > 100;

        return moetAfgaan;
    }

}
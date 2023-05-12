public class ZakgeldEenvoudig  {

    public double berekenNieuwZakgeld(double oudZakgeld, double procentExtra) 
    {
        return oudZakgeld + oudZakgeld * procentExtra/100;
    }

}
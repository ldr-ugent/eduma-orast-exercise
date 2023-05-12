public class Zakgeld  {

    public double berekenNieuwZakgeld(double oudZakgeld, double procentExtra) {
        return oudZakgeld + oudZakgeld * procentExtra/100;
    }

}
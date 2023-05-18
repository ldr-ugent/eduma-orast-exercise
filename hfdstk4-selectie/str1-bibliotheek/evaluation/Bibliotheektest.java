import org.junit.Assert;
import org.junit.Test;

public class Bibliotheektest 
{

    @Test
    public void testLangerDan4() {
        Bibliotheek solution = new Bibliotheek();
        Assert.assertEquals("DAHL", solution.geefCodeVoorBoek("DAHL ROALD"));
    }
    @Test
    public void testGelijkAan4() {
        Bibliotheek solution = new Bibliotheek();
        Assert.assertEquals("DAHL", solution.geefCodeVoorBoek("DAHL"));
    }

    @Test
    public void testKorterDan4() {
        Bibliotheek solution = new Bibliotheek();
        Assert.assertEquals("POE", solution.geefCodeVoorBoek("POE"));
    }

    @Test
    public void testLeeg() {
        Bibliotheek solution = new Bibliotheek();
        Assert.assertEquals("", solution.geefCodeVoorBoek(""));
    }
      
    @Test
    public void testKleineLetters() {
        Bibliotheek solution = new Bibliotheek();
        Assert.assertEquals("DAHL", solution.geefCodeVoorBoek("Dahl Roald"));
    }
      
    @Test
    public void testKleineLettersKorterDan4() {
        Bibliotheek solution = new Bibliotheek();
        Assert.assertEquals("POE", solution.geefCodeVoorBoek("Poe"));
    }
      
}

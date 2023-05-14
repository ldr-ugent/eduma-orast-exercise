import org.junit.Assert;
import org.junit.Test;

public class EurovisieSongfestivalPuntenTellingTest 
{

    @Test
    public void testPlaatsKleinerDan10() {
        EurovisieSongfestivalPuntenTelling solution = new EurovisieSongfestivalPuntenTelling();
        Assert.assertTrue("De eerste plaats in de halve finale mag naar de finale", solution.magNaarDeFinale(1));
        Assert.assertTrue("De vijfde plaats in de halve finale mag naar de finale", solution.magNaarDeFinale(5));
        Assert.assertTrue("De negende plaats in de halve finale mag naar de finale", solution.magNaarDeFinale(9));
    }
      

    @Test
    public void test10eplaats() {
        EurovisieSongfestivalPuntenTelling solution = new EurovisieSongfestivalPuntenTelling();
        Assert.assertTrue("De 10e plaats in de halve finale mag naar de finale", solution.magNaarDeFinale(10));
    }
      
    @Test
    public void test11eplaats() {
        EurovisieSongfestivalPuntenTelling solution = new EurovisieSongfestivalPuntenTelling();
        Assert.assertFalse("De 11e plaats in de halve finale mag niet naarde finale", solution.magNaarDeFinale(11));
    }
      
      
    @Test
    public void testHogePlaats() {
        EurovisieSongfestivalPuntenTelling solution = new EurovisieSongfestivalPuntenTelling();
        Assert.assertFalse("De 20e plaats in de halve finale mag niet naarde finale", solution.magNaarDeFinale(20));
        Assert.assertFalse("De 100e plaats in de halve finale mag niet naarde finale", solution.magNaarDeFinale(100));
    }
}

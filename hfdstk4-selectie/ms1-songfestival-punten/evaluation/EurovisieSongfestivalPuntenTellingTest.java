import org.junit.Assert;
import org.junit.Test;

public class EurovisieSongfestivalPuntenTellingTest 
{

    @Test
    public void test1eplaats() {
        EurovisieSongfestivalPuntenTelling solution = new EurovisieSongfestivalPuntenTelling();
        Assert.assertEquals("De eerste plaats krijgt 12 punten", 12, solution.plaatsNaarPunten(1));
    }
      

    @Test
    public void test2eplaats() {
        EurovisieSongfestivalPuntenTelling solution = new EurovisieSongfestivalPuntenTelling();
        Assert.assertEquals("De 2e plaats krijgt 10 punten", 10, solution.plaatsNaarPunten(2));
    }
      

    @Test
    public void test3eTot10eplaats() {
        EurovisieSongfestivalPuntenTelling solution = new EurovisieSongfestivalPuntenTelling();
        for(int i = 3; i<=10; ++i)
        {
            Assert.assertEquals(String.format("De %de plaats krijgt %d punten", i, 11-i), 11-i, solution.plaatsNaarPunten(i));
        }
    }
      
}

import org.junit.Assert;
import org.junit.Test;

public class EurovisieSongfestivalPuntenTellingTest 
{

    @Test
    public void testBigFiveLanden() 
    {
        EurovisieSongfestivalPuntenTelling solution = new EurovisieSongfestivalPuntenTelling();
        Assert.assertTrue("Duitsland is een 'Big Five' land", solution.isEenBigFiveLand("Duitsland"));
        Assert.assertTrue("Frankrijk is een 'Big Five' land", solution.isEenBigFiveLand("Frankrijk"));
        Assert.assertTrue("Italië is een 'Big Five' land", solution.isEenBigFiveLand("Italië"));
        Assert.assertTrue("Spanje is een 'Big Five' land", solution.isEenBigFiveLand("Spanje"));
        Assert.assertTrue("Verenigd Koninkrijk is een 'Big Five' land", solution.isEenBigFiveLand("Verenigd Koninkrijk"));
    }

    @Test
    public void testNonBigFiveLanden() 
    {
        EurovisieSongfestivalPuntenTelling solution = new EurovisieSongfestivalPuntenTelling();
        Assert.assertFalse("België is geen 'Big Five' land", solution.isEenBigFiveLand("België"));
    }

}

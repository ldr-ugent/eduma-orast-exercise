import org.junit.Assert;
import org.junit.Test;

public class SpotifyTest 
{

    @Test
    public void testVierdeDruk2020() {
        Bibliotheek solution = new Bibliotheek();
        Assert.assertEquals(2020, solution.geefJaarVanDruk("Vierde druk: 2020"));
    }

    @Test
    public void testDerdeDruk1920() {
        Bibliotheek solution = new Bibliotheek();
        Assert.assertEquals(1920, solution.geefJaarVanDruk("Derde druk: 1920"));
    }

    @Test
    public void testEnkelJaartal() {
        Bibliotheek solution = new Bibliotheek();
        Assert.assertEquals(2001, solution.geefJaarVanDruk("2001"));
    }
      
}

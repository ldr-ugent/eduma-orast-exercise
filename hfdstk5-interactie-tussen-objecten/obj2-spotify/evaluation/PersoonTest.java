import org.junit.Assert;
import org.junit.Test;

public class PersoonTest 
{

    @Test
    public void testConstructor() {
        var mg = new Persoon("Harry", "Styles");
        Assert.assertEquals("Verkeerde voornaam","Harry", mg.getVoornaam());
        Assert.assertEquals("Verkeerde achternaam","Styles", mg.getAchternaam());
    }

    @Test
    public void testNaam() {
        var mg = new Persoon("Harry", "Styles");
        Assert.assertEquals("Verkeerde naam","Harry Styles", mg.getNaam());
    }

}

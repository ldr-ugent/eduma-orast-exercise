import org.junit.Assert;
import org.junit.Test;

public class LiedTest 
{

    @Test
    public void testConstructor() {
        var lied = new Lied("As it Was");
    }

    @Test
    public void testSetUitvoerder() {
        var lied = new Lied("As it Was");
        lied.setUitvoerder(new Persoon("Harry", "Styles"));
        Assert.assertEquals("Harry", lied.getUitvoerder().getVoornaam());
        Assert.assertEquals("Styles", lied.getUitvoerder().getAchternaam());
    }


    @Test
    public void testSetUitvoerderViaNaam() {
        var lied = new Lied("As it Was");
        lied.setUitvoerderViaNaam("Harry", "Styles");
        Assert.assertEquals("Harry", lied.getUitvoerder().getVoornaam());
        Assert.assertEquals("Styles", lied.getUitvoerder().getAchternaam());
    }


    @Test
    public void testSetComponist() {
        var lied = new Lied("As it Was");
        lied.setComponist(new Persoon("Thomas", "Hull"));
        Assert.assertEquals("Thomas", lied.getComponist().getVoornaam());
        Assert.assertEquals("Hull", lied.getComponist().getAchternaam());
    }

    @Test
    public void testGetInfo() {
        var lied = new Lied("As it Was");
        lied.setUitvoerder(new Persoon("Harry", "Styles"));
        lied.setComponist(new Persoon("Thomas", "Hull"));
        Assert.assertEquals("As it Was, uitvoerder Harry Styles, componist Thomas Hull", lied.getInfo());
    }



}

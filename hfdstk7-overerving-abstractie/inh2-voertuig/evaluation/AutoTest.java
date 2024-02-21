import org.junit.Assert;
import org.junit.Test;

public class AutoTest 
{
    @Test
    public void testConstructor() {
        var auto = new Auto("Volvo", "Groen");
    }

    @Test
    public void testOvererving() {
        var auto = new Auto("Volvo", "Groen");
        Assert.assertTrue(auto instanceof Voertuig, "Auto moet overerven van Voertuig");
    }

    @Test
    public void testMerk() {
        var auto = new Auto("Volvo", "Groen");
        Assert.assertEquals("Volvo", auto.getMerk());
        
    }

    @Test
    public void testKleur() {
        var auto = new Auto("Volvo", "Groen");
        Assert.assertEquals("Groen", auto.getKleur());
    }

    @Test
    public void testOpenDak() {
        var auto = new Auto("Volvo", "Groen");
        auto.getHeeftOpenDak();
    }


    @Test
    public void testPrintInfo() {
        var auto = new Auto("Volvo", "Groen");
        auto.printInfo();
    }

}

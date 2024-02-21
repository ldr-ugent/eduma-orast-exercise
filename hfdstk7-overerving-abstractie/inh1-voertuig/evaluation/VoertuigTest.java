import org.junit.Assert;
import org.junit.Test;

public class VoertuigTest 
{
    @Test
    public void testConstructor() {
        var voertuig = new Auto("Volvo", "Groen");
    }

    @Test
    public void testMerk() {
        var voertuig = new Auto("Volvo", "Groen");
        Assert.assertEquals("Volvo", voertuig.getMerk());
        
    }

    @Test
    public void testKleur() {
        var voertuig = new Auto("Volvo", "Groen");
        Assert.assertEquals("Groen", voertuig.getKleur());
    }


    @Test
    public void testPrintInfo() {
        var voertuig = new Auto("Volvo", "Groen");
        voertuig.printInfo();
    }

}

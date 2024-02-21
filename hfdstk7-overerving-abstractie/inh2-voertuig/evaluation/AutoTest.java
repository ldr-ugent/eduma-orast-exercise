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
        Assert.assertTrue("Auto moet overerven van Voertuig", auto instanceof Voertuig);
    }

    @Test
    public void testMerk() {
        var auto = new Auto("Volvo", "Groen");
        Assert.assertEquals("Je moet het veld 'merk' en de methode 'getMerk' verwijderen uit de klasse 'Auto'.", "BASEVolvo", auto.getMerk());
        
    }

    @Test
    public void testKleur() {
        var auto = new Auto("Volvo", "Groen");
        Assert.assertEquals("Je moet het veld 'kleur' en de methode 'getKleur' verwijderen uit de klasse 'Auto'.", "BASEGroen", auto.getKleur());
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

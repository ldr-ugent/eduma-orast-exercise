import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.*;


public class AutoTest 
{
    @Test
    public void testConstructor() {
        var auto = new Auto("Volvo", "Groen");
    }

    @Test
    public void testGeenMerkVeld() {
        Assert.True("De klasse mag geen veld 'merk' hebben omdat de klasse 'Voertuig' dit al heeft.", !hasField(Auto.class, "merk"));
        
    }

    @Test
    public void testGeenKleurVeld() {
        Assert.True("De klasse mag geen veld 'kleur' hebben omdat de klasse 'Voertuig' dit al heeft.", !hasField(Auto.class, "kleur"));
        
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

    private static boolean hasField(Class cls, String name)
    {
        Field f[] = cls.getDeclaredFields();
        for (Field fld : f) {
            if (fld.getName().equals(name))
                return true;
        }

        return false;
    }

    private static boolean hasMethod(Class cls, String name)
    {
        Method m[] = cls.getDeclaredMethods();
        for (Method method : m) {
            if (method.getName().equals(name))
                return true;
        }

        return false;
    }

}

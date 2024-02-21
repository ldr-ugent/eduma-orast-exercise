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
        Assert.assertTrue("De klasse mag geen veld 'merk' hebben omdat de klasse 'Voertuig' dit al heeft.", !hasField(Auto.class, "merk"));
        
    }

    @Test
    public void testGeenKleurVeld() {
        Assert.assertTrue("De klasse mag geen veld 'kleur' hebben omdat de klasse 'Voertuig' dit al heeft.", !hasField(Auto.class, "kleur"));
        
    }

    @Test
    public void testGeenKleurAccessorMethod() {
        Assert.assertTrue("De klasse mag geen method 'getKleur' hebben omdat de klasse 'Voertuig' dit al heeft.", !hasMethod(Auto.class, "getKleur"));
        
    }

    @Test
    public void testGeenMerkAccessorMethod() {
        Assert.assertTrue("De klasse mag geen method 'getMerk' hebben omdat de klasse 'Voertuig' dit al heeft.", !hasMethod(Auto.class, "getMerk"));
        
    }

    @Test
    public void testOvererving() {
        var auto = new Auto("Volvo", "Groen");
        Assert.assertTrue("Auto moet overerven van Voertuig", isDerivedFrom(Auto.class, Voertuig.class));
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
    
    private static boolean isDerivedFrom(Class subClass, Class superClass)
    {
        return subClass.getSuperclass().equals(superClass);
    }

}

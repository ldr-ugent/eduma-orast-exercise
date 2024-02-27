import org.junit.Assert;
import org.junit.Test;
import java.lang.reflect.*;


public class FruitsapTest 
{
    @Test
    public void testConstructor() {
        var fruitSap = new Fruitsap("Minute Maid", "Sinaasappel");
    }

    @Test
    public void testGeenMerkVeld() {
        Assert.assertTrue("De klasse mag geen veld 'merk' hebben omdat de klasse 'Drank' dit al heeft.", !hasField(Fruitsap.class, "merk"));
        
    }

    @Test
    public void testGeenMerkAccessorMethod() {
        Assert.assertTrue("De klasse mag geen methode 'getMerk' hebben omdat de klasse 'Drank' dit al heeft.", !hasMethod(Fruitsap.class, "getMerk"));
        
    }

    @Test
    public void testOvererving() {
        var fruitsap = new Fruitsap("Minute Maid", "Sinaasappel");
        Assert.assertTrue("Fruitsap moet overerven van Drank", isDerivedFrom(Fruitsap.class, Drank.class));
    }

    @Test
    public void testMerk() {
        var fruitsap = new Fruitsap("Minute Maid", "Sinaasappel");
        Assert.assertEquals("Minute Maid", fruitsap.getMerk());
        
    }

    @Test
    public void testFruitSoort() {
        var fruitsap = new Fruitsap("Minute Maid", "Sinaasappel");
        Assert.assertTrue("De klasse moet een veld 'fruitSoort' hebben omdat de klasse 'Drank' dit niet heeft.", hasField(Fruitsap.class, "fruitSoort"));
    }

    @Test
    public void testgetFruitSoort() {
        var fruitsap = new Fruitsap("Minute Maid", "Sinaasappel");
        Assert.assertTrue("De klasse moet een methode 'getFruitSoort' hebben omdat de klasse 'Drank' dit niet heeft.", hasMethod(Fruitsap.class, "getFruitSoort"));
    }


    @Test
    public void testgetInfo() {
        var fruitsap = new Fruitsap("Minute Maid", "Sinaasappel");

        Assert.assertEquals("Fruitsap, merk : Minute Maid, fruitsoort : Sinaasappel", fruitsap.getInfo());
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

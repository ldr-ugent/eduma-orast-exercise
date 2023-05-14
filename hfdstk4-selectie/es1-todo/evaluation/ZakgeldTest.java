import org.junit.Assert;
import org.junit.Test;

public class ZakgeldTest 
{

    @Test
    public void testRuimOnderMaximum() {
        Zakgeld solution = new Zakgeld(100.0, 10.0);
        Assert.assertTrue("Als je 100€ zakgeld hebt en je mag maximaal 10€ aankopen, dan moet je iets van 1€ kunnen aankopen.", solution.magIkDitKopen(1.0));
    }
      
    @Test
    public void testNetGelijkAanMaximum() {
        Zakgeld solution = new Zakgeld(100.0, 10.0);
        Assert.assertTrue("Als je 100€ zakgeld hebt en je mag maximaal 10€ aankopen, dan moet je iets van 10€ kunnen aankopen.", solution.magIkDitKopen(10.0));
    }
      
    @Test
    public void testGroterDanMaximum() {
        Zakgeld solution = new Zakgeld(100.0, 10.0);
        Assert.assertFalse("Als je 100€ zakgeld hebt en je mag maximaal 10€ aankopen, dan mag je iets van 10.5€ niet kunnen aankopen.", solution.magIkDitKopen(10.5));
    }

    
    @Test
    public void testRuimOnderWatRest() {
        Zakgeld solution = new Zakgeld(10.0, 100.0);
        Assert.assertTrue("Als je 10€ zakgeld hebt en je mag maximaal 100€ aankopen, dan moet je iets van 1€ kunnen aankopen.", solution.magIkDitKopen(1.0));
    }
      
    @Test
    public void testNetGelijkAanWatRest() {
        Zakgeld solution = new Zakgeld(10.0, 100.0);
        Assert.assertTrue("Als je 10€ zakgeld hebt en je mag maximaal 100€ aankopen, dan moet je iets van 10€ kunnen aankopen.", solution.magIkDitKopen(10.0));
    }
      
    @Test
    public void testGroterDanWatRest() {
        Zakgeld solution = new Zakgeld(10.0, 100.0);
        Assert.assertFalse("Als je 10€ zakgeld hebt en je mag maximaal 100€ aankopen, dan mag je iets van 10.5€ niet kunnen aankopen.", solution.magIkDitKopen(10.5));
    }
       
    @Test
    public void testGelijkAanMaximumEnGelijkAanWatRest() {
        Zakgeld solution = new Zakgeld(10.0, 10.0);
        Assert.assertTrue("Als je 10€ zakgeld hebt en je mag maximaal 10€ aankopen, dan mag je iets van 10€ aankopen.", solution.magIkDitKopen(10));
    }
    
    @Test
    public void testGroterDanMaximumEnGroterDanWatRest() {
        Zakgeld solution = new Zakgeld(10.0, 10.0);
        Assert.assertFalse("Als je 10€ zakgeld hebt en je mag maximaal 10€ aankopen, dan mag je iets van 50€ niet kunnen aankopen.", solution.magIkDitKopen(50));
    }
    
    @Test
    public void testKleinerDanMaximumEnKleinerDanWatRest() {
        Zakgeld solution = new Zakgeld(10.0, 10.0);
        Assert.assertTrue("Als je 10€ zakgeld hebt en je mag maximaal 10€ aankopen, dan mag je iets van 9€ aankopen.", solution.magIkDitKopen(9.0));
    }
    
}

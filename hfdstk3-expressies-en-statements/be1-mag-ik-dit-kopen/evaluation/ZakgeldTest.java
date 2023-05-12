import org.junit.Assert;
import org.junit.Test;

public class ZakgeldTest {

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
      
}

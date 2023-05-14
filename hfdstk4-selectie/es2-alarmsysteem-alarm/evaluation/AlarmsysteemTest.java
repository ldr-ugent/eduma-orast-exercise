import org.junit.Assert;
import org.junit.Test;

public class AlarmsysteemTest 
{

    @Test
    public void testAfstandKleinerEnGrootteGroter() 
    {
        Alarmsysteem solution = new Alarmsysteem();
        Assert.assertTrue("Het alarm moet afgaan voor een object met afstand 100 cm en grootte 120 cm", solution.moetAfgaanNaBeweging(100, 120));
    }

    @Test
    public void testAfstandKleinerEnGrootteKleiner() 
    {
        Alarmsysteem solution = new Alarmsysteem();
        Assert.assertFalse("Het alarm mag niet afgaan voor een object met afstand 100 cm en grootte 50 cm", solution.moetAfgaanNaBeweging(100, 50));
    }
      

    @Test
    public void testAfstandGroterEnGrootteGroter() 
    {
        Alarmsysteem solution = new Alarmsysteem();
        Assert.assertFalse("Het alarm mag niet afgaan voor een object met afstand 600 cm en grootte 150 cm", solution.moetAfgaanNaBeweging(600, 150));
    }
      

    @Test
    public void testAfstandGroterEnGrootteKleiner() 
    {
        Alarmsysteem solution = new Alarmsysteem();
        Assert.assertFalse("Het alarm mag niet afgaan voor een object met afstand 600 cm en grootte 50 cm", solution.moetAfgaanNaBeweging(600, 50));
    }
      
    @Test
    public void testAfstandGelijkEnGrootteGroter() 
    {
        Alarmsysteem solution = new Alarmsysteem();
        Assert.assertFalse("Het alarm mag niet afgaan voor een object met afstand 500 cm en grootte 120 cm", solution.moetAfgaanNaBeweging(500, 120));
    }
      
    @Test
    public void testAfstandKleinerEnGrootteGelijk() 
    {
        Alarmsysteem solution = new Alarmsysteem();
        Assert.assertFalse("Het alarm mag niet afgaan voor een object met afstand 400 cm en grootte 100 cm", solution.moetAfgaanNaBeweging(400, 100));
    }

      
    @Test
    public void testAfstandGelijkEnGrootteGelijk() 
    {
        Alarmsysteem solution = new Alarmsysteem();
        Assert.assertFalse("Het alarm mag niet afgaan voor een object met afstand 500 cm en grootte 100 cm", solution.moetAfgaanNaBeweging(500, 100));
    }

}

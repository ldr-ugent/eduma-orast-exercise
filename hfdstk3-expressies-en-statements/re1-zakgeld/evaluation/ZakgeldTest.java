import org.junit.Assert;
import org.junit.Test;

public class ZakgeldTest {

    private Zakgeld solution;
        
    @Test
    public void test10Procent() 
    {
        if(solution == null) solution = new Zakgeld();
        Assert.assertEquals("berekenNieuwZakgeld(100.0, 10.0) zou 110.0 moeten teruggeven", 110.0, solution.berekenNieuwZakgeld(100.0, 10.0), 0.0001);
    }
        
    @Test
    public void test10p5Procent() 
    {
        if(solution == null) solution = new Zakgeld();
        Assert.assertEquals("berekenNieuwZakgeld(100.0, 10.5) zou 110.5 moeten teruggeven", 110.5, solution.berekenNieuwZakgeld(100.0, 10.5), 0.0001);
    }

    @Test
    public void test0Procent() 
    {
        if(solution == null) solution = new Zakgeld();
        Assert.assertEquals("berekenNieuwZakgeld(100.0, 0.0) zou 100.0 moeten teruggeven", 100.0, solution.berekenNieuwZakgeld(100.0, 0.0), 0.0001);
    }

    @Test
    public void test100Procent() 
    {
        if(solution == null) solution = new Zakgeld();
        Assert.assertEquals("berekenNieuwZakgeld(100.0, 100.0) zou 200.0 moeten teruggeven", 200.0, solution.berekenNieuwZakgeld(100.0, 100.0), 0.0001);
    }
    
}

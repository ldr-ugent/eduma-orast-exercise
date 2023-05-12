import org.junit.Assert;
import org.junit.Test;

public class ZakgeldTest {

    private Zakgeld solution;
        
    @Test
    public void test10Procent() {
        if(solution == null) solution = new Zakgeld();
        Assert.assertEquals(110.0, solution.berekenNieuwZakgeld(100.0, 10.0));
    }
        
    @Test
    public void test10p5Procent() {
        if(solution == null) solution = new Zakgeld();
        Assert.assertEquals(110.5, solution.berekenNieuwZakgeld(100.0, 10.5));
    }

    @Test
    public void test0Procent() {
        if(solution == null) solution = new Zakgeld();
        Assert.assertEquals(100.0, solution.berekenNieuwZakgeld(100.0, 0.0));
    }

    @Test
    public void test100Procent() {
        if(solution == null) solution = new Zakgeld();
        Assert.assertEquals(200.0, solution.berekenNieuwZakgeld(100.0, 100.0));
    }
}

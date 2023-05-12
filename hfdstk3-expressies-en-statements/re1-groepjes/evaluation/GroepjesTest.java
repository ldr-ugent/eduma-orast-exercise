import org.junit.Assert;
import org.junit.Test;

public class GroepjesTest {

    private Groepjes solution;
        
    @Test
    public void test1Leerling() {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals(0, solution.berekenNieuwZakgeld(20, 1));
    }
        
    @Test
    public void test20LeerlingenPer2() {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals(0, solution.berekenNieuwZakgeld(20, 2));
    }
        
    @Test
    public void test20LeerlingenPer3() {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals(2, solution.berekenNieuwZakgeld(20, 3));
    }
        
    @Test
    public void test0Leerlingen() {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals(0, solution.berekenNieuwZakgeld(0, 2));
    }
}

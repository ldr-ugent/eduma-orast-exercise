import org.junit.Assert;
import org.junit.Test;

public class GroepjesTest {

    private Groepjes solution;
        
    @Test
    public void test1Leerling() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals("berekenHoeveelLeerlingenOver(20, 1) zou 0 moeten teruggeven want we kunnen 20 groepjes van 1 persoon vormen", 0, solution.berekenHoeveelLeerlingenOver(20, 1));
    }
        
    @Test
    public void test20LeerlingenPer2() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals("berekenHoeveelLeerlingenOver(20, 2) zou 0 moeten teruggeven want we kunnen 10 groepjes van 2 personen vormen", 0, solution.berekenHoeveelLeerlingenOver(20, 2));
    }
        
    @Test
    public void test20LeerlingenPer3() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals("berekenHoeveelLeerlingenOver(20, 3) zou 2 moeten teruggeven want nadat we 6 groepjes van 3 personen gevormd hebben blijven er 2 personen over", 2, solution.berekenHoeveelLeerlingenOver(20, 3));
    }
        
    @Test
    public void test0Leerlingen() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals("berekenHoeveelLeerlingenOver(0, 2) zou 0 moeten teruggeven, want er blijven geen leerlingen over", 0, solution.berekenHoeveelLeerlingenOver(0, 2));
    }
}

import org.junit.Assert;
import org.junit.Test;

public class GroepjesTest {

    private Groepjes solution;
        
    @Test
    public void testLeeg() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals(", ", solution.geefKlasEnNaam("", ""));
    }
        
    @Test
    public void testKlasnaamLeeg() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals(", The Black Panthers", solution.geefKlasEnNaam("", "The Black Panthers"));
    }

    @Test
    public void testGroepsnaamLeeg() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals("5BI, ", solution.geefKlasEnNaam("5BI", ""));
    }
        
    @Test
    public void testBeideNietLeeg() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals("5BI, The Black Panthers", solution.geefKlasEnNaam("5BI", "The Black Panthers"));
    }
        
}

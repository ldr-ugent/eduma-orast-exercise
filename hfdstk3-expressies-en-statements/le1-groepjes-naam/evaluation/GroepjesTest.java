import org.junit.Assert;
import org.junit.Test;

public class GroepjesTest {

    private Groepjes solution;
        
    @Test
    public void testLeeg() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals("We verwachten ', ' als return-waarde indien we lege Strings meegeven aan de method.", ", ", solution.geefKlasEnNaam("", ""));
    }
        
    @Test
    public void testKlasnaamLeeg() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals("We verwachten ', The Black Panthers' als return-waarde indien we een lege String en 'The Black Panthers' meegeven aan de method.", ", The Black Panthers", solution.geefKlasEnNaam("", "The Black Panthers"));
    }

    @Test
    public void testGroepsnaamLeeg() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals("We verwachten '5BI, ' als return-waarde indien we '5BI' en een lege String meegeven aan de method.", "5BI, ", solution.geefKlasEnNaam("5BI", ""));
    }
        
    @Test
    public void testBeideNietLeeg() 
    {
        if(solution == null) solution = new Groepjes();
        Assert.assertEquals("We verwachten '5BI, The Black Panthers' als return-waarde indien we '5BI' en 'The Black Panthers' meegeven aan de method.", "5BI, The Black Panthers", solution.geefKlasEnNaam("5BI", "The Black Panthers"));
    }
        
}

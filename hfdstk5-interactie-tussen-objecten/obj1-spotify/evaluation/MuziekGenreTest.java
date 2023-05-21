import org.junit.Assert;
import org.junit.Test;

public class MuziekGenreTest 
{

    @Test
    public void testConstructor() {
        var mg = new MuziekGenre("Pop", 100, 130);
        Assert.assertEquals("Pop", mg.getNaam());
        Assert.assertEquals(100, mg.getMinimumBPM());
        Assert.assertEquals(130, mg.getMaximumBPM());
    }

    @Test
    public void testIsCorrectBPM() {
        var mg = new MuziekGenre("Pop", 100, 130);
        Assert.assertTrue(mg.IsCorrectBPM(100));
        Assert.assertTrue(mg.IsCorrectBPM(105));
        Assert.assertTrue(mg.IsCorrectBPM(130));
        Assert.assertFalse(mg.IsCorrectBPM(99));
        Assert.assertFalse(mg.IsCorrectBPM(131));
        Assert.assertFalse(mg.IsCorrectBPM(546546));
        Assert.assertFalse(mg.IsCorrectBPM(1));
        Assert.assertFalse(mg.IsCorrectBPM(0));
        Assert.assertFalse(mg.IsCorrectBPM(-1));
    }
}

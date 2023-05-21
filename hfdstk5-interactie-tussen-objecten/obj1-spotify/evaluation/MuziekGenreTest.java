import org.junit.Assert;
import org.junit.Test;

public class MuziekGenreTest 
{

    @Test
    public void testConstructor() {
        var mg = new MuziekGenre("Pop", 100, 130);
        Assert.assertEquals("Verkeerde naam","Pop", mg.getNaam());
        Assert.assertEquals("Verkeerde minimum BPM", 100, mg.getMinimumBPM());
        Assert.assertEquals("Verkeerde maximum BPM",130, mg.getMaximumBPM());
    }

    @Test
    public void testIsCorrectBPM() {
        var mg = new MuziekGenre("Pop", 100, 130);
        Assert.assertTrue("Indien bpm gelijk is aan minimumBPM opgegeven in de constructor, dan moet IsCorrectBPM true teruggeven", mg.IsCorrectBPM(100));
        Assert.assertTrue("Indien bpm >= minimumBPM en <= maximumBPM opgegeven in de constructor, dan moet IsCorrectBPM true teruggeven", mg.IsCorrectBPM(105));
        Assert.assertTrue("Indien bpm gelijk is aan maximumBPM opgegeven in de constructor, dan moet IsCorrectBPM true teruggeven", mg.IsCorrectBPM(130));
        Assert.assertFalse("Indien bpm < minimumBPM of > maximumBPM opgegeven in de constructor, dan moet IsCorrectBPM false teruggeven", mg.IsCorrectBPM(99));
        Assert.assertFalse("Indien bpm < minimumBPM of > maximumBPM opgegeven in de constructor, dan moet IsCorrectBPM false teruggeven", mg.IsCorrectBPM(131));
        Assert.assertFalse("Indien bpm < minimumBPM of > maximumBPM opgegeven in de constructor, dan moet IsCorrectBPM false teruggeven", mg.IsCorrectBPM(546546));
        Assert.assertFalse("Indien bpm < minimumBPM of > maximumBPM opgegeven in de constructor, dan moet IsCorrectBPM false teruggeven", mg.IsCorrectBPM(1));
        Assert.assertFalse("Indien bpm < minimumBPM of > maximumBPM opgegeven in de constructor, dan moet IsCorrectBPM false teruggeven", mg.IsCorrectBPM(0));
        Assert.assertFalse("Indien bpm < minimumBPM of > maximumBPM opgegeven in de constructor, dan moet IsCorrectBPM false teruggeven", mg.IsCorrectBPM(-1));
    }
}

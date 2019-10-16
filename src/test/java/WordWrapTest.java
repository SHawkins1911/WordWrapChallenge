import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordWrapTest {

    @Test
    public void testAddSpaces1(){
        StringBuilder sb = new StringBuilder("Tom");
        int extraSpaces = 3;

        String actual = WordWrap.addSpaces(sb, extraSpaces).toString();

        Assertions.assertEquals("Tom   ", actual );
    }

    @Test
    public void testAddSpaces2(){
        StringBuilder sb = new StringBuilder("Tom");
        int extraSpaces = 7;

        String actual = WordWrap.addSpaces(sb, extraSpaces).toString();

        Assertions.assertEquals("Tom       ", actual );
    }

    @Test
    public void testWrappedText1(){
        String [] words = {"Hello", "my", "name", "is", "Stefun"};
        int lineWidth = 13;

        Integer actual = WordWrap.wrappedText(words, lineWidth).length();

        Assertions.assertEquals(34, actual);
    }

    @Test
    public void testWrappedText2(){
        String [] words = {"Hello", "my", "name", "is", "Stefun"};
        int lineWidth = 13;

        String actual = WordWrap.wrappedText(words, lineWidth);

        Assertions.assertEquals("Hello my     \n" + "name is     \n" +
                "Stefun ", actual);
    }
}

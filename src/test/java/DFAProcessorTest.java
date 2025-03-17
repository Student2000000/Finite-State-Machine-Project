import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DFAProcessorTest {

    @Test
    public void TestAcceptDFAValidStrings() {
        assertTrue(DFAProcessor.acceptDFA("ac"));
        assertTrue(DFAProcessor.acceptDFA("bc"));
        assertTrue(DFAProcessor.acceptDFA("acc"));
        assertTrue(DFAProcessor.acceptDFA("bcc"));
        assertTrue(DFAProcessor.acceptDFA("acccc"));
        assertTrue(DFAProcessor.acceptDFA("bcccc"));
        assertTrue(DFAProcessor.acceptDFA("accccccc"));
    }

    @Test
    public void TestAcceptDFANonValidStrings() {
        assertFalse(DFAProcessor.acceptDFA("a"));
        assertFalse(DFAProcessor.acceptDFA("b"));
        assertFalse(DFAProcessor.acceptDFA("abc"));
    }
}
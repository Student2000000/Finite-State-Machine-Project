import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NFAProcessorTest {

    @Test
    public void TestAcceptDFAValidStrings() {
        assertTrue(NFAProcessor.acceptNFA("aabb"));
        assertTrue(NFAProcessor.acceptNFA("babb"));
        assertTrue(NFAProcessor.acceptNFA("aaabb"));
        assertTrue(NFAProcessor.acceptNFA("bbabb"));
        assertTrue(NFAProcessor.acceptNFA("ababb"));
        assertTrue(NFAProcessor.acceptNFA("baaabb"));
        assertTrue(NFAProcessor.acceptNFA("abbbbabb"));
    }

    @Test
    public void TestAcceptDFANonValidStrings() {
        assertFalse(NFAProcessor.acceptNFA("a"));
        assertFalse(NFAProcessor.acceptNFA("b"));
        assertFalse(NFAProcessor.acceptNFA("aba"));
    }
}
package day1021.solvebracket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {
    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() {
        SolveBracket solveBracket = new SolveBracket();
        assertTrue(solveBracket.solution("(())"));
        assertTrue(solveBracket.solution("()()"));
        assertTrue(solveBracket.solution("(())()"));
        assertFalse(solveBracket.solution(")()("));
        assertFalse(solveBracket.solution("((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))"));

    }
}
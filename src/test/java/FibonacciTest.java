import org.example.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void testIsFibonacci_expect0_when_0_given() {
        int expectResult = 0;
        int actualResult= Fibonacci.getFibonacci(0);
        Assertions.assertEquals(expectResult, actualResult);
    }
    @Test
    public void testIsFibonacci_expect1_when_1_given() {
        int expectResult = 1;
        int actualResult= Fibonacci.getFibonacci(1);
        Assertions.assertEquals(expectResult, actualResult);
    }
    @Test
    public void testIsFibonacci_expect13_when_7_given() {
        int expectResult = 13;
        int actualResult= Fibonacci.getFibonacci(7);
        Assertions.assertEquals(expectResult, actualResult);

    }
}

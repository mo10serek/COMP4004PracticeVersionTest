import junit.runner.Version;
import junit.framework.TestCase;
import org.example.SquareRoot;
import org.junit.Test;

public class squareRootTest extends TestCase{
    @Test
    public void testReturnCorrectNumber() {
        System.out.println("Junit version is: "+ Version.id());
        SquareRoot squareRoot = new SquareRoot();
        assertEquals(2.0, squareRoot.caculateRoot(4));
    }

    @Test
    public void testRoundToNearestTwoDigits() {
        SquareRoot squareRoot = new SquareRoot();
        assertEquals(2.83, squareRoot.caculateRoot(8));
    }

    @Test
    public void testDoesNotAlowZero() {
        SquareRoot squareRoot = new SquareRoot();
        assertEquals(0.0, squareRoot.caculateRoot(-4));
    }

    @Test
    public void testReturnValueIfBellowTwoDesimalPoints() {
        SquareRoot squareRoot = new SquareRoot();
        assertEquals(0.0001, squareRoot.caculateRoot(0.00000001));
    }

    @Test
    public void testReturnValueIfDesimalPointsFarFrom2() {
        SquareRoot squareRoot = new SquareRoot();
        assertEquals(6854.00001, squareRoot.caculateRoot(46977316.14));
    }
}

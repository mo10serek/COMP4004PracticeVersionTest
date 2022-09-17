
import junit.framework.TestCase;
import org.example.SquareRoot;
import org.junit.Test;

public class squareRootTest extends TestCase{
    @Test
    public void testReturnCorrectNumber(){
        SquareRoot squareRoot = new SquareRoot();
        assertEquals(2.0, squareRoot.caculateRoot(4));
    }
}


import junit.framework.TestCase;
import org.junit.Test;

public class squareRootTest extends TestCase{



    @Test
    public void testReturnCorrectNumber(){
        SquareRoot squareRoot = new squareRoot();
        assertEquals(2, squareRoot.caculateRoot(4));
    }
}

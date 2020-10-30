import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
  
      @Test
      public void testNothing(){}

      @Test
      public void testSomeStuff(){
        /*if (assertFalse(assertEquals((2+3),5))) System.out.println("Dies ist eine falsche Aussage");*/

        assertTrue(2+3==5);

        String string ="string";
        assertNotNull(string);
        
        assertFalse(37>45);
      }
}
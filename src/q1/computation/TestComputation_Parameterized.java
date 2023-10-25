package q1.computation;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import p1.computation.Computation;

@RunWith(Parameterized.class)
public class TestComputation_Parameterized {
   int testInput1, testInput2, testExpected;
   
   @Parameters
   public static Collection<Object[]> data() {
      return Arrays.asList(new Object[][] { //
    	  // TODO: Write Your Answer
            {100, 1, 20},
            {101, 2, 30},
            {102, 3, 40} });
   }

   public TestComputation_Parameterized(int input1, int input2, int expected) {
	      this.testInput1 = input1;
	      this.testInput2 = input2;
	      this.testExpected = expected;
   }

   @Test
   public void testGetDiscount() throws Exception {
 	  // TODO: Write Your Answer
	      Computation com = new Computation();
	      int actualResult = com.getDiscount(testInput1, testInput2);
	      Assert.assertEquals(testExpected, actualResult);
   }
}

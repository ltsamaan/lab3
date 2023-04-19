import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
	}
  @Test 
	public void testReverseInPlace3() {
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed2() {
    int[] input1 = {3};
    assertArrayEquals(new int[]{3}, ArrayExamples.reversed(input1));
  }
  @Test
  public void testReversed3() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void averageWithoutLowest1() {
    double[] input1 = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
  @Test
  public void averageWithoutLowest2() {
    double[] input1 = {8.2, 2.1, 9.0};
    assertEquals(8.6, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
  @Test
  public void averageWithoutLowest3() {
    double[] input1 = {8.2, 8.2, 8.2};
    assertEquals(8.2, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
  @Test
  public void averageWithoutLowest4() {
    double[] input1 = {1.0};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }


}

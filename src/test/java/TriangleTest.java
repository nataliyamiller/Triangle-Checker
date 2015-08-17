import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(7, 5, 2);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  // @Test
  // public void newRectangle_setsLength() {
  //   Rectangle testRectangle = new Rectangle(2, 2);
  //   assertEquals(2, testRectangle.getLength());
  // }
  //
  // @Test
  // public void newRectangle_setsWidth() {
  //   Rectangle testRectangle = new Rectangle(2, 2);
  //   assertEquals(2, testRectangle.getWidth());
  // }
  //
  // @Test
  // public void isSquare_whenNotASquare_false() {
  //   Rectangle testRectangle = new Rectangle(2, 4);
  //   assertEquals(false, testRectangle.isSquare());
  // }
  //
  // @Test
  // public void isSquare_allSidesEqual_true() {
  //   Rectangle testRectangle = new Rectangle(2, 2);
  //   assertEquals(true, testRectangle.isSquare());
  // }

}

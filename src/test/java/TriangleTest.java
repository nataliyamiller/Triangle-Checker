import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(7, 5, 2);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void ifTriangle_isATriangle_true() {
    Triangle testTriangle = new Triangle(2, 2, 3);
    assertEquals(true, testTriangle.isTriangle());

  }

  @Test
  public void ifTriangle_isEquilateral_true() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle.isEquilateral());

  }

  @Test
  public void ifTriangle_isScalene_true() {
    Triangle testTriangle = new Triangle(1, 2, 3);
    assertEquals(true, testTriangle.isScalene());

  }

  @Test
  public void ifTriangle_isIsosceles_true() {
    Triangle testTriangle = new Triangle(3, 3, 4);
    assertEquals(true, testTriangle.isIsosceles());

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

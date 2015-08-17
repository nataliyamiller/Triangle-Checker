

public class Triangle {
  private int mLength;
  private int mWidth;
  private int mHeight;

  public Triangle(int length, int width, int height) {
    mLength = length;
    mWidth = width;
    mHeight = height;
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }

  public int getHeight() {
    return mHeight;
  }

  public boolean isTriangle() {
    return ((mLength + mHeight > mWidth) && (mLength + mWidth > mHeight) && (mHeight + mWidth > mLength)); //this returns false.
  }

  public boolean isEquilateral() {
    return ((mLength == mHeight) && (mHeight == mWidth));
  }

   public boolean isScalene() {
     return ((mLength != mHeight) && (mHeight != mWidth) && (mLength != mWidth));
   }

   public boolean isIsosceles() {
     return((mLength == mWidth) || (mLength == mHeight) || (mWidth == mHeight));
   }

}

package main.java.oops;
public abstract class Shape {
   protected int x;
   protected int y;

   public Shape(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public abstract double area();

   public abstract double perimeter();

   public void move(int x, int y) {
      this.x += x;
      this.y += y;
   }
}

class Rectangle extends Shape {
   private int width;
   private int height;

   public Rectangle(int x, int y, int width, int height) {
      super(x, y);
      this.width = width;
      this.height = height;
   }

   public double area() {
      return width * height;
   }

   public double perimeter() {
      return 2 * (width + height);
   }
   public static void main(String[] args) {
      Rectangle rect = new Rectangle(10, 20, 5, 8);
      System.out.println("Area: " + rect.area());
      System.out.println("Perimeter: " + rect.perimeter());
      rect.move(3, 4);
      System.out.println("New position: (" + rect.x + ", " + rect.y + ")");
   }
}

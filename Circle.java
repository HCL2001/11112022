package Thuchanh;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArena(){
        return (this.radius * this.radius) * 3.14;
    }

   public double getPerimeter(){
        return (2 * 3.14) * this.radius;
   }

   public String toString(){
        return "A circle with raidius = " + this.radius +", which is a subclass of " + super.toString();
   }
}

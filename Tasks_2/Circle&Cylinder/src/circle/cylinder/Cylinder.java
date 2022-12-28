
package circle.cylinder;


public class Cylinder  extends Circle {
    private double height = 1.0 ;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder( double height ,String color, double radius) {
        super(color, radius);
        this.height= height;
    }

    public Cylinder(double height , double radius) {
        super(radius);
        this.height= height;
    }
    
     public Cylinder( double height ) {
         this.height = height ;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }
    
    public double getVolume(){
        return super.getArea()*height ;
    
    }
     
     
     
     
    
    
    
    
    
    
    
}

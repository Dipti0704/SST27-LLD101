
public class Demo05 {
    static int areaAfterResize(Shape shape){
        return shape.area();
    }
    public static void main(String[] args) {
        Shape rect = new Rectangle(5,6);
        Shape sq = new Square(5);

        System.out.println(areaAfterResize(rect)); // 20
        System.out.println(areaAfterResize(sq));    // 16 (!) violates expectation
    }
}


/*
 here we just have two shapes... rectangle and square so we are using rectangle as our parent class 
but if in future we have to add more shapes so our logic get eliminated . what we  can do is... we can create an interfrace. 
like they should share the common abstraction .
which will be implemented by every shape...
this thing which is done here is bad inheritance hierarchy.



we have implemented here is Liscof substitution principle... 
 */
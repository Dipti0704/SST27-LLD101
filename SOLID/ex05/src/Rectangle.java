public class Rectangle implements Shape {
    private int h, w;

    public Rectangle(int h, int w){
        this.h = h;
        this.w = w;
    }

    @Override
    public int area(){
        return h*w;
    }
    
}
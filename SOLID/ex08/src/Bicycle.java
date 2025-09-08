public class Bicycle implements Pedal {
    
     @Override
    public void pedal(int effort) {
        System.out.println("Pedal effort " + effort);
    }
}
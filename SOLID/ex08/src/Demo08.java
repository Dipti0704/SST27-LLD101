public class Demo08 {
    public static void main(String[] args) {
        Engine car = new Car();
        car.startEngine();

        Pedal bike = new Bicycle();
        bike.pedal(300);
    }
}

// we had solved the interface segregation principle here....

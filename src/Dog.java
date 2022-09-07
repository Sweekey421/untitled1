public class Dog extends Animal {
    String doberman;

    @Override
    public void makeNoise() {
        System.out.println("Gav");
    }

    @Override
    public void eat() {
        System.out.println("eating meat");
    }
}
public class Cat extends Animal{
    String mau;
    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("eating fish");
    }
}
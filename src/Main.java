
public class Main {
    public static void main (String[] args) {
        Doctor Nill = new Doctor ();
        Animal animals = new Animal();
        animals.food = "fruit";
        animals.location = "planet";

        Dog dogs = new Dog();
        dogs.food = "meat";
        dogs.location = "konura";

        Horse horses = new Horse();
        horses.food = "sugar";
        horses.location = "stoylo";

        Cat cats = new Cat();
        cats.food = "milk";
        cats.location = "house";

        Animal[]pacient = {horses, cats, dogs, animals};

        for (int i = 0; i < pacient.length; i++){
            Nill.treatAnimal(pacient [i]);
        }
    }
}
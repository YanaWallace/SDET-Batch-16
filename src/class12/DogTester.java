package class12;

public class DogTester {
    public static void main(String[] args) {
        Dog actualDog= new Dog();
        actualDog.name="Jacky";
        actualDog.age=15;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;

        actualDog.bark();


       Dog obj=new Dog();
       obj.name="Bart";
       obj.age=9;
       obj.breed="Poodel";
       obj.color="White";
       obj.weight=15;
       actualDog.sleep();

    }
}

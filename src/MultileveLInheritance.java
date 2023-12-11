


class Animal1{
    void eat(){
        System.out.println("Eating...");
    }

}
class Dog1 extends Animal1{
    void barks(){
        System.out.println("Barking...");

    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping...");
    }
}


public class MultileveLInheritance {
    public static void main(String[] args) {
        BabyDog b = new BabyDog();
        b.weep();
        b.barks();
        b.eat();
    }
}

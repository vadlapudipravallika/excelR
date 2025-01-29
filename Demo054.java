class example{
    void eat() {
        System.out.println("Animal is eating");
    }
}
class Dog extends example{
    void eat(){
        System.out.println("Dog is eating");
    }
    void eat(String food) {
        System.out.println("Dog is eating " + food);
    }
}
public class Demo054 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.eat("bones");
        example animal = new example();
        animal.eat();
    }
}

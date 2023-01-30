class Animal
{
    void display()
    {
        System.out.println("This is an animal");
    }
}
class Dog extends Animal
{
    void display()
    {
        System.out.println("This is a dog");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Animal ob1 = new Animal();
        Animal ob2 = new Dog();
        ob1.display();
        ob2.display();
    }
}
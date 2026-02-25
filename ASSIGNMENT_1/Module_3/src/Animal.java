class Animal {

    void eat() {
        System.out.println("Eating bones..");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}
class Dog extends Animal {

    void bark() {
        System.out.println("barking");
    }
}
class InheritanceDemo {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.sleep();
        d.bark();
    }
}

class Animal {
    public void eat(){
        System.out.println("Eat");
    }
}

//single
class Dog extends Animal {
    public void makeSound() {
    System.out.println("Bhaw Bhaw");
    }
}
//hierarchical + multilevel
class Puppy extends Dog{
    @Override
    public void makeSound() {
    System.out.println("vuff vuff");
    }
}

//hierarchical
class Cat extends Dog{  
    @Override
    public void makeSound(){
        System.out.println("meaw meaw");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Puppy myPuppy = new  Puppy();
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        myPuppy.eat();
        myPuppy.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}

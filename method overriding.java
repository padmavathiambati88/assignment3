class Animal {
  public String name;

  public Animal(String name) {
    this.name = name;
  }

  
  public void speak() {
    System.out.println("Generic animal sound");
  }

  public void speak(String sound) { 
    System.out.println(name + " says: " + sound);
  }
}

class Dog extends Animal {
  public Dog(String name) {
    super(name);  
  }

  
  @Override
  public void speak() {
    System.out.println(name + " barks");
  }
}

class Cat extends Animal {
  public Cat(String name) {
    super(name);  
  }

  @Override
  public void speak() {
    System.out.println(name + " meows");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal("Unknown");  
    animal.speak();

    Dog dog = new Dog("Fido");
    dog.speak();  
    dog.speak("Woof!");  

    Cat cat = new Cat("Whiskers");
    cat.speak();  
  }
}
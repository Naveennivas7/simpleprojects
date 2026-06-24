package oops;

class Animal1 {
  String type = "Animal";
}

class Dog1 extends Animal1{
  String type = "Dog";

  public void printType() {
    System.out.println(super.type); // Access parent attribute
  }
}

public class superattribute {
  public static void main(String[] args) {
    Dog1 myDog = new Dog1();
    myDog.printType();
  }
}
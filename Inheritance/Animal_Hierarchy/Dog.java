package Inheritance.Animal_Hierarchy;
public class Dog extends Animal{
    public Dog(String name,int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println(name+" barks");
    }
}


package Inheritance.Animal_Hierarchy;
public class Animal {
    String name;
    int age;
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void makeSound(){
        System.out.print("Animal noises");
    }
}



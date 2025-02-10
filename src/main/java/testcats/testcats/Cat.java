/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcats.testcats;

/**
 *
 * @author Zaki Asmat
 */
public class Cat
{
    String name;
    int    age;
    String species;
    
    public Cat(String name, int age, String species)
    {
        this.name    = name;
        this.age     = age;
        this.species = species;
    }
    
    public void hunt()
    {
        System.out.println("I am " + name + ", a " + age + " year old " + species + ". I stalk, pounce, kill, and then eat my prey!");
    }
    
    public String talk()
    {
        return "ROAR";
    }
    
    public void eat()
    {
        System.out.println("I eat fresh meat.");
    }
}
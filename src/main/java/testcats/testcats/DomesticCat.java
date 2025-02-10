/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testcats.testcats;

/**
 *
 * @author Zaki Asmat
 */
public class DomesticCat extends Cat
{
    public DomesticCat(String name, int age, String species)
    {
        super(name, age, species);
    }

    public String talk()
    {
        return "meow";
    }

    public void hunt()
    {
        System.out.println("I am " + name + ", a " + age + " year old " + species + ". They only feed me can food :(");
    }
}

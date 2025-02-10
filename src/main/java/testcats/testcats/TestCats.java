/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testcats.testcats;

/**
 *
 * @author Zaki Asmat
 */
public class TestCats 
{

    public static void main(String[] args) 
    {
        DomesticCat stormy = new DomesticCat("Stormy", 3, "domestic cat");
        System.out.println(stormy.talk());
        stormy.hunt();
        
        Lion leo = new Lion("Leo", 14, "lion");
        System.out.println(leo.talk());
        
        leo.hunt();
        
        
    }
}

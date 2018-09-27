/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Main {
    
    public static void main(String[] args) {
    
        Hallgató h1= new Hallgató("Bőrönd Ödön", "ASD12", 1);
        Hallgató h2= new Hallgató("Deb Ella", "DFG567", 1);
        
        h1.köszön1();
        h1.köszön2(h2);
        
    }
    
}

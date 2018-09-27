/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Hallgató {
    String név;
    String nkód;
    int évfolyam;
    double átlag;

    public Hallgató(String név, String nkód, int évfolyam) {
        this.név = név;
        this.nkód = nkód;
        this.évfolyam = évfolyam;
    }
    
    public void köszön1()
    {
        System.out.println("Jó napot Tanár Úr!");
    }
    
    public String getNév()
    {
       return this.név;
    }
    
    public void köszön2(Hallgató h)
    {
       System.out.println("Szia"+" "+ h.getNév());
    }
}

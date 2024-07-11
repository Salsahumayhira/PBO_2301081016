/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_p02042024;

/**
 *
 * @author Salsabilla Humayhira saputri
 */
public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;
    
    public Balok()
    {
        
    }
    
    public Balok(int panjang)
    {
        this.panjang = panjang;
    }
    
    public Balok(int panjang, int lebar, int tinggi)
    {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public int getPanjang()
    {
        return panjang;
    }
    
    public int getlebar()
    {
        return lebar;
    }
    public int getTinggi()
    {
        return tinggi;
    }
    public void setPanjang (int panjang)
    {
        this.panjang = panjang;
    }
    public void setLebar (int lebar)
    {
        this.lebar = lebar;
    }
   public void setTinggi(int tinggi)
   {
       this.tinggi = tinggi;
   }
   public int hitungLuasAlas(){
       return panjang *lebar;
   }
   public int hitungLuasPermukaan(){
       int lp;
       lp = (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
       return lp;
   }
   public int hitungVolume(){
       return panjang*lebar*tinggi;
   }
   public int hitungVolume (int la){
       return la*tinggi;
   }
   
   public void printBalok(){
       System.out.println("Panjang ="+ panjang);
       System.out.println("lebar ="+ lebar );
       System.out.println("tinggi ="+ tinggi );
   }
   
   public void printBalok(int la, int lp, int vol){
       System.out.println("Luas alas ="+ la);
       System.out.println("Luas permukaan ="+ lp );
       System.out.println("Volume ="+ vol );
   }
   
   
}

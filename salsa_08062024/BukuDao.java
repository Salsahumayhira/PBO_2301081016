/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salsa_08062024;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Salsabilla Humayhira saputri
 */
public class BukuDao {
    private List<Buku> data = new ArrayList();

   public BukuDao(){
      data.add(new Buku ("A001","resep makanan","salsa","salsabila","2024"));
      data.add(new Buku ("A002","resep minum","salsa","salsabila","2024"));
   }
    public void insert(Buku buku){
        data.add(buku);
        
    }
    public void update(int index, Buku buku){
        data.set(index,buku);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Buku getBuku (int index){
        return data.get(index);
    }
    public List<Buku> getAll(){
        return data;
    }

   
}

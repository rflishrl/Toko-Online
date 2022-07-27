package tokoonline;
import java.util.ArrayList;
public class Barang {
    
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Barang(){
        
        this.namaBarang.add("Cokelat Kacang");
        this.stok.add(10);
        this.harga.add(12000);
        
        this.namaBarang.add("Sabun cuci kaki");
        this.stok.add(12);
        this.harga.add(6000);
        
        this.namaBarang.add("Odol Arang");
        this.stok.add(20);
        this.harga.add(13000);
    }
    
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    
    public void setStok(int stok){
        this.stok.add(stok);
    }
    
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }
    
    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);
    }
    
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
    
}

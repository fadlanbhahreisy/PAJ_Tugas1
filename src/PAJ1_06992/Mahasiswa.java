package PAJ1_06992;
public class Mahasiswa {
    private String npm,nama;
    
    //constructor
    public Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }
    
    //getter
    public String getNpm() {
        return npm;
    }
    public String getNama() {
        return nama;
    }
}

// Raffi Adyatma
// SI-A

package tugasLan1;

public class Mahasiswa {

    // kode yg lebih simpel dapat menggunakan public daripada private
    // dengan public maka tidak memerlukan method untuk menambahkan dan mendapatkan value dari variabel
    private String nama,
                  NIM,
                  alamat;

    // memeberikan value kepada variabel nama, NIM, dan alamat
    public void addNama(String nama){
        this.nama = nama;
    }
    public void addNIM(String NIM){
        this.NIM = NIM;
    }
    public void addAlamat(String alamat){
        this.alamat = alamat;
    }

    // mendapatkan value dari setiap variabel
    public String getNama(){
        return this.nama;
    }
    public String getNIM(){
        return this.NIM;
    }
    public String getAlamat(){
        return this.alamat;
    }

}

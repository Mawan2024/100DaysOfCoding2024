class mahasiswa {
    
        private String nama;
        private int umur;
        public mahasiswa(String nama, int umur){
            this.nama = nama;
            this.umur = umur;
        }
        @Override
        public String toString(){
            return "nama:"+nama+",umur:"+umur+"tahun";
}
}
public class main {
    public static void main(String[] args) {
       mahasiswa mhs = new mahasiswa("mawan", 19);
        
        System.out.println(mhs);
    }
}

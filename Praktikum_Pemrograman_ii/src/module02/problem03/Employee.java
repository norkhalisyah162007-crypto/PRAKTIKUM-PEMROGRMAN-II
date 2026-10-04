package module02.problem03;

public class Main {
    public static void main(String[] args) {

        Employee e = new Employee();

        //Pada baris ini terjadi error karena kurang titik koma diakhir (;)
        //e.name = "Roi"
        e.name = "Roi";

        //Pada baris ini awalnya terjadi error karena atribut sebelumnya bertipe char (padahal data yang dimasukkan bertipe teks)
        e.origin = "Kingdom of Orvel";
        e.setRole("Assasin");

        //Pada baris ini output tidak sesuai karena nilai age belum diisi dan hasilnya 0
        e.age =17;

        System.out.println("Nama: " + e.getName());
        System.out.println("Asal: " + e.getOrigin());
        System.out.println("Jabatan: " + e.role);
        System.out.println("Umur: " + e.age + " tahun");
    }
}

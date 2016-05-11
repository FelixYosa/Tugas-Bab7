//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package mainsalon;

public abstract class Salon {

    private String nama;
    private String member;

    public Salon(String nama, String member) {
        this.nama = nama;
        this.member = member;
    }

    public String getNama() {
        return nama;
    }

    public String getMember() {
        return member;
    }

    public String getNota() {
        return ("Nama\t: " + getNama() + "\nMember\t: " + getMember());
    }

    public abstract double diskon();

    public abstract double Total();
}

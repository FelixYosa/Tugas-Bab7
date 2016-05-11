//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package mainsalon;

public class Biasa extends Salon {

    private int jasa, barang;

    public Biasa(String nama, String member, int jasa, int barang) {
        super(nama, member);
        this.jasa = jasa;
        this.barang = barang;
    }

    public double getJasa() {
        return jasa;
    }

    public double getBarang() {
        return barang;
    }

    @Override
    public double diskon() {
        return 0;
    }

    @Override
    public double Total() {
        return getJasa() + getBarang();
    }

    public String getNota() {
        return super.getNota() + "\nTotal\t: " + Total();
    }
}

//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package mainsalon;

public class Silver extends Salon {

    private double jasa, barang;

    public Silver(String Nama, String Member, double jasa, double barang) {
        super(Nama, Member);
        setJasa(jasa);
        setBarang(barang);
    }

    public void setJasa(double jasa) {
        this.jasa = jasa;
    }

    public double getJasa() {
        return jasa;
    }

    public void setBarang(double barang) {
        this.barang = barang;
    }

    public double getBarang() {
        return barang;
    }

    @Override
    public double diskon() {
        return (getJasa() * 10 / 100) + (getBarang() * 10 / 100);
    }

    @Override
    public double Total() {
        return getJasa() + getBarang() - diskon();
    }

    public String getNota() {
        return (super.getNota() + "\nBiaya\t: " + getJasa() + "\nBarang\t: " + getBarang() + "\nDiskon\t: " + diskon() + "\nTotal\t: " + Total());
    }
}

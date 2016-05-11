//Nama : Felix Yosa H. S.
//NIM : 155150400111129
//Kelas : SI-H

package mainsalon;

public class Premium extends Salon {

    private double jasa, Produk;

    public Premium(String Nama, String Member, double jasa, double Produk) {
        super(Nama, Member);
        setJasa(jasa);
        setBarang(Produk);
    }

    public void setJasa(double jasa) {
        this.jasa = jasa;
    }

    public double getJasa() {
        return jasa;
    }

    public void setBarang(double Produk) {
        this.Produk = Produk;
    }

    public double getBarang() {
        return Produk;
    }

    @Override
    public double diskon() {
        return (getJasa() * 20 / 100) + (getBarang() * 10 / 100);
    }

    @Override
    public double Total() {
        return getJasa() + getBarang() - diskon();
    }

    public String getNota() {
        return (super.getNota() + "\nBiaya\t: " + getJasa() + "\nBarang\t: " + getBarang() + "\nDiskon\t: " + diskon() + "\nTotal\t: " + Total());
    }
}

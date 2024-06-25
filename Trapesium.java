public class Trapesium {
    public double base;
    public double Bbase;
    public double height;

    Trapesium(String base, String Bbase, String height) {
        this.base = Double.parseDouble(base);
        this.Bbase = Double.parseDouble(Bbase);
        this.height = Double.parseDouble(height);
    }

    public double luas(){
        return (this.base + this.Bbase) * this.height / 2;
    }
    public double keliling(){
        return this.base + this.Bbase + this.base + this.Bbase;
    }

}

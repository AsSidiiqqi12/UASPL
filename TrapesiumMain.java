import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TrapesiumMain {
    public static void main(String[] args) {
        String namaFilel = "C:/UasPL/src/SisiTrapesium.txt";
        List<Trapesium> tr = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(namaFilel))){
            String line;
            br.readLine();
            while ((line = br.readLine()) != null){
                String[] pisah = line.split(",");
                Trapesium trape = new Trapesium(pisah[0],pisah[1],pisah[2]);
                tr.add(trape);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        try(FileWriter fw = new FileWriter("C:/UasPL/src/KelilingBlmUrut.txt")) {
            for (Trapesium trr : tr) {
                double luas = trr.luas();
                double keliling = trr.keliling();
                System.out.println("luas TRapesium: " + luas);
                fw.write(keliling + "\n");
            }
            System.out.println("Keliling sudah ditulis di file nya bro");

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProgramTrapesiumUrut {
    public static void main(String[] args) {
        String nama = "C:/UasPL/src/KelilingBlmUrut.txt";
        String namaurut = "C:/UasPL/src/KelilingUrut.txt";
        List<Double>trapekel = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(nama))){
            String line;
            while ((line = br.readLine()) != null){
                trapekel.add(Double.parseDouble(line));
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
        int n = trapekel.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(trapekel.get(j) > trapekel.get(j + 1)){
                    Double temp = trapekel.get(j);
                    trapekel.set(j, trapekel.get(j + 1));
                    trapekel.set(j + 1, temp);

                }
            }
        }
        try (FileWriter fw = new FileWriter(namaurut)){
            for (double kelilng : trapekel){
                fw.write(kelilng + "\n");
            }
            System.out.println("Udah Ditulis Mas Pohan");
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

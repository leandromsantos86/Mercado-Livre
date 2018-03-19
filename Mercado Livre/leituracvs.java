package stack;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class LeiaCVS {

  public static void main(String[] args) {

    LeituraCVS obj = new LeituraCVS();
    obj.run();

  }

  public void run() {

    String arquivoCSV = "contatos.csv";
    BufferedReader br = null;
    String linha = "";
    String csvDivisor = ",";
    try {

        br = new BufferedReader(new FileReader(contatosCSV));
        while ((linha = br.readLine()) != null) {

            System.out.println("Nome; sobrenome, e-mail");

        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  }

} 
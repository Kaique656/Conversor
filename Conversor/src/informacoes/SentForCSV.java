package informacoes;

import produtos.Produto;
import produtos.SaveThatInformation;

import java.io.*;

public class SentForCSV {
    public static final String arquiovocsv = "contato.csv" ;
    SaveThatInformation csv = new SaveThatInformation();
    File ark= new File(arquiovocsv);

    public SentForCSV () throws IOException {
        try (BufferedWriter bw = new BufferedWriter( new FileWriter(ark,true))){
            for (Produto produto : SaveThatInformation.getInformacoes()) {
                bw.write(produto.toString());
            }
        } catch ( Exception e ){
            throw new IllegalArgumentException("Nao pode ser feito a transacao o motivo e " + e.getCause());
        }
    }
}

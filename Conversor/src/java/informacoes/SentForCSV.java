package java.informacoes;

import java.informacoes.produtos.Produto;
import java.informacoes.produtos.SaveThatInformation;

import java.io.*;

public class SentForCSV {
    public static final String arquiovocsv = "arquivo.csv";
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

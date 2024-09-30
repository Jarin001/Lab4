import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class CSVReader implements FileReader {

    @Override
    public List<Transaction> readTransactions(String filepath) {
        List<Transaction> transactions = new ArrayList<>();
        try{
            Scanner br= new Scanner(new File("Transaction.txt"));

            while (br.hasNextLine()){
                String line = br.nextLine();
                String[] fields = line.split(",");
                String date = fields[0].trim();
                double amount = Double.parseDouble(fields[1].trim());
                String description = fields[2].trim();
                transactions.add(new Transaction(date, amount, description));
            }
        }
        catch (IOException e){
          e.printStackTrace();
        }
        return transactions;
    }
}

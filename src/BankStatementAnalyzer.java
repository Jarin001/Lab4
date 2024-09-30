
import java.io.Reader;
import java.util.List;
import java.util.ArrayList;
public class BankStatementAnalyzer {
    private List<Transaction> transactions;

    public BankStatementAnalyzer(){
        transactions = new ArrayList<>();
    }

    public double calculateNetBalance(){
        double total = 0;
        for (Transaction transaction : transactions){
            total += transaction.getAmount();
        }
        return total;
    }

    public long countTransactionsInMonth(String monthYear){
        long count = 0;
        for (Transaction transaction : transactions){
            if(transaction.getDate().contains(monthYear)){
                count++;
            }
        }
        return count;
    }

}

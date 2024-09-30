import java.util.List;
public interface FileReader {
    List<Transaction> readTransactions(String filepath);
}

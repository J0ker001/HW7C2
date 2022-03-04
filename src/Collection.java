import java.util.HashSet;
import java.util.List;

public interface Collection {

    List<Integer> oddNumbers(List<Integer> nums);

    HashSet<Integer> evenUniqueNumbers(List<Integer> nums);

    HashSet<String> uniqueWords(List<String> words);

    int calculationDuplicates(List<String> words);
}

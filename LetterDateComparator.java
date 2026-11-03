package lesson_8.hash7;
import java.util.Comparator;
public class LetterDateComparator implements Comparator<Letter> {
    @Override
    public int compare(Letter l1, Letter l2){
        return l1.dateReceived.compareTo(l2.dateReceived);
    }
}

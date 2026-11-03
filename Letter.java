package lesson_8.hash7;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Letter { 
    
    public String authorName;      // имя отправителя
    public LocalDate dateReceived; // дата получения письма
    public String text;            // текст письма

    public Letter(String senderName, LocalDate dateReceived, String text) {
        this.authorName = senderName;
        this.dateReceived = dateReceived;
        this.text = text;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.authorName);
        hash = 97 * hash + Objects.hashCode(this.dateReceived);
        hash = 97 * hash + Objects.hashCode(this.text);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Letter other = (Letter) obj;
        if (!Objects.equals(this.authorName, other.authorName)) {
            return false;
        }
        if (!Objects.equals(this.text, other.text)) {
            return false;
        }
        return Objects.equals(this.dateReceived, other.dateReceived);
    }
   
}

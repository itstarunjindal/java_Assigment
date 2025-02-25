import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateArithmetic {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate initialDate = LocalDate.of(2024, 2, 25);
        
        LocalDate modifiedDate = initialDate.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        
        System.out.println("Initial Date: " + initialDate.format(formatter));
        System.out.println("Modified Date: " + modifiedDate.format(formatter));
    }
}

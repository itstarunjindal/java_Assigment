public class Pen_Distribution {
    public static void main(String[] args) {
        int total_pens = 14;
        int student = 3;
        int remainder = total_pens % student;
        int each_student = (total_pens-1) / student;

        System.out.println("Each student get"+ each_student+ "and remaining pen not destributed"+ remainder);
    }
    
}

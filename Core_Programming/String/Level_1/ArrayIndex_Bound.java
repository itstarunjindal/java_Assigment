import java.util.Scanner;

public class ArrayIndex_Bound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[2];
        for(int i=0;i<2;i++){
            name[i] = sc.nextLine();
        }
        int i = sc.nextInt();
        getName(name,i);
    }
    private static void getName(String[] name, int i){
        try{
            System.out.println(name[i]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}

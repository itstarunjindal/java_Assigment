import java.util.Random;

public class Football_Team_Height {

    public static void main(String[] args) {
        int[] height = new int[11];

        Random random = new Random();

        for(int i=0;i<height.length;i++){
            height[i] = random.nextInt(100) + 150;
        }

        System.out.println("Shortest height: "+ findShortestHeight(height));

        System.out.println("Shortest height: "+ findTallestHeight(height));

        System.out.println("Shortest height: "+ calculateMeanHeight(height));
    }

    public static double calculateMeanHeight(int[] height){

        int sum = 0;
        for(int i=0;i<height.length;i++){
            sum+=height[i];
        }

        return (double) sum/height.length;
    }


    public static int findShortestHeight(int[] height){
        int shortest = height[0];

        for(int h : height){
            if(h<shortest){
                shortest = h;
            }
        }
        return shortest;
    }

    public static int findTallestHeight(int[] height){
        int tallest = height[0];

        for(int h : height){
            if(h<tallest){
                tallest = h;
            }
        }
        return tallest;
    }
}
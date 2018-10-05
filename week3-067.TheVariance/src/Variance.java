import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int c : list)
            sum = sum+c;

        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avg = (double)sum(list) / (double)list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double tvar=0;
        double avg = average(list);

        for (int val : list) {
            double n = Math.pow((val - avg),2);
            tvar = tvar + n;
        }

        double variance = tvar / ((double)list.size()-1);

        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}

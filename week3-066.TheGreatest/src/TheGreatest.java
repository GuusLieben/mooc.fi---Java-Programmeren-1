import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int loops = list.size();
        int i=0;
        int omax = list.get(0);

        while (i <= loops) {
            for (int val : list) {
                omax = Math.max(val, omax);
                i++;
            }
        }
        return omax;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
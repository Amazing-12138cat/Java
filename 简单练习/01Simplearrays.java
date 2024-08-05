import java.util.Arrays;
public class 01Simplearrays {
    public static void main(String[] args) {
        int[][] ns = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 7, 8, 9 }
        };
        for (int[] i : ns){
            for (int j :i){
                System.out.println(j);
            }
        }
        System.out.println(Arrays.deepToString(ns));
    }
}

import java.util.LinkedList;
import java.util.List;

public class FiveAugust {
    public static List<Integer> addToArrayForm(int[] num, int k){
        LinkedList<Integer> list = new LinkedList<>();
        int i = num.length-1;

        while(i>=0 || k > 0){
            if(i>=0){
                k = k + num[i];
                i--;
            }
            list.addFirst(k%10);
            k = k / 10;
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(arr, k));
    }
}

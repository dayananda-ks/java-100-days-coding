import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int Array [] = {1, 2, 3, 4, 5};
        int i = 0,j = Array.length -1;
        while(i < j){
            int temp = Array[i];
            Array[i] = Array[j];
            Array[j] = temp;
            i ++;
            j --;
        }
        System.out.println(Arrays.toString(Array));
    }
}

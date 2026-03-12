public class TWoSum {

    public static void main(String[] args) {
      
        int[] num1 = {2,4,3};
        int[] num2 = {5,6,4};

        int n = num1.length;
        int m = num2.length;

        int max = Math.max(n, m);
        int[] result = new int[max + 1];

        int carry = 0;

        for(int i = 0; i < max; i++) {

            int a = (i < n) ? num1[i] : 0;
            int b = (i < m) ? num2[i] : 0;

            int sum = a + b + carry;

            result[i] = sum % 10;
            carry = sum / 10;
        }
        if(carry != 0)
            result[max] = carry;

        for(int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}

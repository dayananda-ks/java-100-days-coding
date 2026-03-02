// Recursion Method

public class Recursion {

    public void value(int a) {
        System.out.println(a);
        if( a >= 10){
            return;
        }
        value(a + 1);
    }
  
    public static void main(String[] args) {
        Recursion rec = new Recursion();
        rec.value(1);
    }
}
/* OUTPUT :
1
2
3
4
5
6
7
8
9
10
*/


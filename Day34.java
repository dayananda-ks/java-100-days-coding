/*
Find the missing number in a given array.
The program checks whether the numbers in the array are consecutive.
If any number is not consecutive, it prints the missing number and stops the loop.
*/


class FindMissingNumber {
    public static void main(String[] args) {
        
        int[] array = {1,2,3,4,6,7,8,9};
        for(int i = 0; i < array.length; i++){
            if(array[i] != i + 1){
                System.out.println(" Missing number is: " + (i + 1));
                break;
            }
        }
    }
}
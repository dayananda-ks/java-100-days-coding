// TWO SUM BRUTE FORCE APPROACH......


class BruteForceApproach{
  
    public static void main(String[] args){

        int target = 9;
      
        int[] list = {2,7,11,15};

        for(int i = 0; i < list.length; i++){

            for(int j = i + 1; j < list.length; j++){

                if(list[i] + list[j] == target){

                    System.out.println("Output: [" + i + "," + j + "]");
                  
                }
              
            }
          
        }
      
    }
  
}

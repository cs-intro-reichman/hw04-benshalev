public class ArrayOps {
    public static void main(String[] args) {
       int[] array1 = {0,1,2,3};
       System.err.println(findMissingInt(array1)); 
    }
    
    public static int findMissingInt (int [] array) {
        // Write your code here:
        if (array.length == 1){
            return 1;
        }
        int sum1 = 0;
        int firstsum = array.length;
        for(int i = 0; i < array.length; i++){
            firstsum = firstsum + i;
        }
        for(int j = 0; j < array.length; j++ ){
            sum1 = sum1 + array[j];
        }
        int ret = firstsum - sum1 ;  
        return ret;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        return 0;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        return false;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}

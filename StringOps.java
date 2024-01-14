public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    
    
    public static void main(String[] args) {
        String lowString = "Hello World";
        System.out.println(capVowelsLowRest(lowString));
    }

    public static String capVowelsLowRest (String str) {
        // Write your code here:
        String fixstring = "";
        int length = str.length() ;
        for(int i = 0; i< length; i++){
            char ch = str.charAt(i);
            //if (ch == ' '){
              //  fixstring = fixstring + ch;
            //}
            if ( ch >= 97 && ch <= 122){
                if (ch == 97 || ch == 101 || ch == 111 || ch ==117 || ch == 105 ){
                    ch = (char) (ch - 32);
                    fixstring = fixstring + ch;
                }
            }
            if (ch >= 65 && ch <= 90){
                if (ch != 65 && ch != 69 && ch != 73 && ch != 79 && ch != 85){
                    ch = (char) (ch + 32);
                    fixstring = fixstring + ch;
                }
            }
            else{
                fixstring = fixstring + ch;
            }
        }
        return fixstring;
    }

    public static String camelCase (String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf (String str, char chr) {
        // Write your code here:
        int count = 0;
        for(int i = 0; i< str.length(); i++){
            if (chr == str.charAt(i)){
                count++;
            }
        }
        int[] arr = new int[count];
        for(int j = 0; j < arr.length; j++){
            arr[j] = 0; 
        }
        count = 0;
        for(int i = 0; i< str.length(); i++){
            if (chr == str.charAt(i)){
                arr [count] = i; 
                count++;
            }
       }  
       return arr;
    }
}
   

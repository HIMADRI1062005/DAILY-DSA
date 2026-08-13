 // Reverse Digits //gfg

 
 public class reversedigits {

       static int reverseDigits( int num){ // method 
        int revDigit =0;
        // ans = ans *10+curentDigit

           while(num!=0){
               int digit = num%10;
               //reverse num calculater as  per formula
               revDigit=revDigit*10 +digit;
               // last digit remove 
               num = num/10;
           }
           // eaa nahi  daluga too code run hoga
           return revDigit;

       }


    public static void main(String[] args) {// method 
        int num = 122;
        int revDigit =reverseDigits(num);
        System.out.println(revDigit);
    }
}
    
//khatam

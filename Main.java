// Check Prime Number
//public class Main{
//     public static void main(String[] args) {

//         int n = 7;
//         boolean isPrime = true;

//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n % i == 0){
//                 isPrime = false;
//                 break;
//             }
//         }

//         if(isPrime)
//             System.out.println("Prime");
//         else
//             System.out.println("Not Prime");
//     }
// }


//Check Palindrome
// public class Main {
//     public static void main (String[]args){
//         int a =1446;
//         int org = a;
//         int reve = 0 ;
//     while(a>0){
//     int digit = a% 10;
//     reve = reve *10 + digit;
//     a = a/10;
//     }

    
//     if(org==reve){
//         System.out.println("Palin");
//     }else{
//         System.out.println("not");
//     }
// }
// }


// fibonacci series
// public class Main {

//     public static void main(String[] args) {

//         int n = 10;
//         int a = 0;
//         int b = 1;

//         System.out.print(a + " " + b + " ");

//         for(int i = 2; i < n; i++){
//             int c = a + b;
//             System.out.print(c + " ");
//             a = b;
//             b = c;
//         }

//     }

// }


//Factorial
// public class Main {
//     public static void main(String[]arg){
//         int num = 6;
//         int factorial = 1;
//         for(int i = 1 ; i<=num ; i++){
//             factorial = factorial * i;
//         }
//         System.out.print(factorial);
//     }
// }


// Reverce Number
public class Main {
    public static void main(String[]arg){
        int num = 124;
        int rev = 0;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.print(rev);
    }
}


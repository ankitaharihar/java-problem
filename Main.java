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
// public class Main {
//     public static void main(String[]arg){
//         int num = 124;
//         int rev = 0;
//         while(num > 0){
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num = num / 10;
//         }
//         System.out.print(rev);
//     }
// }

// GCD
// public class Main {
//     public static void main(String[] args) {
//         int a = 48;
//         int b = 18;
//         int gcd = 1;

//         for(int i = 1; i <= Math.min(a, b); i++){
//             if(a % i == 0 && b % i == 0){
//                 gcd = i;
//             }
//         }

//         System.out.println("GCD: " + gcd);
//     }
// }


// LCM
// public class Main {
//     public static void main(String[] args) {
//         int a = 12;
//         int b = 15;
//         int lcm = (a * b) / gcd(a, b);
//         System.out.println("LCM: " + lcm);
//     }

//     public static int gcd(int x, int y) {
//         if (y == 0) {
//             return x;
//         }
//         return gcd(y, x % y);
//     }
// }


//largest number in array
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {3, 5, 7, 2, 8};
//         int max = arr[0];

//         for(int i = 1; i < arr.length; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }

//         System.out.println("Largest number: " + max);
//     }
// }

//Smallest number in array
//  public class Main {  
//         public static void main(String[] args) {  
//             int[] arr = {3, 5, 7, 2, 8};  
//             int min = arr[0];  
    
//             for(int i = 1; i < arr.length; i++){  
//                 if(arr[i] < min){  
//                     min = arr[i];  
//                 }  
//             }  
    
//             System.out.println("Smallest number: " + min);  
//         }  
//     }
   

//Second Largest Element (VERY COMMON)
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {3, 5, 7, 2, 8};
//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;

//         for(int num : arr){
//             if(num > largest){
//                 secondLargest = largest;
//                 largest = num;
//             } else if(num > secondLargest && num != largest){
//                 secondLargest = num;
//             }
//         }

//         if(secondLargest == Integer.MIN_VALUE){
//             System.out.println("No second largest element.");
//         } else {
//             System.out.println("Second Largest number: " + secondLargest);
//         }
//     }
// }



// string reverse 
// public class Main {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         String rev = "";
//         for(int i = str.length() - 1; i >= 0; i--){
//             rev += str.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }


//Count Vowels in String 
// public class Main {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         int count = 0;
//         for(int i = 0; i < str.length(); i++){
//             char ch = Character.toLowerCase(str.charAt(i));
//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 count++;
//             }
//         }
//         System.out.println("Number of vowels: " + count);
//     }
// }


//count vowels in string 
// public class Main {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         int count = 0;
//         for(int i = 0; i < str.length(); i++){
//             char ch = Character.toLowerCase(str.charAt(i));
//             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
//                 count++;
//             }
//         }
//         System.out.println("Number of vowels: " + count);
//     }
// }


//sum of digit 
// public class Main {
//     public static void main(String[] args) {
//         int num = 1234;
//         int sum = 0;
//         while(num > 0){
//             int digit = num % 10;
//             sum += digit;
//             num = num / 10;
//         }
//         System.out.print(sum);
//     }
// }


//Duplicate element in array
// public class Main {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 2, 5};
//         System.out.print("Duplicate elements: ");
//         for(int i = 0; i < arr.length; i++){
//             for(int j = i + 1; j < arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     System.out.print(arr[i] + " ");
//                 }
//             }
//         }
//     }
// }


//linear search / binary search
// public class Main {

//     public static void main(String[] args) {

//         int[] arr = {4, 9, 2, 15, 7};
//         int key = 15;
//         boolean found = false;

//         for(int i = 0; i < arr.length; i++){

//             if(arr[i] == key){
//                 found = true;
//                 break;
//             }

//         }

//         if(found)
//             System.out.println("Element Found");
//         else
//             System.out.println("Not Found");

//     }
// }



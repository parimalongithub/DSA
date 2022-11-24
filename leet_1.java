//leetcode problem number -->1295. Find Numbers with Even Number of Digits
public class leet_1 {


    static int totalnum(int arr[]){
       int count=0;
       for (int num : arr){
           if(even(num)){
               count++;
           }
       }
       return count;

       
   }
   static boolean even(int num){
       int numberdigits= digitscount(num);
       return numberdigits%2==0;
       

   }
   static int digitscount(int num){
       int count=0;
       while(num>0){
           count++;
           num=num/10;

       }
       return count;

       


   }
   

   public static void main(String[] args) {
       int arr []={12,345,2,6,7896};
       System.out.println(totalnum(arr));

       
   }

  
 
   

}
    



package searching;
public class binarysearch {


     //normal binary search----------->  
    static int search(int arr[],int target){
        int start =0;
        int end =arr.length-1 ;
     while(start<=end){
            int mid=(start+end)/2; 
            if(target<arr[mid]){
                end =mid-1;
            }
            else if (target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;

            }
               
        }
        return -1;
    }

    //for agnotics binary search------------>
    static int search2(int arr[],int target){
        int start =0;
        int end =arr.length-1 ;
        Boolean asorde=arr[start]<arr[end];
        while(start<=end){
            int mid=(start+end)/2; 
            if(arr[mid]==target){
                return mid; 
            }

            if(asorde){

            if(target<arr[mid]){
                end =mid-1;}
            
            else if (target>arr[mid]){
                start=mid+1;
            }
        }
            else{
                if(target>arr[mid])
                end =mid-1;
            
            else if (target<arr[mid]){
                start=mid+1;
            }

            }
         
        

    }
    return -1;
    }
    public static void main(String[] args) {
        int arr[]={125,110,45 };
        int target=50;
        System.out.println(search2(arr, target));
        
    }
}

import java.util.Arrays;

public class leet_2 {
    public static void main(String[] args) {
        int ans=0 ;
        int accounts [][]={{1,2,3},{3,2,1}};
        for (int person=0;person<accounts.length;person++   ){
            int sum=0;

            for(int account=0;account<accounts[person].length;account++){

            sum+=accounts[person][account];
            if(sum>ans){
                ans=sum;
            }
            }
        }
            System.out.println(ans);
            

        
    }
}

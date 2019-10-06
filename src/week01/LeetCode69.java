package week01;
/**
 * 
 * @author lenovo
 * Oct 6, 2019
 */
public class LeetCode69 {
	 public static int mySqrt(int x) {
         int left=0;
         int right=x/2+1;
         while(left<right){
             int mid=(left+right)>>1;
             if(mid*mid>x){
                 right=mid-1;
             }else{
                 left=mid;
             }
         }
         return left;
     }
	 /**
	  * ≤‚ ‘∑Ω∑®
	  * @param args
	  */
     public static void main(String[] args) {
         System.out.println(mySqrt(9));
     }
}

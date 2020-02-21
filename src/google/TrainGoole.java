package google;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
//谷歌java测试模板题
public class TrainGoole {
/*样例题谷歌2019年A轮第一题
 * 注意点：谷歌提交的文件名是叫Solution.java，提交的类名必须叫这个否则会报错。日。。。。。
 * 代码注释不能带有中文，有中文会报错的。
 * java提交必须写IO导入文件流，C++可以不需要写，建议打比赛用C++编写。
 * 输出答案必须按照结果样本输出结果必须是下面这个样子如果不是通过不了很坑的。。。。。1代表第几个样例结果
 * Case # 1: result
 * 输入格式第一行代表有几个测试用例
 * 第二行数字一般代表入参样本
 * 第三行数字代表测试样本
 * 第四行代表第二个测试用例的入参
 * 以此类推
 * 一开始看感觉看的很懵
 */

//	public class Solution {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        int N = Integer.parseInt(bufferedReader.readLine());
	        LinkedList<int[]> list =new LinkedList();
	        int[] mArr =new int[N];
	        for (int i = 0; i <N ; i++) {
	            String[] strings1=bufferedReader.readLine().split(" ");
	            String[] strings2=bufferedReader.readLine().split(" ");
	            int m =Integer.parseInt(strings1[1]);
	            int arr[] = new int[strings2.length];
	            for (int j = 0; j <strings2.length ; j++) {
	                arr[j] = Integer.parseInt(strings2[j]);
	            }
	            list.add(i,arr);
	            mArr[i] =Integer.parseInt(strings1[1]);
	        }
	        for (int i = 0; i <N ; i++) {
	            System.out.println("Case #"+(i+1)+": " +train(list.get(i),mArr[i]));
	        }
	    }

	 private static int train(int[] arr, int m) {
	        Arrays.sort(arr);
	        int[] resArr = new int[arr.length-m+1];
	        int sum = 0;
	        int min=Integer.MAX_VALUE;
	        for (int i = 0; i <=arr.length-m ; i++) {
	            for (int j = i; j <m+i ; j++) {
	             resArr[i]+=arr[m+i-1]-arr[j];
	            }
	            min = Math.min(min,resArr[i]);
	        }

	        if (m==arr.length){
	            int temp=0;
	            for (int i = 0; i <m ; i++) {
	                temp +=arr[m-1]-arr[i];
	            }
	            min=Math.min(min,temp);
	        }

	        return min;
	    }
	
}

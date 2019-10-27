package google;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution {

	public static void main(String[] args) throws Exception {
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
		return 0;
	}

}

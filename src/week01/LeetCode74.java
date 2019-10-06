package week01;


/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * @author lenovo
 * Sep 30, 2019
 */
public class LeetCode74 {
		public boolean searchMatrix(int[][] matrix, int target) {
			for (int i=0;i<matrix.length;i++){
				if(target<matrix[i][matrix.length]){
					for(int j=i;j>0;j--){
						return target==matrix[i][j]?true:false;
				}
				}else if(target<matrix[i][matrix.length]){
					return true;
				}
			}
			return true;
		   }
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//			int[] []matrix ={ 
//			          [1,   3,  5,  7],
//			          [10, 11, 16, 20],
//			          [23, 30, 34, 50]
//			};
//			int target = 3;
//			System.out.println(searchMatrix(int matrix[][] ,  target));
//		}
}

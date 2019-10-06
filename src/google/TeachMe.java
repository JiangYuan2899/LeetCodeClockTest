package google;

import java.util.Arrays;
/**
 * KickStrat2019年E轮第二题
 * 
 */

public class TeachMe {
	private int countTeachemployee(int[][]skills){
		/**
		 * 列是员工，行是技能
		 * col is skill,row is employee;
		 */
		int count=0;
		for (int i=1;i<skills.length-1;i++){
			for(int j=0;j<skills[i].length;j++){
				if(Arrays.asList(skills[i+1][j]).contains(skills[i][j])){
					count++;
				}
			}
		}
		return count;
	}
}

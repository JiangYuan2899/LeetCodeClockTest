package google;

import java.util.Arrays;
/**
 * KickStrat2019��E�ֵڶ���
 * 
 */

public class TeachMe {
	private int countTeachemployee(int[][]skills){
		/**
		 * ����Ա�������Ǽ���
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

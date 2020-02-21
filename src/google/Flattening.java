package google;

import java.util.HashMap;
/**
 * KickStrat2019��E�ֵڶ���
 * 
 */

public class Flattening {
	private int ResultFlattening(int[]walls,int K){
		int index=0;
		int result=0;
		for(int i=0;i<walls.length;i++){
			if(walls[i]!=walls[i+1]){
				index++;
			}
			if(index>K){
				result++;
			}
			
		}
		return result;
	}
}

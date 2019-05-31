package com.practice.programs;

public class Push0s {
	
public static void main(String[] args) {
		
		int[] n = {0,5,6,0,1,0,0,0,1,1};
		
		int i =0;
		int j = n.length-1;
		
		int temp =0;
		
		while(i<j){
			
			if(n[i]==0){
				i++;
			}
			else if(n[j]==1){
				j--;
			}
			else{
				temp = n[i];
				n[i]=n[j];
				n[j]=temp;
				i++;
				j--;
				
			}
		}
		for (int k = 0; k < n.length; k++) {
			System.out.println(n[k]);
		}
	}
	
	
	
	

}

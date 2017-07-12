package day9;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int [] save = new int [6];
	
		Random random = new Random();
		
		for(int i = 0; i<6; i++) {
			save[i] = random.nextInt(45)+1;
			
			for(int j=0; j<i; j++) {
				if(save[i] == save[j]) {
					save[i] = random.nextInt(45)+1;
					j=-1;
				}
			}
		}
		for(int i=0; i<save.length; i++) {
			System.out.print(save[i]+" ");
		}
		}
	}

		

	


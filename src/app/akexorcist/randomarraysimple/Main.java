package app.akexorcist.randomarraysimple;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;

public class Main extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		int[] data = new int[10];
		data = randomIntArray(data.length, 10, 55);
	}
	
	public int[] randomIntArray(int count, int min, int max) {
		Random r = new Random();
		int[] data = new int[count];
		for(int i = 0 ; i < count ; i++) 
			data[i] = -1;
		for(int i = 0 ; i < count ; i++) {
			int n = -1;
	    	boolean st = true; 
			while(st) {
				st = false;
				n = r.nextInt((max - min) + 1) + min;
				for(int j = 0 ; j < data.length ; j++) 
					if(n == data[j]) 
						st = true;
			}
			data[i] = n;
		}
		return data;
	}
}

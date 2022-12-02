package takehome2p;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SNthnumber {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		// TODO Auto-generated method stub
		Random rng = new Random();
		int number;
		int[] num = new int[500];
		//num[0]=10;
		//Generating an array with 500 random number
		for(int i=0; i<500; i++)
		{
			number = rng.nextInt(500); //generating the random number
			num[i]=number; //storing the random number in array
				
		}
		/*
		//How to print a array
		for(int j=0;j<500;j++)
		{
			System.out.print(num[j]+" ");
		}
		*/
		//Sorting the array
		Arrays.sort(num);
		for(int k=0;k<500;k++)
		{
			System.out.print(num[k]+" ");
		}
		System.out.println();
		System.out.println("please enter smallest number");
		int n = scr.nextInt();
		System.out.println(num[n-1]);
        

		
	}
}

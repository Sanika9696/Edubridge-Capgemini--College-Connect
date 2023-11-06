package achieveMent;

import java.util.Scanner;

public class PrimeRe {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int flag=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				flag=1;
			}}
		if(flag==1) {
			System.out.println("Not prime");
		}else if(a==0){
			System.out.println("Neutral");
		}else {
			System.out.println("Prime");
		}
		}
	}



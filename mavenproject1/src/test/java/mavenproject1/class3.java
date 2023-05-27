package mavenproject1;

import java.util.Scanner;
import java.util.function.IntToDoubleFunction;

import org.apache.tools.ant.types.resources.selectors.Compare;

public class class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	{ boolean flag = false;
		System.out.println("Enter input number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=2;i<=num/2;i++){
		if(num%i==0)
		{ flag = true; 
		break;
		}
		}
		if(!flag){
		System.out.println(num + " is a prime number");
		} else{
		System.out.println(num + " is not a prime number");
		}
		}
	String s="hii";
	String b="hhhh";
	if (s.compareTo(b)==0){
	System.out.println("true2");	
	}
	System.out.println((s.compareTo(b)));
		}
	
	}



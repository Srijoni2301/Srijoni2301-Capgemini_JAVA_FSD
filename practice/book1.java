package practice;


/*
class book1 {
	 public static void main(String args[]) {
	 int var1; // this declares a variable
	 int var2; // this declares another variable
	 var1 = 1024; // this assigns 1024 to var1
	 System.out.println("var1 contains " + var1);
	 var2 = var1 / 2;
	 System.out.print("var2 contains var1 / 2: ");
	 System.out.println(var2);
	 }
	}




// DATA TYPES
// SUM OF 2 NOS
class book1{
	public static void main(String args[]) {
		int a = 10;
		int b = 25;
		int sum;
		sum = a+b;
		System.out.println("sum is:"+sum);
		
	}
}




// sum of 2 nos from user input

import java.util.*;
public class book1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum;
		sum = a + b;
		System.out.println(sum);
	}
}





// if else
import java.util.*;
public class book1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age >= 18){
			System.out.println("adult");
		}
		else {
			System.out.println("not adult");
		}
	}
}









// if else to find odd and even numbers

import java.util.*;
class book1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num==0) {
			System.out.println("num is 0");
		}
		else if(num % 2 ==0) {
			System.out.println("even");
		}
		else {
			
			System.out.println("odd");
		}
	}
}





// switch case

import java.util.*;
public class book1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		switch(button) {
		case 1: System.out.println("Hello"); 
		break;
		case 2: System.out.println("Namaste"); 
		break;
		default: System.out.println("Invalid input");
		}
	}
}






import java.util.*;
public class book1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = sc.nextInt(); i <5; i++) {
			System.out.print(i);
		}
	}
}





// DO WHILE

import java.util.*;
public class book1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		do {
			System.out.println(i);
			i--;
		}
		while(i>11);
	}
}




// sum of n natural numbers

import java.util.*;
class book1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum1=0;
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			sum1 = sum1+i;
		}
		System.out.println("sum is:"+ sum1);
	}
}







// print the sum of 2 nos using function

import java.util.*;
public class book1{
	public static int Addition(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		return (sum);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Addition(x,y);
	}
	
}






// ARRAY From user input

import java.util.*;
public class book1{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int arr[]= new int[size];
		int i;
		
		for(i=0;i<size;i++) {
			arr[i]= sc.nextInt();
		}
		for(i=0;i<size;i++) {
			System.out.println(arr[i]);
		}
		
	}
}






// PRACTICE

import java.util.*;
public class book1{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]= new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}








// to find the index of a number in array

// LINEAR SEARCH

import java.util.*;
public class book1{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int size = sc.nextInt(); //size of arr
		int arr[]= new int[size]; // array dec
		
		
		
		int i;
		for (i=0; i<size; i++) {
			arr[i]= sc.nextInt();   //input
		}
		
		for (i=0;i<size;i++) {
			System.out.println(arr[i]);   //output
		}
		
		System.out.println("Search:");
		int x = sc.nextInt();      //number to be searched
		
		for(i=0;i<size;i++) {      // if donot use this for loop  then error occurs" arrayindexoutofboundexception" 
			if (arr[i]==x) {               //if that index holds that number
				System.out.println("number is at "+ i);			
			}
		}
	}
}

*/





//STRINGS

import java.util.*;
public class book1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		String word1 = sc.nextLine();
		String word2= sc.nextLine();
		
		String result = word1+word2;      //CONCATENATION
		System.out.println(result);
		
		System.out.println(result.length());  //LENGTH
		
		
		System.out.println(result.charAt(0));   //PRINTS THE CHARACTER PRESENT IN THE LOCATION
		
		
		for(int i =0; i<result.length();i++) {       //LOOP TO PRINT ALL THE CHARACTERS ONE BY ONE OF THE RESULT
			System.out.println(result.charAt(i));
		}
		
		//CompareTo function
		
		if (word1.compareTo(word2)==0) {
			System.out.println("strings are equal");
		}
		else {
			System.out.println("strings not equal");
		}
		
		
		// substring
		
		String sentence="My name is SRI";
		String name= sentence.substring(11, sentence.length());  //from 11th index to the end
		System.out.println(sentence+" "+name);    // also if u provide only the beg inex it takes u to the end index
		sc.close();
	}
}




































































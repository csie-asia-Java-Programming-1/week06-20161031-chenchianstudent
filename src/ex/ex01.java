﻿package ex;
import java.util.Scanner;
/*
 * Topic: 寫一函數 square(n,c)，以 c 字元，印出邊長為 n 之實心正方形。Ex：square(3,'@') 將印出如下形狀
 @@@
 @@@
 @@@
 * Date: 2016/10/31
 * Author: 105021007 陳麒安
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
	
fun1(scn.nextInt());


}

public static void fun1(int n){
	Scanner scn=new Scanner(System.in);	
	char c=scn.next().charAt(0);	
			
for(int i=1;i<=n;i++){
	for(int j=1;j<=n;j++){
	
	System.out.print(c);
	}
	System.out.println();
}
}
}
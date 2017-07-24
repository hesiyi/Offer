package Interview;

import java.util.Scanner;

import ErJinZhi.NumberOf1;

//面试10:二进制中1的个数
public class Tenth {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		NumberOf(a);
		//第二种方法，不移动要数据，而是移动flag
		NumberOf1(b);
		NumberOf2(c);
	}
	//第三种方法,一个数减去1,和这个数&,那么就可以把这个数的最右边的1变为0,一直这样做，就可以计算出这个数1的个数
	private static void NumberOf2(int c) {
		int count=0;
		while(c!=0){
			++count;
			c=(c-1)&c;
		}
		System.out.println(count);
	}
	private static void NumberOf(int a){
		int count=0;
		while(a!=0){
			if((a&1)!=0){
				count++;
			}
			a=a>>1;
		}
		System.out.println(count);
	}
	private static void NumberOf1(int a) {
		// TODO Auto-generated method stub
		int count=0;
		int flag=1;
		while(flag!=0){
			if((a&flag)!=0){
				count++;
			}
			flag=flag<<1;
		}
		System.out.println(count);
	}
}

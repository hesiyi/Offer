package ErJinZhi;
import java.util.Scanner;

//效率提高很多、有几个1进行几次运算
public class NumberOf2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		while (n != 0) {
			count++;
			n = (n - 1) & n;
		}
		System.out.println(count);
	}

}

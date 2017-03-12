package ErJinZhi;
import java.util.Scanner;

//常规解法、每次左移flag的 然后与n进行&
public class NumberOf1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int flag = 1;
		int count = 0;
		while (flag != 0) {
			if ((n & flag) != 0)
				count++;
			flag = flag << 1;
		}
		System.out.println(count);
	}

}

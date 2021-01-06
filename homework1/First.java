package homework1;

import java.util.Scanner;

/**  
 * @ClassName: First
 * @Description: 编写如下一段程序
	定义一个长度为10的数组，并给默认值。
	然后由控制台输入两个整数，第一个表示要访问的数组的索引
				  第二个表示获得的元素要除以的数字
	结果为将第一个数字对应索引的数组元素值除以输入的第二个数字
		
	考虑 以上代码会可能会出现多少种异常，并用异常处理的代码块来处理异常
 * @author LYL
 * @date 2021-01-06 11:50:04
*/

public class First {
	public static void main(String[] args) {
		input();
	}
	
	static int []arr = new int[]{1,2,3,4,5,6,7,8,9,10};
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		try {			
			System.out.println("请输入两个数，第一个表示要访问的数组的索引， 第二个表示获得的元素要除以的数字");
			int index = sc.nextInt();
			int divisor = sc.nextInt();
			System.out.println("结果为："+arr[index]/divisor);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}

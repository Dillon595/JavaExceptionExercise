/**  
 * @Title: Second.java
 * @Description: 
 * @author LYL
 * @date 2021-01-06 12:37:47
 */  

package homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**  
 * @ClassName: Second
 * @Description: 
 * @author LYL
 * @date 2021-01-06 12:37:47
*/

public class Second {
	public static void main(String[] args) {
		System.out.println("请输入三个整数数值作为三角形三条边");
		Scanner sc = new Scanner(System.in);
		try {	
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
		
			try {			
				if(i<=0||j<=0||k<=0) {
					throw new NumberValueException();	//输入的数据不合法时抛出此自定义异常
				}
			}catch(NumberValueException e) {
				//已在此自定义异常中进行输出提示，所以此处不再进行处理
			}
			try {				
				if(i+j>k&&i+k>j&&k+j>i) {
					System.out.println("i = ["+i+"],j = ["+j+"],k = ["+k+"]");
				}else {
					throw new TriangleException();		//若不能构成三角形就抛出此自定义异常
				}
			}catch(TriangleException e) {
				//已在此自定义异常中进行输出提示，所以此处不再进行处理
			}
		}catch(InputMismatchException e) {
			e.printStackTrace();
		}finally {
			sc.close();//结束控制台输入流以防内存泄漏
		}
	}
	
	
}


package homework4;

import java.util.Scanner;

/**  
 * @ClassName: Test
 * @Description: 
 * @author LYL
 * @date 2021-01-06 13:42:18
*/

public class Test extends Drink {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("请输入1-3的饮料类型");
		Scanner sc = new Scanner(System.in);
		try {
			test.getDrink(sc.nextInt());
		} catch (DrinkNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	protected void taste() {
		
	}

}

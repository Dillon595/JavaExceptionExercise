/**  
 * @Title: DrinkNotFoundException.java
 * @Description: 
 * @author LYL
 * @date 2021-01-06 13:35:14
 */  

package homework4;

/**  
 * @ClassName: DrinkNotFoundException
 * @Description: 
 * @author LYL
 * @date 2021-01-06 13:35:14
*/

public class DrinkNotFoundException extends Exception {
	public DrinkNotFoundException(){
		super("异常：对不起，没有没有找到您输入的饮料类型");
	}
}

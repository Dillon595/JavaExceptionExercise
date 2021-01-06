package homework3;

/**  
 * @ClassName: Test
 * @Description: 
 * @author LYL
 * @date 2021-01-06 13:23:13
*/

public class Test {

	public static void main(String[] args) {
		PetShop ps = new PetShop();
		ps.sellPet(1).cry();
		ps.sellPet(2).cry();
		ps.sellPet(0).cry();
		
	}

}

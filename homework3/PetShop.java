package homework3;

/**  
 * @ClassName: PetShop
 * @Description: 
 * @author LYL
 * @date 2021-01-06 13:01:07
*/

public class PetShop {
	public Pet sellPet(int i) {
		try {			
			if(i==1) {
				return new Cat();
			}else if(i==2) {
				return new Dog();
			}else {
				throw new Exception("类型错误！！！");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("欢迎下次光临！！！");
		}
		return null;
	}
}

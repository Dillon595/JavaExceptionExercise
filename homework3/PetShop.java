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
		}finally {		//finally关键字代码块中的语句 不管异常与否都会执行
			System.out.println("欢迎下次光临！！！");
		}
		return null;		//因此方法有返回值，若输入的类型错误以后则返回null
	}
}

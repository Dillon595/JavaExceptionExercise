# JavaExceptionExercise
Java异常的练习
  ##### 1.编写如下一段程序
  定义一个长度为10的数组，并给默认值。
    然后由控制台输入两个整数，第一个表示要访问的数组的索引
            第二个表示获得的元素要除以的数字
    结果为将第一个数字对应索引的数组元素值除以输入的第二个数字

  考虑 以上代码会可能会出现多少种异常，并用异常处理的代码块来处理异常

##### 2.编写如下一段程序：
实现从控制台输入三个数值作为三角形的三条边，以此构造一个三角形。程序应该实现如下功能：
   -->检查输入的命令行参数是否为数值格式，如果输入的数值参数格式错误，则程序可能产生
	InputMismatchException异常（java.util.InputMismatchException 需要导入这个类）
   -->检查输入的命令行参数中是否有负值或0，如果有负值或0，则程序可能产生
 	NumberValueException异常( NumberValueException为自定义异常）
   -->检查输入的命令行参数的三个数值是否能够构造一个三角形，如果不能构造一个三角形，
	则程序可能产生TriangleException异常（TriangleException为自定义异常）
   -->没出现异常则显示三个数字 

   提示：三角形任意两边之和必须大于第三边。


##### 3.(课后)编写继承体系: 宠物（eat(),cry()），猫，狗(重写父类方法)
  1.编写宠物店类 提供方法：出售宠物 Pet sellPet(int i)
     传入1 则返回猫对象，2 则返回狗对象
        2.若传入的参数不是1或2，则抛出异常，显示：类型错误！！！
  3.在方法内使用try catch 处理异常，注意：思考出现异常时如何处理返回值
  4.无论是否有异常 都要能输出一句话：“欢迎下次光临”
  5.测试sellPet() 方法，调用返回的对象的cry方法

##### 41、	建立一个Java抽象类Drink，应当：
a、	声明一个抽象方法taste()，该方法负责输出饮料的味道；
b、	声明int型常量来代表不同的饮料类型（咖啡、啤酒、牛奶），如：
c、	声明静态方法getDrink(int drinkType)，根据传入的参数创建不同的饮料对象，并返回该对象，建议使用switch语句。该方法要求声明DrinkNotFoundException，当没有相对应的饮料类型时，抛出该异常。
2、	建立Drink的具体子类：
a、	分别建立Drink的子类：Coffee（代表咖啡），Beer（代表啤酒），Milk（代表牛奶）;
b、	实现taste()方法，要求在控制台打印各自的味道特征。
建立异常类
``` java
package drink;

public class Milk  extends Drink{

  @Override
  public void taste() {
    // TODO Auto-generated method stub
    System.out.println("牛奶：甜");
  }

}
```
3、	
a、	继承Exception
b、	在Drink的方法getDrink(int drinkType)中声明引发DrinkNotFoundException异常，当传入的参数没有相对应的饮料类型时，抛出异常。
c、	在使用getDrink方法的类中捕捉该异常。
4、	建立Test测试类，测试以上内容的正确性
a、	编写main方法，通过命令行传参的方式传入某种饮料的类型。
b、	在main方法中，调用Drink类的getDrink方法，获得相应的饮料对象。注意捕获DrinkNotFoundException。
c、	然后调用该饮料对象的taste()方法，输出该饮料的味道。
5、	编译程序，并运行。





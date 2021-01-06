
package homework4;

/**
 * @ClassName: Drink
 * @Description:
 * @author LYL
 * @date 2021-01-06 13:27:49
 */

public abstract class Drink {

	protected int type;

	protected abstract void taste();

	public Drink getDrink(int i) throws DrinkNotFoundException {

		switch (i) {
		case 1:
			Coffee a = new Coffee();
			a.taste();
			return a;

		case 2:
			Beer b = new Beer();
			b.taste();
			return b;

		case 3:
			Milk c = new Milk();
			c.taste();
			return c;

		default:
			throw new DrinkNotFoundException();

		}

	}
}

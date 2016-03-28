/**
 * 
 */
package ctec.model;

import java.util.ArrayList;

/**
 * @author kkoc6943
 *
 */
public class Dough extends Pretzel 
{
	public Pretzel()
	{
		super();
		this.setIngredientsList(pretzelIngredients());
	}
	
	private ArrayList<String> pretzelIngredients()
	{
		return null;
	}
}

package ctec.model;

import java.util.ArrayList;

public abstract class Pretzel 
{
	private double servingTemperature;
	private ArrayList<String> ingredients;
	private boolean isTasty;
	public double getServingTemperature() {
		return servingTemperature;
	}
	public void setServingTemperature(double servingTemperature) {
		this.servingTemperature = servingTemperature;
	}
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(ArrayList<String> ingredients) {
		this.ingredients = ingredients;
	}
	public boolean isTasty() {
		return isTasty;
	}
	public void setTasty(boolean isTasty) {
		this.isTasty = isTasty;
	}
}

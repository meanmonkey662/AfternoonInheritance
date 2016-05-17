package pretzel.Controller;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

import pretzel.Model.Bread;
import pretzel.Model.Dough;
import pretzel.View.PretzelFrame;

public class PretzelController
{

	private ArrayList<Random>RandomList;
	
	public PretzelController()
	{
		RandomList = new ArrayList<Random>();
		new PretzelFrame(this);
	}

public void start()
	{
		setupRandomList();

	}

private void swap(int firstLocation, int secondLocation)
{
	Random temp = Random.get(firstLocation);
	Random.set(firstLocation, Random.get(secondLocation));
	Random.set(secondLocation, temp);
	
}

public void insertionSort()
{
	for(int outerLoop = 1; outerLoop < Random.size(); outerLoop++)
		{
			int innerLoop = outerLoop;
			while(innerLoop == 1)
			{
				
			}
		}
}

	public void quicksort(int low, int high)
	{
		if(low < high)
		{
			int midPoint = partition(low, high);
			quicksort(low, midPoint-1);
			quicksort(midPoint+1, high);
		}
	}
	
	private int partition(int low, int high)
	{
		int position = low;
		Random pivot = Random.get(high);
		
		for(int spot = low; spot < high-1; spot++)
		{
			if(Random.get(spot).compareTo(pivot) <= 0)
			{
				if(Random.get(spot).compareTo(pivot) <= 0)
				{
					swap(position, spot);
					position++;
				}
			}
			swap(position, high);
			
			return position;
		}
	}

private void setupRandomList()
	{
		RandomList.add(new Dough());
		RandomList.add(new Bread());
	}

public String showInterfaceStuff()
	{
		String interfaceInfo = "";

		for (Random currentRandom : RandomList)
			{
				interfaceInfo.concat("the current silly thing is"
						+ currentRandom.toString());
				interfaceInfo.concat("\n" + "and it haa silly level of"
						+ currentRandom.isFun());

			}
		return interfaceInfo;
	}

}
	
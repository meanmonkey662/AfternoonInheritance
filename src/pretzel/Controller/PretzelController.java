package Pretzel.Controller;

import javax.swing.*;

import Pretzel.Controller.PretzelController;

public class PretzelPanel extends JPanel
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
			while(inner)
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
		RandomList.add(new PBJ());
		RandomList.add(new Ham());
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
	
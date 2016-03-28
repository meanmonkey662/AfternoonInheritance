package pretzel.View;

import javax.swing.JFrame;

import pretzel.Controller.PretzelController;

public class PretzelFrame extends JFrame
{
	private PretzelController baseController;
	private PretzelPanel basePanel;
	
	public PretzelFrame(PretzelController baseController)
	{
		this.baseController = baseController;
		basePanel = new PretzelPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setTitle("Pretzels");
		this.setSize(800,800);
		this.setVisible(true);
	}
}

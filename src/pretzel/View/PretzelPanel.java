package pretzel.View;

import javax.swing.*;

import pretzel.Controller.PretzelController;

public class PretzelPanel extends JPanel
{
	private JButton PBJButton;
	private PretzelController baseController;
	private JButton HamButton;
	private SpringLayout baseLayout;
	
	
		public PretzelPanel(PretzelController baseController)
		{
			this.baseController = baseController;
			baseLayout = new SpringLayout();
			PBJButton = new JButton("Pizza Pretzel");
			HamButton = new JButton("Cinamon Pretzel");
			
			setupPanel();
			setupLayout();
			setupListeners();
		}
		
		private void setupPanel()
		{
			
		}
		
		private void setupLayout()
		{
			
		}
		
		private void setupListeners()
		{
			
		}
}

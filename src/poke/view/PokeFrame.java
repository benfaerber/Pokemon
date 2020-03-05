package poke.view;

import javax.swing.JFrame;
import poke.controller.PokeController;

public class PokeFrame extends JFrame
{

	private static final long serialVersionUID = -6734009653685968743L;
	private PokeController app;
	private PokePanel panel;
	
	public PokeFrame(PokeController app)
	{
		super();
		this.app = app;
		this.panel = new PokePanel(this.app);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setTitle("Chatbot");
		this.setVisible(true);
	}
}

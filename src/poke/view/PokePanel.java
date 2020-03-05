package poke.view;

import javax.swing.*;

import poke.controller.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

public class PokePanel extends JPanel
{
	private static final long serialVersionUID = 1L;

	private PokeController app;

	
	public PokePanel(PokeController app)
	{
		super();
		this.app = app;

		
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

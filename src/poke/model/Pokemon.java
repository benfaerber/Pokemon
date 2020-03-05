package poke.model;

public abstract class Pokemon
{
	private String name;
	private int pokedexNumber;
	private int health;
	private boolean canEvolve;
	
	
	public Pokemon(int pokedexNumber, String name)
	{
		this.pokedexNumber = pokedexNumber;
		this.name = name;
		this.health = 100;
		this.canEvolve = false;
		
	}
}

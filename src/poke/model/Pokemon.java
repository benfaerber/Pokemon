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
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getPokedexNumber()
	{
		return pokedexNumber;
	}

	public int getHealth()
	{
		return health;
	}

	public void setHealth(int health)
	{
		this.health = health;
	}

	public boolean canEvolve()
	{
		return canEvolve;
	}

	public void setCanEvolve(boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}
}

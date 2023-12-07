
public class Pokemon {
	
	private int health;
	private String type; 
	private String name;
	private boolean isAlive;
	public static int num;
	
	public Pokemon() {
		
		//same for every Pokemon object
		this.health = 100;
		this.isAlive = true;
		
	}
	
	public Pokemon(String name, String type) {
		
		this();
		
		//different for every Pokemon object
		this.name = name;
		this.type = type;
		
		num++;
		
	}
	
	public void printPokemon() {
		
		System.out.println("Health: " + health);
		System.out.println("Type: " + type);
		System.out.println("Name: " + name);
		System.out.println("isAlive: " + isAlive);
		System.out.println();
		
	}
	
	public void setName(String initName) {
		
		name = initName;
		
	}

	public void setType(String initType) {
		
		type = initType;
		
	}
	
	public String getName(String name) {
		
		return name;
		
	}
	
	public String getType(String type) {
		
		return type;
		
	}
	
}

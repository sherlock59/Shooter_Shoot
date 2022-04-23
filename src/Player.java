public class Player { //testing
	private String name;
	private int number;
	private int fouls;
	
	private int attempt_1shots;
	private int attempt_2shots;
	private int attempt_3shots;
	
	private int made_1shots;
	private int made_2shots;
	private int made_3shots;

	public Player() {
		this.name = null;
		this.number = 0;
		this.fouls = 0;
		this.attempt_1shots = 0;
		this.attempt_2shots = 0;
		this.attempt_3shots = 0;
		this.made_1shots = 0;
		this.made_2shots = 0;
		this.made_3shots = 0;
	}
	
	public Player(String name, int number) {
		this();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFouls() {
		return fouls;
	}

	public void foul() {
		fouls++;
	}

	public int getAttempt_1shots() {
		return attempt_1shots;
	}

	public int getAttempt_2shots() {
		return attempt_2shots;
	}

	public int getAttempt_3shots() {
		return attempt_3shots;
	}

	public int getMade_1shots() {
		return made_1shots;
	}

	public int getMade_2shots() {
		return made_2shots;
	}

	public int getMade_3shots() {
		return made_3shots;
	}
	
	public void shot

	
	

}

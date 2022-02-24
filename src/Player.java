public class Player { //testing
	private String name;
	private int attempts; 
	private int madeAttempts;
	private int num1shots;
	private int num2shots;
	private int num3shots;
	private int fouls;
	
	public Player(String name, int attempts, int madeAttempts, int num1shots, int num2shots, int num3shots, int fouls) {
		super();
		this.name = null;
		this.attempts = 0;
		this.madeAttempts = 0;
		this.num1shots = 0;
		this.num2shots = 0;
		this.num3shots = 0;
		this.fouls = 0;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public int getMadeAttempts() {
		return madeAttempts;
	}

	public void setMadeAttempts(int madeAttempts) {
		this.madeAttempts = madeAttempts;
	}

	public int getNum1shots() {
		return num1shots;
	}

	public void setNum1shots(int num1shots) {
		this.num1shots = num1shots;
	}

	public int getNum2shots() {
		return num2shots;
	}

	public void setNum2shots(int num2shots) {
		this.num2shots = num2shots;
	}

	public int getNum3shots() {
		return num3shots;
	}

	public void setNum3shots(int num3shots) {
		this.num3shots = num3shots;
	}

	public int getFouls() {
		return fouls;
	}

	public void setFouls(int fouls) {
		this.fouls = fouls;
	}


	
	

}

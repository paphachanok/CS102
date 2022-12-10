class Factory {
	private double iron;
	private double copper;
	private double silver;
	private double gold;
	private int circuitBoard;

	public Factory (double iron, double copper, double silver, double gold) {
		this.iron = iron;
		this.copper = copper;
		this.silver = silver;
		this.gold = gold;
	}
  	public void setCopper(double copper) {
        this.copper = copper;
    }
    public void setSilver(double silver) {
        this.silver = silver;
    }
    public void setGold(double gold) {
        this.gold = gold;
    }

	public double getIron() {
		return iron;
	}
	public double getCopper() {
		return copper;
	}
	public double getSilver() {
		return silver;
	}
	public double getGold() {
		return gold;
	}
	public int getCircuitBoard() {
		return circuitBoard;
	}

	public void buildCircuitBoard(int cir) {
		circuitBoard += cir;
		copper -= 0.000005d * cir;
		silver -= (0.000002d * cir);
		gold -= 0.00000001d * cir;
	}
}

public class p131_oop_factory {
	public static void main(String[] args) {
        Factory fac1 = new Factory(67,9,10,1);
        System.out.println(fac1.getIron());
        System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());

        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
        fac1.buildCircuitBoard(500000);
        fac1.buildCircuitBoard(850000);
        System.out.println(fac1.getIron());
      	System.out.println(fac1.getCopper());
        System.out.println(fac1.getSilver());
        System.out.println(fac1.getGold());
        System.out.println(fac1.getCircuitBoard());
    }
}

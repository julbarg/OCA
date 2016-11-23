package chapter4;

public class MouseConstructorChaining {
	private int numTeeth;
	private int numWhiskers;
	private int weight;
	
	private final int volumen;
	private final String name = "The Mouse House";
	
	public MouseConstructorChaining(int weight) {
		this(weight, 16);
	}
	
	public MouseConstructorChaining (int weight, int numTeeth) {
		this(weight, numTeeth, 6);
	}
	
	public MouseConstructorChaining(int weight, int numTeeth, int numWhiskers){
		this.weight = weight;
		this.numTeeth = numTeeth;
		
		volumen = 54 * 41;
	}
	
	@Override
	public String toString() {
		return weight + " " + numTeeth + " " + numWhiskers;
	}
	
	public static void main(String[] args) {
		MouseConstructorChaining m = new MouseConstructorChaining(5);
		System.out.println(m);
	}
	

}

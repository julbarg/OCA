package chapter4;

public class OrderInitializationFather {
	
	{
		System.out.println("Bloque de Codigo Father");
	}
	
	static {
		System.out.println("Bloque Static 1 Father");
	}
	
	static {
		System.out.println("Bloque Static 2 Father");
	}
	
	public OrderInitializationFather() {
		System.out.println("Constructor Father");
	}

}

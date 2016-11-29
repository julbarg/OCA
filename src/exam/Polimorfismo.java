package exam;

public class Polimorfismo {
	public static void main(String[] args) {
		
		/*
		 * Padre padre = new Hijo();
		 * Tipo de objecto = Referencia;
		 * Izquierda (Padre): Define las variables a usar
		 * Derecha (Hijo): Define los metodos a usar
		 */
		Padre padre = new Padre();
		Hijo hijo = new Hijo();
		
		System.out.println(padre.variable);
		padre.getName();
		System.out.println();
		
		System.out.println(hijo.variable);
		hijo.getName();
		System.out.println();
		
		Padre padreHijo = new Hijo();
		System.out.println(padreHijo.variable);
		padreHijo.getName();
		System.out.println();
		
		Hijo hijoPadre = (Hijo) padreHijo;
		System.out.println(hijoPadre.variable);
		hijoPadre.getName();
		
		/*
		Padre padreOwn = new Padre();
		Hijo hijoOwn = new Hijo();
		hijoOwn = (Hijo) padreOwn;*/
		
		Reptile reptile = new Lizard();
		reptile.layEggs();
		reptile.getSomething();
		
		Reptile reptile2 = new Reptile();
		reptile2.layEggs();
		reptile2.getSomething();
		
		Lizard lizard = new Lizard();
		lizard.getSomething();
	}
}

class Padre {
	public String variable = "Variable Padre";
	public void getName() {
		System.out.println("Metodo Padre: "+variable);
	}
}

class Hijo extends Padre {
	public String variable = "Variable Hijo";
	public String variableDos = "Otra";
	public void getName() {
		System.out.println("Metodo Hijo: "+variable);
	}
}

class Reptile {
	public void layEggs() {
		System.out.println("Reptile laying eggs");
	}
	
	public static void getSomething() {
		System.out.println("Reptile");
	}
}

class Lizard extends Reptile {
	public void layEggs() {
		System.out.println("Lizard laying eggs");
	}
	
	public static void getSomething() {
		System.out.println("Lizard");
	}
}
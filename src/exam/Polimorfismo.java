
package exam;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.ListIterator;

public class Polimorfismo {
	
	final static int case10 = 50;
	{
		int o = 85;
	}
	public static void main(String[] args) {
		
		Interviewer2 interviewer = new Manager2();
		Interviewer2.bookRoom(null);
		interviewer.getY();
		
		
		int i = 0564;
		int i2 = 0x1234;
		int i3 = 0b01;
		int h = 0x12____0;
		
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
		
		String[] j = new String[20];
		StringBuffer buffer = new StringBuffer("012345");
		buffer.replace(0, 1, "HERE");
		System.out.println(buffer);
		ArrayList<String> listArray = new ArrayList<>();
		ListIterator<String> iterator = listArray.listIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		ArrayList<Integer> listInt = new ArrayList<>();
		listInt.add(0);
		listInt.add(1);
		listInt.add(2);
		
		ArrayList<Integer> listInt2 = new ArrayList<>();
		listInt2.add(3);
		listInt2.add(4);
		listInt2.add(5);
		
		listInt.addAll(listInt2);
		for(Integer l: listInt){
			System.out.println(l);
		}
		
		System.out.println();
		
		listInt2.set(0, 99);
		listInt2.set(1, 98);
		listInt2.set(2, 97);
		
		for(Integer l: listInt){
			System.out.println(l);
		}
		
		System.out.println();
		
		for(Integer l: listInt2){
			System.out.println(l);
		}
		
		Equals e1 = new Equals();
		Equals e2 = new Equals();
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e2));
		System.out.println("12345".charAt(1));
		"".indexOf("");
		Period period = Period.ofDays(90);
		char c = 'a';
		int gqq = c;
		System.out.println(gqq);
		int[] ai = new int[30];
		char[] k = {'1'};
		StringBuffer y = new StringBuffer();
		ArrayList<String> qa = new ArrayList<>(89);
		String st = new String("1");
		qa.add(st);
		System.out.println(qa.contains(new String("1")));
		System.out.println(qa);
		
		ArrayList<StringBuffer> listS = new ArrayList<>();
		StringBuffer s1 = new StringBuffer("J");
		listS.add(s1);
		System.out.println(listS.contains(new StringBuffer("J")));
		System.out.println(listS.contains("J"));
		System.out.println(listS.contains(s1));
		
		boolean t = false;
		if(t = true){
			System.out.println(true);
		}
		
		int count = 0;
		for(i=0; i<10; i++){
			count++;
		}
		
		System.out.println();
		System.out.println(count);
		
		count = 0;
		for(i=0; i<10; ++i, System.out.println("terminal")){
			count++;
			System.out.println("inside for");
		}
		
		System.out.println();
		System.out.println(count);

		System.out.println();
		
		int num2 = 10+10;
		switch (num2) {
		default:
			System.out.println("default");

		case 50:
			for(String rrr : listArray){
				
			}
			break;
		}
	}
}



class Equals {
	public boolean equals(Equals obj) {
		return true;
	}
	
	@Override
	public boolean equals(Object obj) {
		return false;
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
		
		if(5>8){
			System.out.println();
		}
		{
			int y = 0;
		}
		
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

interface Interviewer2 {
	static void bookRoom(LocalDate date){
		System.out.println();
	}
	
	void getY();
}

class Manager2 implements Interviewer2{

	@Override
	public void getY() {
		// TODO Auto-generated method stub
		
	}
	
}
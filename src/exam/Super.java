package exam;

public class Super {
	public static void main(String[] args) {
		ProgrammerOne p = new ProgrammerOne(null);
		p.setNames();
		p.printNames();
		System.out.println();
		p.printsss();
		
	}
}

class EmployeeOne {
	String name;
	String address;
	
	public void print(){
		System.out.println("EmployeeOne");
	}
	
	public EmployeeOne(String name) {
		this.name = name;
	}
}

class ProgrammerOne extends EmployeeOne {
	public ProgrammerOne(String name) {
		super(name);
	}

	String name;
	
	public void print(){
		System.out.println("ProgrammerOne");
	}
	
	void setNames() {
		this.name = "Programmer";
		super.name = "Employee";
	}
	
	void printNames() {
		System.out.println(super.name);
		System.out.println(this.name);
		System.out.println(this.address);
	}
	
	void printsss() {
		super.print();
		this.print();
	}
}

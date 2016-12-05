package exam;

public class Poymorphism {
	public static void main(String[] args) {
		EmployeeP emp1 = new ProgrammerP();
		EmployeeP emp2 = new ManagerP();
		emp1.reachOffice();
		emp2.reachOffice();
		emp1.startProjectWork();
		emp2.startProjectWork();
		
		System.out.println();
		System.out.println(emp1.name);
		System.out.println(emp2.name);
		System.out.println(emp1.code);
		System.out.println();
		System.out.println("PolymorphisWithInterfaces");
		
		MobileAppExpert expert1 = new ProgrammerP2();
		MobileAppExpert expert2 = new ManagerP2();
		expert1.deliverMobileApp();
		System.out.println();
		expert2.deliverMobileApp();
	}

}

abstract class EmployeeP {
	
	String name = "EmployeeP";
	static String code = "009";
	
	public void reachOffice() {
		System.out.println("reacehd office - Gurgaon, India");
	}
	public abstract void startProjectWork();
}

class ProgrammerP extends EmployeeP {
	
	String name = "ProgrammerP";
	
	public void startProjectWork() {
		defineClasses();
		unitTestCode();
		System.out.println(name);
	}
	
	private void defineClasses() {
		System.out.println("define classes");
	}
	
	private void unitTestCode() {
		System.out.println("unit test code");
	}
}

class ManagerP extends EmployeeP {
	
	String name = "Manager";
	
	public void startProjectWork() {
		meetingWithCustomer();
		defineProjectSchedule();
		assigRespToTeam();
		System.out.println(name);
	}
	
	private void meetingWithCustomer() {
		System.out.println("meet Customer");
	}
	
	private void defineProjectSchedule() {
		System.out.println("Project Schedule");
	}
	
	private void assigRespToTeam() {
		System.out.println("team work starts");
	}
}


interface MobileAppExpert {
	void deliverMobileApp();
}

class EmployeeP2 {
	
}

class ProgrammerP2 extends EmployeeP2 implements MobileAppExpert {
	public void deliverMobileApp() {
		System.out.println("testing complete on real device");
	}
}

class ManagerP2 extends EmployeeP2 implements MobileAppExpert {
	public void deliverMobileApp() {
		System.out.println("QA complete");
		System.out.println("code delivered with relase notes");
	}
}
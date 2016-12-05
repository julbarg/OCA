package exam;

public class ReferenceVariableObjectTypes {
	public static void main(String[] args) {
		/*
		 * HRExceutive - Class
		 */
		HRExceutive hr = new HRExceutive();
		hr.specialization = new String[] {"Staffing"};
		System.out.println(hr.specialization[0]);
		hr.name = "Pavni Gupta";
		System.out.println(hr.name);
		hr.conductInterviewer();
		
		/*
		 * Employee - SuperClass
		 */
		Employee emp = new HRExceutive();
		// emp.specialization = new String[] {"Staffing"}; //DOES NOT COMPILE
		// System.out.println(emp.specialization[0]); // DOES NOT COMPILE
		emp.name = "Pavni Gupta";
		System.out.println(emp.name);
		// emp.conductInterviewer(); // DOES NOT COMPILE
		
		/*
		 * Interviewer - Interface
		 */
		Interviewer interviewer = new HRExceutive();
		// interviewer.specialization = new String[] {"Staffing"}; //DOES NOT COMPILE
		// System.out.println(emp.specialization[0]); // DOES NOT COMPILE
		// interviewer.name = "Pavni Gupta"; // DOES NOT COMPILE
		interviewer.conductInterviewer();
		
	}

}

class Employee{
	String name;
	String address;
	String phoneNumber;
	float experience;
}

interface Interviewer {
	void conductInterviewer();
}

class HRExceutive extends Employee implements Interviewer {

	String[] specialization;
	
	@Override
	public void conductInterviewer() {
		System.out.println("HRExecutive - conducting interview");
	}
	
}

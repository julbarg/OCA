package exam;

public class Casting {
	public static void main(String[] args) {
		Interviewerr interviewer = new HRExecutiveee();
		// interviewer.specialization = new String[] {"Staffing"}; // DOES NOT COMPILE
		((HRExecutiveee)interviewer).specialization = new String[] {"Staffing"};
		System.out.println(((HRExecutiveee)interviewer).specialization[0]);
		
		Interviewerr[] interviewers = new Interviewerr[2];
		interviewers[0] = new Manager();
		interviewers[1] = new HRExecutiveee();
		for(Interviewerr interviewerr : interviewers){
			if(interviewerr instanceof Manager){
				int teaemSize = ((Manager)interviewerr).teamSize;
				if(teaemSize>10) {
					interviewerr.conductInterview();
				} else {
					System.out.println("Mgr can't interview with the team size less than 10");
				}
			} else if(interviewerr instanceof HRExecutiveee) {
				((HRExecutiveee) interviewerr).specialization = new String[] {"Interviewe"};
				interviewerr.conductInterview();
			}
		}
	}

}

class Employeee {}

interface Interviewerr {
	void conductInterview();
}

class HRExecutiveee extends Employeee implements Interviewerr {
	String[] specialization;
	public void conductInterview() {
		System.out.println("HRExceutive - conducting interview");
	}
}

class Manager implements Interviewerr {
	int teamSize;
	public void conductInterview() {
		System.out.println("Manager - conductiong interview");
	}
}

// A class to represent Stanford lawyers.
// Stanford Lawyer is a Lawyer is an Employee
public class StanfordLawyer extends Lawyer {
  public double getSalary() {
    return super.getSalary() * 1.2;
  }
  
  public int getVacationDays() {
    return super.getVacationDays() + 3;
  }

  public String getVacationForm() {
    String stanfordForm = super.getVacationForm()
                        + super.getVacationForm()
                        + super.getVacationForm()
                        + super.getVacationForm();
    return stanfordForm;
  }
}


// A class to represent lawyers.
public class Lawyer extends Employee {
	// overrides getVacationDays from Employee class
	public int getVacationDays() {
    return super.getVacationDays() + 5;
	}

	// overrides getVacationDays from Employee class
	public String getVacationForm() {
		 return lawyerVacationForm;
	}

	// this is the Lawyer's added behavior
	public String sue() {
		return "I'll see you in court!";
	}

	// these are so that test cases can change the Lawyer values
	// and make sure that subclasses also change
	private static String lawyerVacationForm = "pink";

	public static final void setLawyerVacationForm(String form) {
		lawyerVacationForm = form;
	}
}


// A class to represent employees in general.
public class Employee {
	public int getHours() {
		return baseHours; // 40 hours/week
	}

	public double getSalary() {
		return baseSalary; // $40,000.00
	}

	public int getVacationDays() {
		return baseVacationDays; // 10 days
	}

	public String getVacationForm() {
		return baseVacationForm; // yellow
	}
  
	// These are so that test cases can change the base values
	// and make sure that subclasses also change their values.
	// (Your code that you submit is NOT supposed to directly use, call,
	// or modify the values below!  They are here only to help our site
	// successfully test your code.  Please ignore them.)

	private static int baseHours = 40;
	private static double baseSalary = 40000.0;
	private static int baseVacationDays = 10;
	private static String baseVacationForm = "yellow";

	public static final void setBaseHours(int hours) {
		baseHours = hours;
	}
	public static final void setBaseSalary(double salary) {
		baseSalary = salary;
	}
	public static final void setBaseVacationDays(int days) {
		baseVacationDays = days;
	}
	public static final void setBaseVacationForm(String form) {
		baseVacationForm = form;
	}
}

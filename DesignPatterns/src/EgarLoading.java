
public class EgarLoading {

	public static void main(String[] args) {
	
		Employee e1=Employee.employeeInstance;
		Employee e2=Employee.employeeInstance;
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}

class Employee{
	
	static Employee employeeInstance=null;
	
	private int empId;
	private String empName;
	
	private Employee() {

	}
	
	static {
		employeeInstance=new Employee();
	}
	
	
	
	
}

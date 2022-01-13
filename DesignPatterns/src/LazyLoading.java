
public class LazyLoading {
	public static void main(String[] args) {
		Emp e1=Emp.getEmpInstance();
		Emp e2=Emp.getEmpInstance();
		
		
		System.out.println(e1+":"+e2);
		
		synchronized (args) {
			System.out.println("sdd");
		} 	
		
		
	}
}

class Emp {
	static Emp empInstance = null;

	private int empId;

	private Emp() {

	}

	public static Emp getEmpInstance() {
		if (empInstance == null) {
			empInstance = new Emp();
		}

		return empInstance;
	}

}

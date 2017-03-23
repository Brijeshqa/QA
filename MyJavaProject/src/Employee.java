
public class Employee {
	String name="n";
	int id;
	public Employee(String n,int i){
	name=n;
	id=i;
	}
	//public Employee(int i){
	//	id=i;
	//}
	public void employee_name(){
		System.out.println("Employee name is" + " " + name);
	}
	public void employee_id(){
		System.out.println("Employee id is" + " " + id);
	}
	public static void main(String args[]){
		Employee E1 = new Employee("Rahul",3435);
		//Employee E2 = new Employee(3435);
		E1.employee_name();
		E1.employee_id();
		
		
	}

}

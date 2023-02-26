package InheritanceDemo;

import InheritanceDemo.Employee1.Manager;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Manager manager1= new Manager(126534l,"peter","Chennai,India",234578l,65000);
		
		double total_Sal;
		total_Sal=manager1.CalculateSalary();
		
		System.out.println("Name of the employee:"+manager1.employeeName+" of Id"+ manager1.employeeId+
"from"+manager1.employeeAddress+"with"+manager1.employeePhone+" gets a salary of"+manager1.basicSalary);
		System.out.println("His total salary after allowance and hra is:" +total_Sal);
	}

}

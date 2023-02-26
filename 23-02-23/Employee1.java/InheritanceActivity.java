package InheritanceDemo;





public class Employee1 {
	
	 //creating instance variable of class Employee1
	 String employeeName,employeeAddress;
	 long employeeId,employeePhone;
	 double basicSalary,specialAllowance,Hra;
	 //constructor for employee

Employee1(long Id, String Name, String Address, long PhoneNum){
			
			this.employeeId=Id;
		    this.employeeName=Name;
		    this.employeeAddress=Address;
		    this.employeePhone=PhoneNum;
		    
}
public long getId() {
	return employeeId;
}
public String getName() {
	return employeeName;
}
public String getAddress() {
	return employeeAddress;
}
public long getPhoneNum() {
	return employeePhone;
}
	
Employee1(){
		 specialAllowance=250.80;
		 Hra=1000.50;
	 }
public double getAllowance() {
	return specialAllowance;
}
	
public double getHra() {
	return Hra;
}
	


 

//Salary calculation method
 public  double CalculateSalary() {
	 double salary;
	 salary=(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
	 return salary;
 }
 
 class Manager extends Employee1{
	 Manager(long Id, String Name, String Address, long PhoneNum,double Salary){
		 super(Id,Name,Address,PhoneNum);
		this.basicSalary=Salary;
		
 
}
	 public double getSalary() {
			return basicSalary;
		}
 }
	
  class Trainee extends Employee1{
		Trainee(long Id, String Name, String Address, long PhoneNum,double Salary){
			 
			 
			super(Id,Name,Address,PhoneNum);
			this.basicSalary=Salary;
			
	 
		}	
		public double getSalary() {
			return basicSalary;
		}
			
	
		}

	}
	


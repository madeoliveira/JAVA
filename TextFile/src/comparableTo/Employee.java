package comparableTo;

public class Employee implements Comparable<Employee>  {
		
	private String name;
	private Double ssalary;
	public Employee(String name, Double ssalary) {
		this.name = name;
		this.ssalary = ssalary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSsalary() {
		return ssalary;
	}
	public void setSsalary(Double ssalary) {
		this.ssalary = ssalary;
	}
	@Override
	public int compareTo(Employee other) {
		// TODO Auto-generated method stub
		return name.compareTo(other.getName());
	}
	
	//Compar salty
	
	//public int compareTo(Employee other) {
	//	return salary.compareTo(other.getsalary());
	//}
	
}

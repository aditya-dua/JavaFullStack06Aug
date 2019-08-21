package collection;

public class Employee implements Comparable<Employee>{

	String empName;
	int id;
	String phone;
	
	public Employee(String empName, int id, String phone) {
		super();
		this.empName = empName;
		this.id = id;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", id=" + id + ", phone="
				+ phone + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		/*if(this.id>o.id) return 1;
		else if (this.id==o.id) return 0;
		else return -1;*/
		
		return this.empName.compareToIgnoreCase(o.empName);
			
	}
	
	
	
}

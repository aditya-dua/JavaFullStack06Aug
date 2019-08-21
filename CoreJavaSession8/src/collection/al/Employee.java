package collection.al;

public class Employee {
	
	String name;
	String phone;
	
	int id;
	int sal;
	
	public Employee(String name, String phone, int id, int sal) {
		super();
		this.name = name;
		this.phone = phone;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", id=" + id
				+ ", sal=" + sal + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
	/*@Override/
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee e = (Employee) obj;
		if (e.name.equalsIgnoreCase(this.name)) return true;
		else return false;
	}*/
	
	
	

}

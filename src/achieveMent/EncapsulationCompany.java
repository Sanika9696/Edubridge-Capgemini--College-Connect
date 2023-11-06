package achieveMent;

class Employee {
	private int empId; //data hiding
	public void setEmpId(int eid)
	{
		empId=eid; //modified data
	}
	public int getEmpId() {
		return empId;
	}
}
class EncapsulationCompany{
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmpId(200);
		System.out.println(e.getEmpId());	
}
}


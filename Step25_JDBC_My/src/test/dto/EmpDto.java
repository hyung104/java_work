package test.dto;

public class EmpDto {
	private int empno;
	private String ename;
	private double sal;
	private String dname;
	private String hiredate;
	
	public EmpDto() {}

	public EmpDto(int empno, String ename, double sal, String dname, String hiredate) {
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.dname = dname;
		this.hiredate = hiredate;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	
}

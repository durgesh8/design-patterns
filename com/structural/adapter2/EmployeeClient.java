package com.structural.adapter2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList(){
		List<Employee> employees=new ArrayList<Employee>();
		Employee employeeFromDB=new EmployeeDB("1", "Durgesh", "Singh", "dk@gmail.com");
		employees.add(employeeFromDB);
		EmployeeLdap employeeFromLdap=new EmployeeLdap("2", "Ashu", "Singh", "as@gmail.com");
		Employee empfromLdap= new EmployeeAdapterLdap(employeeFromLdap);
		employees.add(empfromLdap);
		return employees;
	}
}

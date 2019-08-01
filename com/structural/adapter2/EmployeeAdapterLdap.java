package com.structural.adapter2;

public class EmployeeAdapterLdap implements Employee{
	
	private EmployeeLdap instance;
	public EmployeeAdapterLdap(EmployeeLdap ldap) {
		this.instance=ldap;
	}

	@Override
	public String getId() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return instance.getSurname();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

}

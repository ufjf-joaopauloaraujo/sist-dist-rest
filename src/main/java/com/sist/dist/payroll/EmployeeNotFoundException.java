package com.sist.dist.payroll;

class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -3529515196332098932L;

	EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}

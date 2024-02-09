package com.sripathi.EmployeeServiceModule;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

		@Id
		@Column(name="employeeID")
		private int employeeID;
		
		@Column(name="firstName")
		private String firstName;
		
		@Column(name="lastName")
		private String lastName;
		
		@Column(name="address")
		private String address;
		
		@Column(name="contactNo")
		private long  contactNo;
		
		@Column(name="emailId")
		private String emailId;
		
		@Column(name="role")
		private String role;
		
		@Column(name="salaryPerMonth")
		private float salaryPerMonth;

		public int getEmployeeID() {
			return employeeID;
		}

		public void setEmployeeID(int employeeID) {
			this.employeeID = employeeID;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public long getContactNo() {
			return contactNo;
		}

		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public float getSalaryPerMonth() {
			return salaryPerMonth;
		}

		public void setSalaryPerMonth(float salaryPerMonth) {
			this.salaryPerMonth = salaryPerMonth;
		}

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(int employeeID, String firstName, String lastName, String address, long contactNo, String emailId,String role, float salaryPerMonth) {
			super();
			this.employeeID = employeeID;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.contactNo = contactNo;
			this.emailId = emailId;
			this.role = role;
			this.salaryPerMonth = salaryPerMonth;
		}

		@Override
		public String toString() {
			return "Employer [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName+ ", address=" + address + ", contactNo=" + contactNo + ", emailId=" + emailId + ", role=" + role+ ", salaryPerMonth=" + salaryPerMonth + "]";
		}

}

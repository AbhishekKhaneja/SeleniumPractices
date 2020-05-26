package com.abhishek.client;

import com.abhishek.bean.Employee;
import com.abhishek.util.JasonUtil;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee empobj = new Employee();
		empobj.setEmpno(101);
		empobj.setName("Abhishek");
		empobj.setSalary(100000);
		 
		String Jasondata =JasonUtil.ConvertjavaobjtoJason(empobj);
		System.out.println(Jasondata);
		
		Employee emp1=JasonUtil.ConvertJasontoJavaObject(Jasondata, Employee.class);
		System.out.println(emp1.getName() +" "+ emp1.getSalary()+" " + emp1.getEmpno());
		
	}

}

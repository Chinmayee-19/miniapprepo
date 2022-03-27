package com.examples.business.data;

import java.util.Comparator;

public class EmailCompareDesc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getEmail().compareTo(o1.getEmail());
	}

}

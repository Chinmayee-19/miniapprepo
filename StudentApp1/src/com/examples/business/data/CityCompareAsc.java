package com.examples.business.data;

import java.util.Comparator;

public class CityCompareAsc implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getCity().compareTo(o2.getCity());
	}

}

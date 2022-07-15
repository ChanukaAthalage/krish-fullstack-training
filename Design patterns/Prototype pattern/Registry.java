package com.prototype;

import java.lang.reflect.Member;
import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<MemberType, Members> members = new HashMap<>();

	public Registry() {
		
		initialize();
		
	}
	
    public Members getMembers(MemberType memberType) {
    	Members mem = null;
    	try {
			mem = (Members) members.get(memberType).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return mem;
    }

	private void initialize() {
		
		Teacher teacher = new Teacher();
		teacher.setName("Chaminda");
		teacher.setAge(35);
		teacher.setSubject("Maths");
	
		Student student = new Student();
		student.setName("Dasun");
		student.setAge(18);
		student.setSeniority("Prefect");
		
		members.put(MemberType.TEACHER,teacher);
		members.put(MemberType.STUDENT, student);
	}

	
	
	

}

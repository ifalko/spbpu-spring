package ru.spbstu.sc.persistence.dao;

import java.util.List;

import ru.spbstu.sc.model.Student;

public interface StudentDao {

	Student getStudentById(int id);
	
	List<Student> getStudentsWithNames();
	
	// TODO:
	//int createStudent(Student student);
	
	// TODO: create Specialty object and table in DB and implement:
	//List<Student> getStudentsBySpecialityId(int specialityID);
	
	// TODO:
	//List<Student> getStudentsByStartYear(short year);
	
	// TODO: 
	//List<Student> getStudentsByGraduationYear(short year);
	
}

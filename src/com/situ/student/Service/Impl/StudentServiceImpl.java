package com.situ.student.Service.Impl;

import java.util.List;


import com.situ.student.Dao.IStudentDao;
import com.situ.student.Dao.Impl.StudentDaoMysqlImpl;
import com.situ.student.Entity.Student;
import com.situ.student.Exception.NameRepeatException;
import com.situ.student.Service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	//后期这一块是spring帮我们处理
	private IStudentDao studentDao = new StudentDaoMysqlImpl();

	@Override
	public List<Student> findAll() {
		return studentDao.findAll();
	}

	@Override
	public Student findById(int id) {
		return studentDao.findByID(id);
	}
	@Override
	public List<Student> findByName(String name) {
		return studentDao.findByName(name);
	}

	@Override
	public List<Student> findByAge(int begin, int end) {
		return studentDao.findByAge(begin,end);
	}

	@Override
	public List<Student> findByGender(String gender) {
		return studentDao.findByGender(gender);
	}
	
	@Override
	public List<Student> findByBirthday(String beginTime, String endTime) {
		return studentDao.findByBirthday(beginTime, endTime);
	}
	
	@Override
	public boolean add(Student student) throws NameRepeatException {
		if (studentDao.checkStudent(student)) {
			throw new NameRepeatException("");
		} else {
			return studentDao.add(student);
		}
	}

	@Override
	public boolean delete(int id) {
		return studentDao.delete(id);
	}

	@Override
	public boolean update(Student student) {
		return studentDao.update(student);
	}

}

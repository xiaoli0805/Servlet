package com.situ.student.Test;

import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.situ.student.Dao.IStudentDao;
import com.situ.student.Dao.Impl.StudentDaoMysqlImpl;
import com.situ.student.Entity.Student;
import com.situ.student.Exception.NameRepeatException;

public class StudentDaoMysqlImplTest {
	
	//@Test
	public void testFindAll() {
		IStudentDao studentDao = new StudentDaoMysqlImpl();
		List<Student> list = studentDao.findAll();
		if (list != null) {
			for (Student student : list) {
				System.out.println(student);
			}
		}
	}
	
	//@Test
	public void testFindById() {
		IStudentDao studentDao = new StudentDaoMysqlImpl();
		Student student = studentDao.findByID(5);
		if (student != null) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testAdd() throws NameRepeatException {
		Date date = new Date();
		Student student = new Student("李煜", 36, "男",date);
		IStudentDao studentDao = new StudentDaoMysqlImpl();
		boolean result = studentDao.add(student);
		if (result) {
			System.out.println("添加成功");
		} else {
			System.out.println("添加失败");
		}
	}
	
	//@Test
	public void testDelete() {
		IStudentDao studentDao = new StudentDaoMysqlImpl();
		boolean result = studentDao.delete(7);
		if (result) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
	}
	
	//@Test
	public void testUpdate() {
		Student student = new Student(8, "李土伟", 17, "男");
		IStudentDao studentDao = new StudentDaoMysqlImpl();
		boolean result = studentDao.update(student);
		if (result) {
			System.out.println("更新成功");
		} else {
			System.out.println("更新失败");
		}
	}
	
	//@Test
	public void testFindByName() {
		IStudentDao studentDao = new StudentDaoMysqlImpl();
		List<Student> list = studentDao.findByName("赵");
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	//@Test
	public void testFindByAge() {
		IStudentDao studentDao = new StudentDaoMysqlImpl();
		List<Student> list = studentDao.findByAge(20, 30);
		for (Student student : list) {
			System.out.println(student);
		}
	}
	
	//@Test
	public void testFindByGender() {
		IStudentDao studentDao = new StudentDaoMysqlImpl();
		List<Student> list = studentDao.findByGender("女");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}

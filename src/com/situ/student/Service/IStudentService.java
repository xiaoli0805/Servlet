package com.situ.student.Service;

import java.util.List;

import com.situ.student.Entity.Student;
import com.situ.student.Exception.NameRepeatException;

public interface IStudentService {
	
	/**
	 * 查询所有的学生信息
	 * @return  返回学生信息集合
	 */
	public abstract  List<Student> findAll();
	
	/**
	 * a根据指定的id查询学生信息
	 * @param id
	 * @return 返回学生信息
	 */
	public abstract Student findById(int id);
	/**
	 * 
	 * @param name
	 * @return
	 */
	public abstract List<Student> findByName(String name);
	/**
	 * 
	 * @param begin
	 * @param end
	 * @return
	 */
	public abstract List<Student> findByAge(int begin, int end);
	/**
	 * 
	 * @param gender
	 * @return
	 */
	public abstract List<Student> findByGender(String gender);
	/**
	 * 根据出生日期查询学生信息
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @return 返回学生信息
	 */
	public abstract List<Student> findByBirthday(String beginTime,String endTime);
	
	/**
	 * 根据指定的id水删除学生信息
	 * @param id
	 * @return true：删除成功  false：删除失败
	 */
	public abstract boolean delete(int id);
	
	/**
	 * 修改学生
	 * @param student
	 * @return true：修改成功  false：修改失败
	 */
	public abstract boolean update(Student student);

	/**
	 * 添加学生信息
	 * @param student
	 * @return true：添加成功  false：添加失败
	 * @throws  
	 */
	public abstract boolean add(Student student) throws NameRepeatException;

	
	
}

package com.situ.student.Dao;

import java.util.List;

import com.situ.student.Entity.Student;

public interface IStudentDao {
	/**
	 * 查询所有学生信息
	 * @return 返回所有学生信息的集合
	 */
	public abstract List<Student> findAll();
	
	/**
	 * 根据指定的ID查询学生信息
	 * @param id
	 * @return 返回学生信息
	 */
	public abstract Student findByID(int id);
	/**
	 * 根据姓名查询学生信息
	 * @param name 
	 * @return 返回学生信息
	 */
	public abstract List<Student> findByName(String name);
	/**
	 * 根据出生日期查询学生信息
	 * @param beginTime 开始时间
	 * @param endTime 结束时间
	 * @return 返回学生信息
	 */
	public abstract List<Student> findByBirthday(String beginTime,String endTime);
	/**
	 * 根据年龄段查找学生
	 * @param begin 开始年龄
	 * @param end 结束年龄
	 * @return 返回学生信息集合
	 */
	public abstract List<Student> findByAge(int begin, int end);
	/**
	 * 根据性别查询学生信息
	 * @param gender
	 * @return 返回学生信息
	 */
	public abstract List<Student> findByGender(String gender);
	/**
	 * 添加学生信息
	 * @param student
	 * @return true:添加成功  false：添加失败
	 */
	public abstract boolean add(Student student);
	/**
	 * 删除学生
	 * @param id
	 * @return true：删除成功  false：删除失败
	 */
	public abstract boolean delete(int id);
	/**
	 * 修改学生信息
	 * @param student
	 * @return true：修改成功  false：修改失败
	 */
	public abstract boolean update(Student student);
	/**
	 * 查看指定的学生姓名存不存在
	 * @param student
	 * @return true：学生姓名存在 false：学生姓名不存在
	 */
	public abstract boolean checkStudent(Student student);
	
	
}

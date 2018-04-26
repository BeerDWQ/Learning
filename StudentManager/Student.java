package cn.hl.studentmanager;
/*
 * JavaBean 三大要素
 * 1.私有的成员变量
 * 2.无参构造函数
 * 3.公共的访问接口
 */
public class Student {
	private int stuNo;
	private String stuName;
	private char gender;
	private int age;
	private int grade;
	public Student() {}
	public Student(int stuNo, String stuName, char gender, int age, int grade) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.gender = gender;
		this.age = age;
		this.grade = grade;
	}
	public int getStuNo() {
		return stuNo;
	}
	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
}

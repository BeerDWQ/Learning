package cn.hl.studentmanager;
/**
 * 提供学生信息维护的相关方法
 * @version=1.0
 * @author Beer
 */
public class Manager {
	//学号
	private static int no=1;
	Student[] stu;
	//记录数组内最后一个数据的下标
	int index=-1;
	/*
	 * 无参构造函数
	 * 提供默认初始长度
	 */
	public Manager() {
		stu=new Student[30];
	}
	/*
	 * 有参构造函数
	 * 提供自定义长度
	 */
	public Manager(int count) {
		stu=new Student[count];
	}
	/**
	 * 添加学生信息
	 */
	public void add(String stuName,char gender,int age,int grade) {
		//判断数组空间是否已经满了
		if(++index==stu.length)
			throw new IndexOutOfBoundsException("已经达到最大学生数");
		Student	student=new Student(no, stuName, gender,age,grade);
		//添加学生进入数组
		stu[++index]=student;
		no++;
	}
	/*
	 * 删除学生
	 */
	public boolean delete(int no) {
		//调用find方法找到学生
		int idx=find(no);
		//如果未找到返回false
		if(idx==-1)
			return false;
		//判断删除的学生是否在最后一个元素的前面，如果是执行移动操作
		if(idx<index){
			for(int j=idx;j<index;j++) {
				stu[j]=stu[j+1];
			}
		}
		//将最后一个元素恢复成空值，元素个数减一。
		stu[index--]=null;
		return true;
	} 	 
	public boolean edit(int no,String stuName,int age,char gender,int grade) {
		//查找学生在数组中的位置
		int idx=find(no);
		//判断是否存在
		if(idx==-1)
			return false;
		//修改信息
		stu[idx].setAge(age);
		stu[idx].setGender(gender);
		stu[idx].setGrade(grade);
		stu[idx].setStuName(stuName);
		return true;
	}
	/*
	 * 按学号查找学生索引位置
	 * 成功返回下标
	 * 失败返回-1
	 */
	public int find(int no) {
		//遍历数组
		for(int i=0;i<stu.length;i++) {
		//未找到返回-1
			if(stu[i]==null) 
				return -1;
		//找到匹配学号返回数组下标
			if(stu[i].getStuNo()==no)
				return i;
		}
		return -1;
	}
}

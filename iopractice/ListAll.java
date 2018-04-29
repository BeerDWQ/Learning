package cn.hl.iopractice;
/*
 * 利用递归遍历文件夹
 * 文件先输出，文件夹后输出
 */
import java.io.File;

public class ListAll {
	//level代表文件层级，用于输出填充
	public void listAll(File dir,int level) {
		File[] files=dir.listFiles(new Filter());
		level++;
		//输出父文件夹名
		System.out.println(getSpace(level)+"-->"+dir.getName());
		//输出文件名字
		for(int i=0;i<files.length;i++) {
			if(files[i].isFile()) {
				System.out.println(getSpace(level+1)+files[i].getName());
			}
		}
		//通过递归输出目文件夹下的文件名
		for(int i=0;i<files.length;i++) {
			if(files[i].isDirectory()) {
				listAll(files[i],level);
			}
		}
	}
	/*
	 * 文件输出分层
	 * 通过StringBuffer对象填充空格，实现分层
	 */
	private String getSpace(int level) {
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<level;i++) {
			sb.append("  ");
		}
		return sb.toString();
	}
}

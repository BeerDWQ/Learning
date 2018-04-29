package cn.hl.iopractice;
/*
 * 过滤器，过滤掉隐藏文件
 */
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Filter implements FileFilter{
	public boolean accept(File pathname) {
		if(pathname.isHidden()) {
			return false;
		}else {
			return true;
		}
	}

}

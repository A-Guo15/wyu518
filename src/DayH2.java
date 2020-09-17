package day4.work;

import java.io.File;
import java.io.IOException;

public class DayH2 {
	public static void renameFile(String path,String oldname,String newname){
		if(!oldname.equals(newname)){
		File oldfile=new File(path+"/"+oldname);
		File newfile=new File(path+"/"+newname);
		if(newfile.exists())
		System.out.println(newname+"已经存在！");
		else{
		oldfile.renameTo(newfile);
		}
		}
		}
		public static void main(String[] args) throws IOException {
			File myff1 = new File("D:/DayH");
			myff1.mkdirs();//创建文件夹
			File myf1 = new File(myff1,"myfile_cp.txt");
			myf1.createNewFile();//创建文件

			
			String path="D:/DayH";
			String oldName="myfile_cp.txt";
			String newName="myfile_cp2.txt";
			renameFile(path,oldName,newName);//调用重命名方法
			System.out.println("success");
			}
}
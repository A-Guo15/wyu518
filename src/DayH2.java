package day4.work;

import java.io.File;
import java.io.IOException;

public class DayH2 {
	public static void renameFile(String path,String oldname,String newname){
		if(!oldname.equals(newname)){
		File oldfile=new File(path+"/"+oldname);
		File newfile=new File(path+"/"+newname);
		if(newfile.exists())
		System.out.println(newname+"�Ѿ����ڣ�");
		else{
		oldfile.renameTo(newfile);
		}
		}
		}
		public static void main(String[] args) throws IOException {
			File myff1 = new File("D:/DayH");
			myff1.mkdirs();//�����ļ���
			File myf1 = new File(myff1,"myfile_cp.txt");
			myf1.createNewFile();//�����ļ�

			
			String path="D:/DayH";
			String oldName="myfile_cp.txt";
			String newName="myfile_cp2.txt";
			renameFile(path,oldName,newName);//��������������
			System.out.println("success");
			}
}
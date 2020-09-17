package day4.work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day4H1 {
	public static void copyFile(String src,String dest) throws IOException{
		FileInputStream in=new FileInputStream(src);
		File file=new File(dest);
		if(!file.exists())
		file.createNewFile();
		FileOutputStream out=new FileOutputStream(file);
		int c;
		byte buffer[]=new byte[1024];
		while((c=in.read(buffer))!=-1){
		for(int i=0;i<c;i++)
		out.write(buffer[i]);
		}
		in.close();
		out.close();
		}
	public static void main(String[] args) throws IOException {
		File myff1 = new File("D:/DayH");
		myff1.mkdirs();//创建文件夹
		File myf1 = new File(myff1,"myfile_cp.txt");
		myf1.createNewFile();//创建文件
		File myf2 = new File(myff1,"myfile_cp2.txt");
		myf2.createNewFile();//创建文件
		String fileSrc="D:/DayH/myfile_cp.txt";
		String fileDes="D:/DayH/myfile_cp2.txt";
		copyFile(fileSrc,fileDes);//调用文件复制方法
		System.out.println("success");
		}
}

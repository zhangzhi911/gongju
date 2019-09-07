import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 
 */

/**
 * @author zhangzhi
 *2019年9月6日
 *复制文件夹
 */
public class CopyFIleIO {
/*
 * 先做一个拷贝文件的方法	
 */
	public static void main(String[] args) throws Exception {
		System.out.println("请输入原始路径");
		File file1 = new File("E:/aa/面试资料及其简历");
		System.out.println("请输入目标路径");
		File file2 = new File("E:/aa/abvc");
		
		if(file2.exists()) {
			del(file2);
		}else {
			boolean b = file2.mkdir();
			System.out.println("创建"+b);
			copyMain(file1, file2);
		}
		
	}
//	这是拷贝文件的主要方法
	public static void copyMain(File file,File file2) throws Exception {
		File f = new File(file2,file.getName());
		f.mkdir();//创建这个文件夹

		File[] lists = file.listFiles();
		for (File li : lists) {
			if(li.isFile()) {
				cope(f,li);
			}else {
				copyMain(li,f);
			}
		}
	}
	
	
//	这是一个删除的方法
	private static void del(File file2) {
		File[] lists = file2.listFiles();
		for (File li : lists) {
			if(li.isFile()) {
				li.delete();
			}else {
				del(li);
			}
		}
		file2.delete();
	}
	
	//这是个拷贝的方法
	private static void cope(File file,File file2) throws Exception{
		File f = new File(file,file2.getName());
		FileOutputStream os = new FileOutputStream(f);
	

		FileInputStream is = new FileInputStream(file2);
		byte[] b=new byte[1024];
		int len=0;
		while((len=is.read(b))!=-1) {
			os.write(b);
		}
		
	}

	//这是个关闭流的方法
	public static void colseAll(AutoCloseable...auto) throws Exception {
			
		if(auto!=null && auto.length>0) {
			for (AutoCloseable au : auto) {
				au.close();
			}
		}
		
	}
	
}

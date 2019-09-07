import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.output.ByteArrayOutputStream;

/**
 * 
 */

/**
 * @author zhangzhi
 *2019年9月6日
 */
public class IoUtile {
	public static void main(String[] args) throws IOException {
		File f = new File("E:/aa/日2.txt");
		getinput(new FileInputStream(f));
	}
	public static void getinput(InputStream is) throws IOException {
		ByteArrayOutputStream arr = new ByteArrayOutputStream();
		int len=0;
		byte[] b=new byte[1024];
		while((len=is.read(b))!=-1) {
				arr.write(b);
				String str = new String(b,0,b.length);
				System.out.println(str);
				System.out.println(arr.toString("utf-8"));
		}
		close(arr,is);
	}
	
	
	//这是一个关闭流方法
	public static void close(AutoCloseable...auto) {
		if(auto!=null && auto.length>0) {
			for (AutoCloseable a : auto) {
				try {
					a.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					System.out.println("关闭了");
				}
			}
			
		}
		
	}
	
}	

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


/**
 * 
 */

/**
 * @author zhangzhi
 *2019年9月5日
 */
public class DateTest1 {
	
	//返回操作系统用户
	@Test
	public void getuser() {
		String home = System.getProperty("user.home");
		System.out.println(home);
	}
	//返回系统临时目录
	@Test
	public void getFile() {
		String path = System.getProperty("java.io.tmpdir");
		System.out.println(path);
	}
	//返回文件后缀
	@Test
	public  void getjsp() {
		String  name="name.jsp";
		int i = name.lastIndexOf(".");
		name= name.substring(i, name.length());
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		Date date = getEnd(new Date()); 
		SimpleDateFormat sim = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		String str = sim.format(date);
		System.out.println(str);
	}
	
	//给定时间获取月初时分秒
	public static Date getstart(Date date) {
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
	}
	//给定时间获取上月月末时分秒
	public static Date getEnd(Date src) {
		// 用当前系统时间获取日历类
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		c.add(Calendar.MONTH, 1);
		Date date = getstart(c.getTime());
		c.setTime(date);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
}

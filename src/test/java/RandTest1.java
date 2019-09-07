/**
 * 
 */


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Test;

/**
 * @author zhangzhi
 *2019年9月5日
 */
public class RandTest1{
	@Test 
	void Testt() {
		for (int i = 0; i < 5; i++) 			
		retusui();
	}
	public void retusui() {
		Random r = new Random();
		int year=(int)(1959+Math.random()*(2001-1959+1));
		int month = r.nextInt(12);
		int day= r.nextInt(30);
		int hh= r.nextInt(24);//24小时
		int minute= r.nextInt(60);//24小时
		int second= r.nextInt(60);//24小时

		Calendar c = Calendar.getInstance();
		c.set(year, month, day, hh, minute, second);
		SimpleDateFormat sim = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		String str = sim.format(c.getTime());
		
		
		
		System.out.println(str);
	}
	
	@Test
	public void RandomTest() {
		//先创建了一个随机数的！
				Random r = new Random();
				//是显示的是0到99之间的，但是是不包含100的，所以是要将结果加1的！
				for (int i = 0; i < 10; i++) {
					//接受键盘录入的随机数
					int number = r.nextInt(100)+1;
					//因为在接收的时候，是已经进行了+1了，所以直接输出number;
					//而且是可以取到100的
					System.out.println("结果number是；"+number );
				}
	}







	@Test
	public void testsub() {
		int[] x = subRandom(1, 52, 3);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		char c = randchar();
		System.out.println(c);
		String str = randString(5);
		System.out.println(str);
	}
	
	public int[] subRandom(int min,int max,int subs) {
		
		int[] x=new int[subs];
		HashSet set=new HashSet<Integer>(subs);
		
		while(set.size()!=subs) {
			set.add((int)(min+Math.random()*(max-min+1)));
		}
		for (int i = 0; i < set.size(); i++) {
			for (Object sets : set) {
				x[i]=(int) sets;
			}
		}
		
		return x;
	}
//	随机字符
	public static char randchar() {
		Random r = new Random();
		String str="123456789asdfghjklqwertyuiopzxcvbnm";
		char c = str.charAt(r.nextInt(str.length()));
		
		return c;
	}
//	随机字符串
	public static String randString(int len) {
		String str="";
		for (int i = 0; i < len; i++) 
		str+=randchar();
		return str;
	}


















}

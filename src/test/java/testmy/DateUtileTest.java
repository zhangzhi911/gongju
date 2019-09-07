/**
 * 
 */
package testmy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.zhangzhi.myUtil.DateUtil;

/**
 * @author zhangzhi
 *2019年9月6日
 */
public class DateUtileTest {
	@Test
	public void randmodate() {
			Calendar c = Calendar.getInstance();			c.set(1937, 0, 1);
			;
		long l= DateUtil.randomDate(c.getTime(),new Date());
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		c.setTimeInMillis(l);
		String str = sim.format(c.getTime());
		System.out.println(str);
	}
}

/**
 * 
 */
package testmy;

import java.io.UnsupportedEncodingException;
import java.util.Random;

import org.junit.Test;

import com.zhangzhi.myUtil.RandomUtil;
import com.zhangzhi.myUtil.StringUtil;

/**
 * @author zhangzhi 2019年9月6日
 */
public class StringUtilTest {
	@Test
	public void StringUtilTest() {
		boolean b = StringUtil.hasLength(" ");
		System.out.println(b);
	};

	@Test
	public void randomChineseStringY() {
		for (int i = 0; i < 10; i++) {
			String b = StringUtil.randomChineseString(5);
			System.out.println(b);
		}
	};
	@Test
	public void generateChineseName() {
		for (int i = 0; i < 100; i++) {
			String b = StringUtil.randomChineseString(5);
			String c = StringUtil.generateChineseName();
			System.out.println(b+c);
		}
	};
	
	
	
}

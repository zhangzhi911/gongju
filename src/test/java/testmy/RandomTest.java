/**
 * 
 */
package testmy;

import org.junit.Test;

import com.zhangzhi.myUtil.RandomUtil;

/**
 * @author zhangzhi
 *2019年9月6日
 */
public class RandomTest {

	@Test
	public void RandomUtilTest() {
		int i = RandomUtil.randome(1, 10);
		System.out.println("随机数是"+i);
	};
	
	@Test
	public void subRandomTest() {
		int[] x = RandomUtil.subRandom(1, 10,5);
		for (int j = 0; j < x.length; j++) {
			System.out.println(x[j]);
		}
	};
	@Test
	public void randomCharacterTest() {
		 char c = RandomUtil.randomCharacter();
		 System.out.println(c);
	};
	@Test
	public void randomStringTest() {
		 String c = RandomUtil.randomString(5);
		 System.out.println(c);
	};
	
	
}

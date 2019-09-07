/**
 * 
 */
package com.zhangzhi.myUtil;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.support.ManagedArray;

/**
 * @author zhangzhi
 *2019年9月6日
 */
public class DateUtil {
	//随机日期
	public static long randomDate(Date d1,Date d2) {

		Calendar c = Calendar.getInstance();
		
		long t1 = d1.getTime();
		long t2 = d2.getTime();
		
		long l3=(long) ((Math.random()*(t2-t1+1))+t1);
		
		c.setTimeInMillis(l3);
		return l3;
	}
	
}

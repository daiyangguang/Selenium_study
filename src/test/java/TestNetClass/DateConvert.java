package dada;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.sun.jna.platform.unix.X11.XClientMessageEvent.Data;

public class DateConvert {
	/**
	 * 时间戳转时间字符串类型
	 * 1、设定时间格式类型
	 * 2、将时间戳类型转化为长整型
	 * 3、将长整型转换为时间类型
	 * 4、格式化时间类型
	 * 
	 * */
	public static String stampToDate (String stamp) {
		String result = "";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss"); 
		long lstamp = new Long(stamp);
		Date date = new Date(lstamp);
		result = format1.format(date);
		return result;
	}
}

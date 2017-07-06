package org.vchat.server;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 获取当前系统时间的工具类
 * 获取当前系统的IP地址
 * */
public class DateUtil {
	public static String getTime(){
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
		return format.format(new Date());
	}
}
/*//获取远程客户端的IP地址
String userip = s.getInetAddress().getHostAddress();
*/
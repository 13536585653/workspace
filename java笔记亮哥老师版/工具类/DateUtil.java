package org.vchat.server;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡ��ǰϵͳʱ��Ĺ�����
 * ��ȡ��ǰϵͳ��IP��ַ
 * */
public class DateUtil {
	public static String getTime(){
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
		return format.format(new Date());
	}
}
/*//��ȡԶ�̿ͻ��˵�IP��ַ
String userip = s.getInetAddress().getHostAddress();
*/
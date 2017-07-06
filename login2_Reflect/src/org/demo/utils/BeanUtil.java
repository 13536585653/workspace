package org.demo.utils;

import java.lang.reflect.Field;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Map;

public class BeanUtil {
	//mapping ӳ��

	@SuppressWarnings("unchecked")
	public static <T> T mapping(Map<String, String[]> map, Class<T> clazz) {
		try {
			Object instance = clazz.newInstance();
			// ��ȡʵ���е����������ֶ�
			Field[] fields = clazz.getDeclaredFields();
			// ѭ�������������飬Ϊÿһ�����Խ��и�ֵ
			// ���Ҫ��������ת�������Ը���field.getType()�����õ����Ե�����
			// Ȼ�󽫱�������ת���ɶ�Ӧ���ͺ���и�ֵ
			for (Field f : fields) {
				// �����Եķ��ʿ���
				f.setAccessible(true);
				// ��ȡ��Ԫ�ص�ֵ�����е�����ȫ������String���ͣ�
				String formValue = map.get(f.getName())[0];
				// ������ֵ��ֵ��������Ӧ������
				// ע�⣺����ÿһ�����Ե������ǲ�һ���ģ���˲���ֱ�ӽ���������ֱ�Ӹ�ֵ
				// ��Ҫ����һ������ת���Ĺ���
				Object value = parseValue(f, formValue);
				if (value != null)
					f.set(instance, value);
			}
			// ����ӳ��õ�ʵ�����
			return (T)instance;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * �˷�������ִ������ת��������8�������������ͺ�8����װ���ͣ� ������������ ��Ϊת���õ�ֵ������8���������͵�����һ�֣����ʹ��Object��ʾ
	 * 
	 * @param args
	 */
	private static Object parseValue(Field field, String formValue) {
		Class<?> fieldType = field.getType();
		if (fieldType.equals(String.class)) {
			return formValue;
		} else if (fieldType.equals(int.class) || fieldType.equals(Integer.class)) {
			return Integer.valueOf(formValue);
		} else if (fieldType.equals(byte.class) || fieldType.equals(Byte.class)) {
			return Byte.valueOf(formValue);
		} else if (fieldType.equals(short.class) || fieldType.equals(Short.class)) {
			return Short.valueOf(formValue);
		} else if (fieldType.equals(long.class) || fieldType.equals(Long.class)) {
			return Long.valueOf(formValue);
		} else if (fieldType.equals(float.class) || fieldType.equals(Float.class)) {
			return Float.valueOf(formValue);
		} else if (fieldType.equals(double.class) || fieldType.equals(Double.class)) {
			return Double.valueOf(formValue);
		} else if (fieldType.equals(char.class) || fieldType.equals(Character.class)) {
			return formValue.toCharArray()[0];
		} else if (fieldType.equals(boolean.class) || fieldType.equals(Boolean.class)) {
			return Boolean.valueOf(formValue);
		} else if (fieldType.equals(Date.class)) {
			return Date.valueOf(formValue);
		} else if (fieldType.equals(Timestamp.class)) {
			return Timestamp.valueOf(formValue);
		} else {
			return null;
		}
	}
}

package org.demo.utils;

import java.lang.reflect.Field;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Map;

public class BeanUtil {
	//mapping 映像

	@SuppressWarnings("unchecked")
	public static <T> T mapping(Map<String, String[]> map, Class<T> clazz) {
		try {
			Object instance = clazz.newInstance();
			// 获取实体中的所有属性字段
			Field[] fields = clazz.getDeclaredFields();
			// 循环遍历属性数组，为每一个属性进行赋值
			// 如果要进行类型转换，可以根据field.getType()方法得到属性的类型
			// 然后将表单的数据转换成对应类型后进行赋值
			for (Field f : fields) {
				// 打开属性的访问开关
				f.setAccessible(true);
				// 获取表单元素的值（表单中的数据全部都是String类型）
				String formValue = map.get(f.getName())[0];
				// 将表单的值赋值给对象相应的属性
				// 注意：由于每一个属性的类型是不一样的，因此不能直接将表单的数据直接赋值
				// 需要进行一个类型转换的过程
				Object value = parseValue(f, formValue);
				if (value != null)
					f.set(instance, value);
			}
			// 返回映射好的实体对象
			return (T)instance;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 此方法用于执行类型转换（包括8个基本数据类型和8个包装类型） 还有日期类型 因为转换好的值可以是8个数据类型的任意一种，因此使用Object表示
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

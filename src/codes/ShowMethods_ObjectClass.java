package codes;

import java.lang.reflect.Method;

public class ShowMethods_ObjectClass {

	public static void main(String[] args) throws ClassNotFoundException {
		int count = 0;
		Class c = Class.forName("org.openqa.selenium");
		Method[] m = c.getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			count++;
			System.out.println(m[i]);
		}
		System.out.println("Total methods present " + count);

	}

}

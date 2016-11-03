package frame.test;

import frame.core.FileSystemBeanFactory;

public class IocTest {

	public static void main(String[] args) {
		FileSystemBeanFactory fb = new FileSystemBeanFactory("frame.propriety");
		Object obj = fb.getBean("Test");
		System.out.println(obj);
	}
	
}

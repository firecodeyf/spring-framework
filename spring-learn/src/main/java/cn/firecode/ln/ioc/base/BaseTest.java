package cn.firecode.ln.ioc.base;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Flynn
 * @date 2021/8/18
 */
public class BaseTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		ctx.close();
	}
}

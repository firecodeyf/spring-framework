package cn.firecode.ln.ioc.base;

import org.springframework.stereotype.Component;

/**
 * @author Flynn
 * @date 2021/8/18
 */
@Component
public class Car {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

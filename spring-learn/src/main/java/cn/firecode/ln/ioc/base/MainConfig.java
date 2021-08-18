package cn.firecode.ln.ioc.base;

import org.graalvm.compiler.lir.CompositeValue;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Flynn
 * @date 2021/8/18
 */
@Configuration
@ComponentScan(basePackages = {"cn.firecode.ln"})
public class MainConfig {
}

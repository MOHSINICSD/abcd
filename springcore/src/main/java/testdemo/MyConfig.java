package testdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "testdemo")
public class MyConfig {

	@Bean(name = {"myBean"})
	public MyBean getMyBean()
	{
		MyBean bean=new MyBean();
		bean.setData(200);
		return bean;
	}
}

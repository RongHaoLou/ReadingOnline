package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * 应用配置
 * @author WANG
 *
 */
@Configuration
@ComponentScan({"dao","service","controller","com.alipay.config"})
@Import({JdbcConfig.class,WebConfig.class})
public class AppConfig {
	
	
	
	
	
	
	
	
	
	
	
}

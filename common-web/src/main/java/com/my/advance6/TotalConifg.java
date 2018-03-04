package com.my.advance6;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/*
 * 结合了config类和xml配置  
 * 使用import将配置类导入，使用@ImportResource将xml配置导入直接读取总配置类即可
 */
@Configuration
@Import(value={CDConfig.class})
@ImportResource(locations={"classpath:com/my/advance6/justCDPlayerInject.xml"})
public class TotalConifg {

}

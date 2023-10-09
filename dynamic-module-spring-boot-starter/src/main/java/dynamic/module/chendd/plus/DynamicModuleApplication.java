package dynamic.module.chendd.plus;

import dynamic.module.chendd.plus.common.CommonUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DynamicModuleApplication {
  public static void main(String[] args) {
    
    SpringApplication.run(DynamicModuleApplication.class, args);
    
    // resolve java setup command, example: java -jar dynamic-module-spring-boot-starter-0.0.1-SNAPSHOT.jar --entryNode=
    CommonUtil.resolveCommandArgs(args);
  }
}

package dynamic.module.chendd.plus.config;

import dynamic.module.chendd.plus.properties.ObjectStorageProperties;
import dynamic.module.chendd.plus.template.MinioObjectStorageTemplate;
import dynamic.module.chendd.plus.template.ObjectStorageTemplate;
import io.minio.MinioClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 对象存储的配置类
 *
 * @auther lihh
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnClass({MinioClient.class})
@EnableConfigurationProperties({ObjectStorageProperties.class})
public class MinioObjectStorageConfig {
  
  private final ObjectStorageProperties objectStorageProperties;
  
  @Bean(name = "objectStorageTemplate")
  @ConditionalOnMissingBean
  @ConditionalOnProperty(prefix = "server.object-storage", name = {"serverType", "server-type"}, havingValue = "minio", matchIfMissing = true)
  public ObjectStorageTemplate minioObjectStorageTemplate() {
    String endpoint = this.objectStorageProperties.getEndpoint();
    String accessKey = this.objectStorageProperties.getAccessKey();
    String secretKey = this.objectStorageProperties.getSecretKey();
    return new MinioObjectStorageTemplate(MinioClient.builder().endpoint(endpoint).credentials(accessKey, secretKey).build());
  }
  
  public MinioObjectStorageConfig(ObjectStorageProperties objectStorageProperties) {
    this.objectStorageProperties = objectStorageProperties;
  }
}

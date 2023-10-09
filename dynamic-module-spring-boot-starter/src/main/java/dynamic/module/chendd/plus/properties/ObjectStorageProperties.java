package dynamic.module.chendd.plus.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "server.object-storage")
@Data
public class ObjectStorageProperties {
  private ServerType serverType;
  private String endpoint;
  private String accessKey;
  private String secretKey;
  
  
  public static enum ServerType {
    MINIO, NO_MINIO;
    
    private ServerType() {
    }
  }
}
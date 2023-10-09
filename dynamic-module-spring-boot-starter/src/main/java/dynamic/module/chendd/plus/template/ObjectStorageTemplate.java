package dynamic.module.chendd.plus.template;

import org.springframework.web.multipart.MultipartFile;

public interface ObjectStorageTemplate {
  void putObject(String bucketName, MultipartFile file);
  
  boolean modifyBucketState(String bucketName, boolean isPublic);
  
  boolean bucketExists(String bucketName);
  
  void deleteObject(String bucketName);
}

package dynamic.module.chendd.plus.template;

import io.minio.MinioClient;
import org.springframework.web.multipart.MultipartFile;

/**
 * 基于minio 实现的操作类
 *
 * @auther lihh
 */
public class MinioObjectStorageTemplate implements ObjectStorageTemplate {
  
  private MinioClient minioClient;
  
  public MinioObjectStorageTemplate(MinioClient minioClient) {
    this.minioClient = minioClient;
  }
  
  /**
   * 添加对象 && 并且将对象放置到桶中（本意是将上传的内容直接放到minio中）
   *
   * @param bucketName 桶名称
   * @param file       上传的文件
   * @auther lihh
   */
  @Override
  public void putObject(String bucketName, MultipartFile file) {
  
  }
  
  
  /**
   * 修改桶的状态 可以将其修改为公开的（可以访问的）/ 私有的（不允许访问的）
   *
   * @param bucketName 桶名称
   * @param isPublic   是否公开
   * @return 返回是否修改成功
   * @auther lihh
   */
  @Override
  public boolean modifyBucketState(String bucketName, boolean isPublic) {
    return false;
  }
  
  /**
   * 用来判断桶是否存在
   *
   * @param bucketName 表示桶名称
   * @return 返回桶是否存在
   * @auther lihh
   */
  @Override
  public boolean bucketExists(String bucketName) {
    return false;
  }
  
  /**
   * 删除桶对象
   *
   * @param bucketName 表示桶名称
   * @auther lihh
   */
  @Override
  public void deleteObject(String bucketName) {
  
  }
}

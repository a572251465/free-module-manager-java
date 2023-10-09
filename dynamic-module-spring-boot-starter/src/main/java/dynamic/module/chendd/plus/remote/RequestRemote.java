package dynamic.module.chendd.plus.remote;

import dynamic.module.chendd.plus.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * 表示远程请求
 *
 * @author lihh
 */
@Component
public class RequestRemote {
  
  @Autowired
  private RestTemplate restTemplate;
  
  /**
   * 表示remote  的get请求
   *
   * @param url
   * @return
   * @author lihh
   */
  public Result get(String url) {
    // 直接进行 get请求
    String resultStr = restTemplate.getForObject(url, String.class);
    return Result.ok().setData(resultStr);
  }
}

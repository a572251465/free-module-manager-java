package dynamic.module.chendd.plus.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * ping 服务的实现
 *
 * @auther lihh
 */
@RestController
@RequestMapping("/connect")
public class PingServiceImpl {
  
  /**
   * 表示ping 处理
   *
   * @param order ping 的顺序
   * @auther lihh
   */
  @GetMapping("/ping/{order}")
  public void ping(@PathVariable("order") int order) {
  
  }
}

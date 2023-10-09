package dynamic.module.chendd.plus.ack;

import dynamic.module.chendd.plus.storage.StorageObjectUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * ping 服务的实现
 *
 * @auther lihh
 */
@RestController
@RequestMapping("/connect")
public class AckServiceImpl {
  
  /**
   * 表示ack 确认 处理
   *
   * @param order ping 的顺序
   * @auther lihh
   */
  @GetMapping("/ack/{order}/{address}")
  public void ping(@PathVariable("order") int order, @PathVariable("address") String address, HttpServletRequest request) {
    // 如果order == 2 的场合，说明服务之间的通信是ok
    if (order == 2) {
      StorageObjectUtil.storage.add(address);
    }
  }
}

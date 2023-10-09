package dynamic.module.chendd.plus;

import lombok.Data;

/**
 * 解析的命令参数
 *
 * @auther lihh
 */
@Data
public class CommandArgs {
  // 入口节点 通过哪个节点来加入到集群
  private String entryNode;
  // 自定义 协议
  private String customProtocol = "http";
}

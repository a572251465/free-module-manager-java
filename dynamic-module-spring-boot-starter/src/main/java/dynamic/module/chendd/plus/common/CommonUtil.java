package dynamic.module.chendd.plus.common;

import dynamic.module.chendd.plus.CommandArgs;

import javax.servlet.http.HttpServletRequest;

/**
 * 表示共同的工具类
 *
 * @auther lihh
 */
public class CommonUtil {
  
  // command parameter
  public static final CommandArgs commandArgs = new CommandArgs();
  
  /**
   * 获取服务前缀path 比如：http://localhost:8080
   *
   * @param request 请求的request
   * @return 返回完整的path
   * @auther lihh
   */
  public static String getServerPrefixPath(HttpServletRequest request) {
    String scheme = request.getScheme();
    String serverName = request.getServerName();
    int serverPort = request.getServerPort();
    return scheme + "://" + serverName + ":" + serverPort;
  }
  
  /**
   * 添加请求协议前缀
   *
   * @param url 请求的url
   * @return
   * @auther lihh
   */
  public static String addProtocolPrefix(String url) {
    if (url.startsWith("http://") || url.startsWith("https://")) {
      return url;
    }
    return "http://" + url;
  }
  
  /**
   * resolve java command parameter
   *
   * @param args the parameter of java command, Type is string[]
   * @auther lihh
   */
  public static void resolveCommandArgs(String[] args) {
    for (int i = 0; i < args.length; i++) {
      String item = args[i];
      // character string is not include "=", program will continue
      if (item.indexOf("=") == -1) continue;
      
      String[] split = item.split("=");
      switch (split[0]) {
        case Constant.ENTRY_NODE_PREFIX:
          commandArgs.setEntryNode(split[1]);
          break;
        case Constant.CUSTOM_PROTOCOL_PREFIX:
          commandArgs.setCustomProtocol(split[1]);
          break;
      }
    }
  }
}

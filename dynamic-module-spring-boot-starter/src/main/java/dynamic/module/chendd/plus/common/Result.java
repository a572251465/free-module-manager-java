package dynamic.module.chendd.plus.common;

import java.io.Serializable;
import java.util.LinkedHashMap;

/**
 * 表示定义共同的返回结果
 *
 * @author lihh
 */
public class Result extends LinkedHashMap<String, Object> implements Serializable {
  private String message;
  private int code;
  private Object data;
  
  public Result() {
  }
  
  public Result(int code, String message, Object data) {
    this.setCode(code);
    this.setMessage(message);
    this.setData(data);
  }
  
  public Result setCode(Integer code) {
    this.put("code", code);
    return this;
  }
  
  public Result setMessage(String message) {
    this.put("message", message);
    return this;
  }
  
  public Result setData(Object data) {
    this.put("data", data);
    return this;
  }
  
  public static Result ok() {
    return new Result(Constant.REQUEST_SUCCESS_CODE, "success", null);
  }
  
  public static Result error(String message) {
    return new Result(Constant.REQUEST_ERROR_CODE, message, null);
  }
}

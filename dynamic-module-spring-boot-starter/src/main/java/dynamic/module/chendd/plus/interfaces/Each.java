package dynamic.module.chendd.plus.interfaces;

/**
 * 表示循环遍历的函数式 接口
 *
 * @author lihh
 */
@FunctionalInterface
public interface Each {
  <T> void invoke(T object);
}

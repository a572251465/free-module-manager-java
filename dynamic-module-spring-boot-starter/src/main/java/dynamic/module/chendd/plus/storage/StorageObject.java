package dynamic.module.chendd.plus.storage;

import dynamic.module.chendd.plus.interfaces.Each;

import java.util.Collections;
import java.util.List;

/**
 * 存储对象的类
 *
 * @param <T>
 * @author lihh
 */
public class StorageObject<T> {
  private final List<T> storageObjects = Collections.synchronizedList(Collections.emptyList());
  
  /**
   * 判断指定的对象是否存在 是否存在
   *
   * @param object
   * @return
   */
  public boolean isExist(T object) {
    return storageObjects.contains(object);
  }
  
  /**
   * 内部分装方法/ 循环遍历
   *
   * @param eachUtil
   * @auther lihh
   */
  public void each(Each eachUtil) {
    storageObjects.stream().forEach(eachUtil::invoke);
  }
  
  /**
   * 内部封装方法/ 遍历遍历 （可以排除指定对象）
   *
   * @param eachUtil
   * @param excludeObject
   */
  public void each(Each eachUtil, List<String> excludeObject) {
    storageObjects.stream().filter(object -> !excludeObject.contains(object)).forEach(eachUtil::invoke);
  }
  
  
  /**
   * 往集合中添加对象
   *
   * @param object 添加的对象
   * @auther lihh
   */
  public void add(T object) {
    if (isExist(object)) return;
    storageObjects.add(object);
  }
  
  /**
   * 删除指定的对象
   *
   * @param object 要删除的对象
   * @auther lihh
   */
  public void remove(T object) {
    if (!isExist(object)) return;
    storageObjects.remove(object);
  }
}
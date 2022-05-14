package com.roger.designmode.factoryPattern;

/**
 * @author: 骆佳俊
 * @date: 2022/5/14 5:08 PM
 */
public class HumanFactory extends AbstractHumanFactory {
  @Override
  public <T extends Human> T createHuman(Class<T> c) {
    // 定义一个生产的人种
    Human human = null;
    try {
      // 产生一个人种
      human = (Human) Class.forName(c.getName()).newInstance();
    } catch (Exception e) {
      System.out.println("人种生成错误！");
    }
    return (T) human;
  }
}

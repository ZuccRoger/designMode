package com.roger.designmode.factoryPattern;

/**
 * @author: 骆佳俊
 * @date: 2022/5/14 5:05 PM
 */
public class WhiteHuman implements Human {
  @Override
  public void getColor() {
    System.out.println("白色人种的皮肤颜色是白色的!");
  }

  @Override
  public void talk() {
    System.out.println("白色人种会说话，一般都是但是单字节。");
  }
}

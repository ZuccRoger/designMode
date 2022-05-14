package com.roger.designmode.factoryPattern;

/**
 * @author: 骆佳俊
 * @date: 2022/5/14 5:08 PM
 */
public abstract class AbstractHumanFactory {
  public abstract <T extends Human> T createHuman(Class<T> c);
}

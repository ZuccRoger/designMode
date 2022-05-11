package com.roger.designmode.proxyPattern;

/**
 * @author: 骆佳俊
 * @date: 2022/5/7 7:45 PM
 */
public interface IGamePlayer {
  // 登陆
  public void login(String user, String password);
  // 杀怪
  public void killBoss();
  // 升级
  public void upgrade();
}

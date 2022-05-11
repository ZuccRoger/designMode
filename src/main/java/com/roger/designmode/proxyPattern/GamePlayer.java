package com.roger.designmode.proxyPattern;

/**
 * @author: 骆佳俊
 * @date: 2022/5/7 7:52 PM
 */
public class GamePlayer implements IGamePlayer {
  private String name = "";

  public GamePlayer(String name) {
    this.name = name;
  }

  @Override
  public void login(String user, String password) {
    System.out.println(this.name + "登陆");
  }

  @Override
  public void killBoss() {
    System.out.println(this.name + "杀Boss");
  }

  @Override
  public void upgrade() {
    System.out.println(this.name + "升级");
  }
}

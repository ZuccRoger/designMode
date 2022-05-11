package com.roger.designmode.proxyPattern;

/**
 * @author: 骆佳俊
 * @date: 2022/5/7 7:47 PM
 */
public class GamePlayerProxy implements IGamePlayer {
  /** 通过构造函数传递要对谁进行代练 */
  private IGamePlayer gamePlayer = null;

  public GamePlayerProxy(IGamePlayer _gamePlayer) {
    this.gamePlayer = _gamePlayer;
  }

  @Override
  public void killBoss() {
    this.gamePlayer.killBoss();
  }

  @Override
  public void login(String user, String password) {
    this.gamePlayer.login(user, password);
  }

  @Override
  public void upgrade() {
    this.gamePlayer.upgrade();
  }
}

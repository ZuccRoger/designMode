package com.roger.designmode.proxyPattern;

/**
 * @author: 骆佳俊
 * @date: 2022/5/7 7:46 PM
 */
public class Client {
  public static void main(String[] args) {

    // 定义一个痴迷的玩家
    IGamePlayer player = new GamePlayer("张三");

    IGamePlayer proxy = new GamePlayerProxy(player);
    // 开始打游戏，记下时间戳
    System.out.println("开始时间是:2009-8-25 10:45");

    proxy.login("zhangSan", "password");
    // 开始杀怪
    proxy.killBoss();
    // 升级
    proxy.upgrade();
    // 记录结束游戏时间
    System.out.println("结束时间是:2009-8-26 03:40");
  }
}

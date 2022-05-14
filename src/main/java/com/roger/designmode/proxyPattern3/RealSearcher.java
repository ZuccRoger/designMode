package com.roger.designmode.proxyPattern3;

/**
 * @author: 骆佳俊
 * @date: 2022/5/11 8:49 AM
 */
public class RealSearcher implements Searcher {
  // 模拟查询商务信息
  @Override
  public String doSearch(String userId, String keyword) {
    System.out.println("用户" + userId + "使用关键词" + keyword + "查询商务信息!");
    return "返回具体内容";
  }
}

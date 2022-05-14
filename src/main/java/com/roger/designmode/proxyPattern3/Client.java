package com.roger.designmode.proxyPattern3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 骆佳俊
 * @date: 2022/5/11 8:50 AM
 */
public class Client {

  public static void main(String[] args) {
    //针对抽象编程，客户端无需分辨真实主题类和代理类
    Searcher searcher;
    searcher = (Searcher)XMLUtil.getBean();
    String result = searcher.doSearch("杨过", "小龙女");
  }
}


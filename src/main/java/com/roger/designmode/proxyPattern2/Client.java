package com.roger.designmode.proxyPattern2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 骆佳俊
 * @date: 2022/5/11 8:50 AM
 */
@Controller
public class Client {
  @Autowired ProxySearcher proxySearcher;

  @RequestMapping("/proxyMode/test")
  public String main() {
    String result = proxySearcher.doSearch("杨过", "小龙女");
    return result;
  }
}

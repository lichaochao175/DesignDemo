package com.lcc.strategy.strategyDemo;

import com.lcc.strategy.common.CashNormal;
import com.lcc.strategy.common.CashRebate;
import com.lcc.strategy.common.CashReturn;
import com.lcc.strategy.common.CashSuper;

/**
 * @author Licc
 * @date 2023/1/7 10:24 AM
 * 策略与简单工厂结合
 */
public class CashContext {
   private CashSuper cs =null;
  public CashContext(String type){
        //type :收费类型
      switch (type){
          case "正常收费":
              CashNormal cn = new CashNormal();
              cs = cn;
              break;
          case "满300减100":
              CashReturn cr = new CashReturn("300","100");
              cs=cr;
              break;
          case "打8折":
              CashRebate chr = new CashRebate("0.8");
              cs=chr;
              break;
      }
  }
    /**
     *   上下文接口,根据具体的策略对象，调用其算法的方法
     */
    public  double GetResult(double money){
     return  cs.acceptCash(money);
    }
}
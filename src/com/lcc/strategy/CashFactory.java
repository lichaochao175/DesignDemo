package com.lcc.strategy;

import com.lcc.strategy.common.CashNormal;
import com.lcc.strategy.common.CashRebate;
import com.lcc.strategy.common.CashReturn;
import com.lcc.strategy.common.CashSuper;

/**
 * @author Licc
 * @date 2023/1/7 9:59 AM
 * 简单工厂模式
 */
public class CashFactory {

    public static CashSuper createCashAccept(String type) {
        CashSuper cs=null;
        switch (type){
            case "正常收费":
                cs = new CashNormal();
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
        return  cs;
    }
}
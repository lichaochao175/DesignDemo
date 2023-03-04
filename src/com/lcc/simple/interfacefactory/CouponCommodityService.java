package com.lcc.simple.interfacefactory;

import lombok.Synchronized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author Licc
 * @date 2023/2/12 10:27 AM
 */
public class CouponCommodityService  implements  ICommodity {

    private final Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);




    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
    }
}
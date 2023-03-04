package com.lcc.structure.facadepatterns;

import org.springframework.util.StringUtils;

/**
 * @author Licc
 * @date 2023/3/4 5:42 PM
 * 配置服务类
 */
public class StarterService {
     private String userStr;

     public StarterService (String userStr){
         this.userStr =userStr;
     }
     public String[] splits(String separatorChar){
          return StringUtils.split(this.userStr,separatorChar);
     }
}
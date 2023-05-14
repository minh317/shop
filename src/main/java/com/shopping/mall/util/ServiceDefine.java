package com.shopping.mall.util;

import lombok.Getter;

@Getter
public class ServiceDefine {

    public static String environment;
    public static String transactionId;

    public ServiceDefine(String environment, String transactionId) {
        ServiceDefine.environment = environment;
        ServiceDefine.transactionId = transactionId;
    }
}

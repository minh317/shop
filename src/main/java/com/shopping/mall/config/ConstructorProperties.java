package com.shopping.mall.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.util.List;

@Getter
@RequiredArgsConstructor
@ConfigurationProperties(prefix = "properties")
@ConstructorBinding
public class ConstructorProperties {

    private final SecurityProperty securityProperty;

    @Getter
    @Setter
    @RequiredArgsConstructor
    public static final class SecurityProperty {
        private List<String> ignoreUrl;
    }
}

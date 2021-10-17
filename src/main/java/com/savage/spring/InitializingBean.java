package com.savage.spring;

public interface InitializingBean {
    void afterPropertiesSet() throws Exception;
}

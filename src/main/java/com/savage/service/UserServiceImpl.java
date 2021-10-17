package com.savage.service;


import com.savage.spring.*;

@Component("userService")
//@Scope("prototype")//多例
@Scope("singleton")//单例
public class UserServiceImpl implements BeanNameAware, InitializingBean,UserService {

    @Autowired
    private OrderService orderService;

    private String beanName;

    public void test() {
        System.out.println(orderService);
        System.out.println(beanName);
    }

    @Override
    public void setName(String name) {
        beanName = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化");
    }
}

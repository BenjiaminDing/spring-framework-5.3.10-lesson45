package com.zhouyu.factory;


import com.zhouyu.service.user.UserService;
import org.springframework.beans.factory.SmartFactoryBean;

/**
 * created     by benjiamin at 2022-08-31 / 20:10 /10
 */
//@Component("userService")

public class ZhouyuFactorySmartBean implements SmartFactoryBean {


    // ZhouyuFactoryBean 会放入单例池
    // 使用这个方式 创建bean  ,userService类上不需要使用@Component 注解
    @Override
    public Object getObject() throws Exception {
        return new UserService();   // 不会放入单例池
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }
    /**
     * 使用这种方式 ，得到的UserService 经过的生命周期是没有初始化前的 和使用@Bean在方法上 声明的UserService 形成鲜明的对比，后者经历三个过程
     */



// 默认返回false--getObject()是在getBean()时候才开始创建对象，，，，，如果  使用返回的是true--那么就是让容器启动的时候就创建UserService，
    @Override
    public boolean isEagerInit() {
        return true;
    }


}

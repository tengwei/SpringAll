package cc.mrbird.demo.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author MrBird
 */

public class Fish implements InitializingBean, DisposableBean {

    public Fish() {
        System.out.println("Fish 调用无参构造器创建Fish");
    }

    @PostConstruct
    public void init1() {
        System.out.println("初始化Fish-PostConstruct");
    }

    @PreDestroy
    public void destory1() {
        System.out.println("销毁Fish-PreDestroy");
    }


    public void init2() {
        System.out.println("initMethod-init");
    }

    public void destroy2() {
        System.out.println("destroyMethod-destory");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean-destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean-afterPropertiesSet");
    }
}

package cc.mrbird.demo.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author MrBird
 */
@Service
@Transactional
public class User {

    public User() {
        System.out.println("调用无参构造器创建User");
    }

    @Transactional
    public void init() {
        System.out.println("初始化User");
    }

    public void destory() {
        System.out.println("销毁User");
    }
}

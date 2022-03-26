package cn.bigcoder.spring.test.beanfactory;

import cn.bigcoder.spring.test.model.User;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author: Jindong.Tian
 * @date: 2022-03-26
 **/
@Component
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setName("test");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}

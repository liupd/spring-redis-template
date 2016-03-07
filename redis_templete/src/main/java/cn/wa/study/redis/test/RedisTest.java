package cn.wa.study.redis.test;

import cn.wa.study.redis.RedisClientTemplate;
import cn.wa.study.redis.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Liupd on 16-3-4.
 **/

public class RedisTest {

   public static void main(String[] args){
       ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/data-source.xml");
       RedisClientTemplate redisClient = (RedisClientTemplate)ac.getBean("redisClientTemplate");
       List<User> users=new ArrayList<User>();
       for(int i=0;i<6;i++){
            User user=new User();
            user.setId(1+i);
            user.setName("a"+i);
            users.add(user);
       }
       redisClient.setData("1", users);
       System.out.println(redisClient.get("1"));

   }


}

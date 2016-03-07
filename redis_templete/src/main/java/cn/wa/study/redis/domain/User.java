package cn.wa.study.redis.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * Created by Liupd on 16-3-4.
 **/
public class User implements Serializable{

    private long id;

    @JSONField(serialize=false)
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

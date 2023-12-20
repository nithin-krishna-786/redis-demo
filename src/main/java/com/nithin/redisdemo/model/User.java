package com.nithin.redisdemo.model;

import lombok.Data;
import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("USER")
public class User implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
}

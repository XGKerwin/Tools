package com.example.redis.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
// εΊεε  implements Serializable
public class User implements Serializable {

    private String name;
    private int age;

}
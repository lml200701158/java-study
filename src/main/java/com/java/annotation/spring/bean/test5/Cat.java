package com.java.annotation.spring.bean.test5;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class Cat implements Animal {
    private String catName = "罗小黑";
}

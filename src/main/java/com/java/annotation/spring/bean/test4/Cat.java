package com.java.annotation.spring.bean.test4;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
//@Service("miniCat")
public class Cat implements Animal {
    private String catName = "罗小黑";
}

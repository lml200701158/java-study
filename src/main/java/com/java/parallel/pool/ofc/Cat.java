package com.java.parallel.pool.ofc;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class Cat {
    private String catName;
    public Cat setCatName(String name) {
        this.catName = name;
        return this;
    }
}
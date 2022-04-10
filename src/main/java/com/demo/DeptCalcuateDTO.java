package com.demo;

import lombok.*;

import java.util.List;
import java.util.Map;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class DeptCalcuateDTO extends DeptDTO {

    /**
     * 计算数据
     */
    public Integer calculateNumber;
}

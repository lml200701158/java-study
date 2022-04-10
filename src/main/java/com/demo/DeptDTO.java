package com.demo;

import lombok.*;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
public class DeptDTO {
    /**
     * 部门ID dept_code
     */
    public String deptCode;

    /**
     * 部门名称 dept_name
     */
    public String deptName;

    /**
     * 部门级别 dept_level
     */
    public Integer deptLevel;
}

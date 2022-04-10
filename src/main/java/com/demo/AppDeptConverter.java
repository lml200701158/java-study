package com.demo;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * 实体对象转换
 *
 * @author hukangkang
 * @since 2021/11/5
 */
@Mapper(componentModel = "spring")
public interface AppDeptConverter {
    AppDeptConverter INSTANCE = Mappers.getMapper(AppDeptConverter.class);

    DeptCalcuateDTO toDeptCalcuate(DeptDTO deptDTO);
}

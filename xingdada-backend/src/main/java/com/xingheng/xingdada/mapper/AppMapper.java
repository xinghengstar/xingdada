package com.xingheng.xingdada.mapper;

import com.xingheng.xingdada.model.dto.statistic.AppAnswerCountDTO;
import com.xingheng.xingdada.model.dto.statistic.AppAnswerResultCountDTO;
import com.xingheng.xingdada.model.entity.App;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author xingheng
* @description 针对表【app(应用)】的数据库操作Mapper
* @createDate 2025-01-18 22:48:07
* @Entity com.xingheng.xingdada.model.entity.App
*/
public interface AppMapper extends BaseMapper<App> {
}





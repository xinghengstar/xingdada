package com.xingheng.xingdada.controller;

import com.xingheng.xingdada.common.BaseResponse;
import com.xingheng.xingdada.common.ErrorCode;
import com.xingheng.xingdada.common.ResultUtils;
import com.xingheng.xingdada.exception.ThrowUtils;
import com.xingheng.xingdada.mapper.UserAnswerMapper;
import com.xingheng.xingdada.model.dto.statistic.AppAnswerCountDTO;
import com.xingheng.xingdada.model.dto.statistic.AppAnswerResultCountDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * App统计分析接口
 *
 */
@RestController
@RequestMapping("/app/statistic")
@Slf4j
public class StatisticController {

    @Resource
    private UserAnswerMapper userAnswerMapper;

    /**
     * 热门应用及回答数统计(top 10)
     * @return
     */
    @GetMapping("/answer_count")
    public BaseResponse<List<AppAnswerCountDTO>> getAppAnswerCount() {
        return ResultUtils.success(userAnswerMapper.doAppAnswerCount());
    }

    /**
     * 某应用回答结果数分布统计
     * @param appId
     * @return
     */
    @GetMapping("/answer_result_count")
    public BaseResponse<List<AppAnswerResultCountDTO>> getAppAnswerResultCount(Long appId) {
        ThrowUtils.throwIf(appId == null, ErrorCode.PARAMS_ERROR);
        return ResultUtils.success(userAnswerMapper.doAppAnswerResultCount(appId));
    }
}

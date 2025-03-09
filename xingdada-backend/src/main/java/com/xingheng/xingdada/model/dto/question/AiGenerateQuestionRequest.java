package com.xingheng.xingdada.model.dto.question;

import lombok.Data;

import java.io.Serializable;

/**
 * 创建题目请求
 *
 */
@Data
public class AiGenerateQuestionRequest implements Serializable {

    /**
     * 应用 id
     */
    private Long appId;

    /**
     * 题目数量
     */
    int questionNumber = 10;

    /**
     * 选项数
     */
    int optionNumber = 2;

    private static final long serialVersionUID = 1L;
}

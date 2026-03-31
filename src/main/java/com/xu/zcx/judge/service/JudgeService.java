package com.xu.zcx.judge.service;

import com.xu.zcx.model.entity.QuestionSubmit;

/**
 * 判题服务
 * @author Snowyee
 */
public interface JudgeService {

    /**
     * 判题
     * @param questionSubmitId
     * @return
     */
    QuestionSubmit doJudge(long questionSubmitId);
}

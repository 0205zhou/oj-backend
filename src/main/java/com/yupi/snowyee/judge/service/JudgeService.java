package com.yupi.snowyee.judge.service;

import com.yupi.snowyee.model.entity.QuestionSubmit;
import com.yupi.snowyee.model.vo.QuestionSubmitVO;

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

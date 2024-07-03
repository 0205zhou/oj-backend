package com.yupi.snowyee.judge.strategy;

import com.yupi.snowyee.judge.strategy.impl.DefaultJudgeStrategyImpl;
import com.yupi.snowyee.judge.strategy.impl.JavaJudgeStrategyImpl;
import com.yupi.snowyee.judge.codeSandbox.model.JudgeInfo;
import com.yupi.snowyee.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理器: 简化判题的调用
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    public JudgeInfo doJudge(JudgeContext judgeContext){
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategyImpl();
        if ("java".equals(language)) {
            judgeStrategy = new JavaJudgeStrategyImpl();
        }
        return judgeStrategy.doJudge(judgeContext);
    }
}

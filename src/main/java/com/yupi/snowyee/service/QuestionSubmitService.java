package com.yupi.snowyee.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.snowyee.model.dto.question.QuestionQueryRequest;
import com.yupi.snowyee.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.snowyee.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yupi.snowyee.model.entity.Question;
import com.yupi.snowyee.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.snowyee.model.entity.User;
import com.yupi.snowyee.model.vo.QuestionSubmitVO;
import com.yupi.snowyee.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 19457
* @description 针对表【question_submit(题目提交表)】的数据库操作Service
* @createDate 2024-05-20 11:30:37
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);


    /**
     * 获取提交题目封装
     *
     * @param questionSubmit
     * @param request
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取提交题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);


}

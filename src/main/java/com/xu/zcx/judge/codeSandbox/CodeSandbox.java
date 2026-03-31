package com.xu.zcx.judge.codeSandbox;

import com.xu.zcx.judge.codeSandbox.model.ExecuteCodeRequest;
import com.xu.zcx.judge.codeSandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口
 */

public interface CodeSandbox {

    /**
     * 执行代码
     * @param excuteCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest excuteCodeRequest);
}

package com.intelligent.type;

public enum AnswerStatus {
    SAVE,
    COMPILING,//正在编译
    RUNNING,//正在运行
    COMPILE_FAILED,//编译错误
    FINISH_SUCCESS,//运行完成
    FINISH_FAILED;//运行错误
}

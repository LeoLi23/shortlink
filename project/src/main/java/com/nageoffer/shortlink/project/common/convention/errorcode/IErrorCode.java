package com.nageoffer.shortlink.project.common.convention.errorcode;

public interface IErrorCode {
        /**
         * 错误码
         */
        String code();

        /**
        * 错误描述，用于日志打印
        */
        String message();
}

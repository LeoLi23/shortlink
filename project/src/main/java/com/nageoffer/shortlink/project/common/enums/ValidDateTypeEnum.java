package com.nageoffer.shortlink.project.common.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 有效期类型枚举
 */
@Getter
@RequiredArgsConstructor
public enum ValidDateTypeEnum {
    PERMANENT(0),
    CUSTOM(1);

    private final int type;
}

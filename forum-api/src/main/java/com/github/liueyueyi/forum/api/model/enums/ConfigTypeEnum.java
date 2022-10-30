package com.github.liueyueyi.forum.api.model.enums;

import lombok.Getter;

/**
 * 配置类型枚举
 *
 * @author louzai
 * @since 2022/7/19
 */
@Getter
public enum ConfigTypeEnum {

    EMPTY(0, ""),
    HOME_PAGE(1, "首页Banner"),
    SIDE_PAGE(2, "侧边Banner"),
    ADVERTISEMENT(3, "广告Banner"),
    NOTICE(4, "公告");

    ConfigTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private final Integer code;
    private final String desc;

    public static ConfigTypeEnum formCode(Integer code) {
        for (ConfigTypeEnum value : ConfigTypeEnum.values()) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return ConfigTypeEnum.EMPTY;
    }
}
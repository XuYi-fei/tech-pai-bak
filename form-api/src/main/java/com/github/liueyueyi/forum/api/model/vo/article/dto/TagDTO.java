package com.github.liueyueyi.forum.api.model.vo.article.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author YiHui
 * @date 2022/7/24
 */
@Data
public class TagDTO implements Serializable {
    private static final long serialVersionUID = -8614833588325787479L;

    private Long categoryId;

    private Long tagId;

    private String tag;
}
package com.jason.autopush.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatGroupMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer groupId;

    private Integer fromUserId;

    private String content;

    private Date createTime;

    public ChatGroupMessage(Integer groupId, Integer fromUserId, String content, Date createTime) {
        this.groupId = groupId;
        this.fromUserId = fromUserId;
        this.content = content;
        this.createTime = createTime;
    }
}
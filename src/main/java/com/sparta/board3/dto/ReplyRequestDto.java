package com.sparta.board3.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ReplyRequestDto {

    private Long boardId;

    private String reply;
}

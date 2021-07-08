package com.sparta.board3.model;

import com.sparta.board3.dto.ReplyRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long boardId;

    @Column(nullable = false)
    private String reply;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    public Reply(ReplyRequestDto requestDto) {
        this.boardId = requestDto.getBoardId();
        this.reply = requestDto.getReply();
    }

    public void updateReply(ReplyRequestDto requestDto){
        this.boardId = requestDto.getBoardId();
        this.reply = requestDto.getReply();
    }
}

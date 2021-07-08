package com.sparta.board3.service;

import com.sparta.board3.dto.ReplyRequestDto;
import com.sparta.board3.model.Reply;
import com.sparta.board3.repository.ReplyRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyService {

    private final ReplyRepository replyRepository;

    public Long updateReply(Long id, ReplyRequestDto requestDto){
        Reply reply = replyRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("해당아이디가 없습니다.")
        );
        reply.updateReply(requestDto);
        return reply.getId();
    }

}

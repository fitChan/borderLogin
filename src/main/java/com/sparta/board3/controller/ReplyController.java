package com.sparta.board3.controller;

import com.sparta.board3.dto.ReplyRequestDto;
import com.sparta.board3.model.Reply;
import com.sparta.board3.repository.ReplyRepository;
import com.sparta.board3.service.ReplyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller

public class ReplyController {

    private ReplyService replyService;
    private ReplyRepository replyRepository;

    @GetMapping("/post/{id}")
    public List<Reply> getReply(@PathVariable Long boardId){
        return replyRepository.findAll();
    }
}

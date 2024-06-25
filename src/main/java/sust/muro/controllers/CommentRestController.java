package sust.muro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sust.muro.daos.CommentsDao;
import sust.muro.models.Comment;
import sust.muro.models.CommentRepository;

@RestController
@RequestMapping("/api/comments")
public class CommentRestController {

    @Autowired
    CommentsDao commentDao;

    @GetMapping("/{message_id}")
    public List<Comment> getAll(@PathVariable Long message_id) {
        List<Comment> comments = commentDao.getCommentsFromMessage(message_id);

        return comments;
    }

}

package com.back_blind_box_anytime.controller;

import com.back_blind_box_anytime.entity.Comments;
import com.back_blind_box_anytime.entity.SeriesComment;
import com.back_blind_box_anytime.my_interceptor.CurrentUser;
import com.back_blind_box_anytime.my_interceptor.CurrentUserInfo;
import com.back_blind_box_anytime.service.CommentsService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Comments)表控制层
 *
 * @author makejava
 * @since 2023-05-04 08:53:28
 */
@RestController
@RequestMapping("comments")
public class CommentsController {
    /**
     * 服务对象
     */
    @Resource
    private CommentsService commentsService;

    /**
     * 通过主键查询单条数据
     *
     * @param seriesId 系列id
     * @return 单条数据
     */
    @GetMapping("/queryCommentsBySeries")
    public List<SeriesComment> queryBySeriesId(Integer seriesId) {
        return this.commentsService.queryBySeriesId(seriesId);
    }

    /**
     * 新增评论
     */
    @PostMapping("/user/addComments")
    public Comments addComments(Comments comments, @CurrentUser CurrentUserInfo user) {
        comments.setUid(user.getUid());
        return this.commentsService.addComments(comments);
    }
}


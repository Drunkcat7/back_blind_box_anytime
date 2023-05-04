package com.back_blind_box_anytime.service.impl;

import com.back_blind_box_anytime.dao.MyboxDao;
import com.back_blind_box_anytime.entity.Comments;
import com.back_blind_box_anytime.dao.CommentsDao;
import com.back_blind_box_anytime.entity.SeriesComment;
import com.back_blind_box_anytime.service.CommentsService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Comments)表服务实现类
 *
 * @author makejava
 * @since 2023-05-04 08:53:29
 */
@Service("commentsService")
public class CommentsServiceImpl implements CommentsService {
    @Resource
    private CommentsDao commentsDao;
    @Resource
    private MyboxDao myboxDao;

    /**
     * 查询对应的系列的评论
     *
     * @return 实例对象
     */
    @Override
    public List<SeriesComment> queryBySeriesId(Integer seriesId) {
        return this.commentsDao.queryBySeriesId(seriesId);
    }

    /**
     * 添加评论
     *
     * @param comments
     * @return
     */
    @Override
    public Comments addComments(Comments comments) {
        if (myboxDao.checkIsBuy(comments.getUid(), comments.getSeriesId()) == 0) {
            return null;
        }
        this.commentsDao.insert(comments);
        return comments;
    }

}

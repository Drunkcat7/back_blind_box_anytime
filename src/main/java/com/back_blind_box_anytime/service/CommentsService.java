package com.back_blind_box_anytime.service;

import com.back_blind_box_anytime.entity.Comments;
import com.back_blind_box_anytime.entity.SeriesComment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Comments)表服务接口
 *
 * @author makejava
 * @since 2023-05-04 08:53:29
 */
public interface CommentsService {

    /**
     * 查询对应的系列的评论
     *
     * @return 实例对象
     */
    List<SeriesComment> queryBySeriesId(Integer seriesId);

    Comments addComments(Comments comments);

}

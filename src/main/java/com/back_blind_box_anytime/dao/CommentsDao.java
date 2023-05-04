package com.back_blind_box_anytime.dao;

import com.back_blind_box_anytime.entity.Comments;
import com.back_blind_box_anytime.entity.SeriesComment;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * (Comments)表数据库访问层
 *
 * @author makejava
 * @since 2023-05-04 08:53:29
 */
public interface CommentsDao {

    /**
     * 查询对应的系列的评论
     *
     * @return 实例对象
     */
    List<SeriesComment> queryBySeriesId(@Param("seriesId") Integer seriesId);

    /**
     * 新增数据
     *
     * @param comments 实例对象
     * @return 影响行数
     */
    int insert(Comments comments);


}


package com.rabbiter.music.dao;

import com.rabbiter.music.pojo.Rank;
import org.springframework.stereotype.Repository;

/**
 * 评价Dao
 */
@Repository
public interface RankMapper {
    /**
     *增加
     */
    public int insert(Rank rank);

    /**
     * 查总分
     */
    public int selectScoreSum(Integer songListId);

    /**
     * 查总评分人数
     */
    public int selectRankNum(Integer songListId);
}

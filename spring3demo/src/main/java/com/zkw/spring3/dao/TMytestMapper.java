package com.zkw.spring3.dao;

import com.zkw.spring3.entity.TMytest;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/5/16 0016.
 */
@Repository
public interface TMytestMapper {
    int deleteByPrimaryKey(String userId);

    int insert(TMytest record);

    int insertSelective(TMytest record);

    TMytest selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(TMytest record);

    int updateByPrimaryKey(TMytest record);

    /**获取所有用户信息
     * @return List<User>
     */
    List<TMytest> getAllUser();
}

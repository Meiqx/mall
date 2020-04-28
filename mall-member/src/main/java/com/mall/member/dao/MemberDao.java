package com.mall.member.dao;

import com.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author MeiQx
 * @email 1328973336@qq.com
 * @date 2020-04-28 22:31:34
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

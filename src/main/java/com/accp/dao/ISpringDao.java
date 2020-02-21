package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Air_quality_index;
import com.accp.pojo.District;

public interface ISpringDao {
	public List<District> queryDis();
	public List<Air_quality_index> queryAir(@Param("name") String name);
	
}

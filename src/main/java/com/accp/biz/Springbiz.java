package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.ISpringDao;
import com.accp.pojo.Air_quality_index;
import com.accp.pojo.District;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("Springbiz")
public class Springbiz {
	@Autowired
	private ISpringDao dao;
	
	public List<District> findDis(){
		return dao.queryDis();
	}
	
	public PageInfo<Air_quality_index> findAir(Integer pageNum, Integer pageSize,String name){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Air_quality_index>(dao.queryAir(name));
	}
}

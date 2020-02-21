package com.accp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.Springbiz;
import com.accp.pojo.Air_quality_index;
import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping("/api/bills")
public class Springaction {
	@Autowired
	private Springbiz biz;
	
	@GetMapping("/{pageNum}/{pageSize}/{name}")
	public PageInfo<Air_quality_index> selectZhuXiang(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable String name) {
		return biz.findAir(pageNum, pageSize, name);
	}
}

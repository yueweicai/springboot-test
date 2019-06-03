package com.orilore.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.orilore.model.Good;
import com.orilore.service.IGoodBiz;

@RestController
@RequestMapping("/good")
public class GoodCtrl {

	@Resource
	private IGoodBiz biz;
	@RequestMapping("/save")
	public boolean save(Good bean) {
		try {
			biz.save(bean);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
	@RequestMapping("/remove/{id}")
	public boolean remove(@PathVariable("id") int id) {
		try {
			biz.remove(id);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
	@RequestMapping("/uppic")
	public boolean upload(int id,String path) {
		try {
			this.biz.setPhoto(id, path);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	@RequestMapping("/get/{id}")
	public Good get(@PathVariable("id") int id) {
		return biz.get(id);
	}

	@RequestMapping("/list/{p}/{s}")
	public Map<String,Object> query(@PathVariable("p") int p,@PathVariable("s") int s) {
		PageHelper.startPage(p,s);
		List<Good> list = biz.find();
		Page page = (Page)list;
		long count = page.getTotal();
		Map<String,Object> map = new HashMap<>();
		map.put("list",list);
		map.put("count",count);
		return map;
	}
}

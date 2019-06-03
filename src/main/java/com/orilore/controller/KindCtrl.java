package com.orilore.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orilore.model.Kind;
import com.orilore.service.IKindBiz;

@RestController
@RequestMapping("/kind")
public class KindCtrl {
	@Resource
	private IKindBiz biz;
	@RequestMapping("/save")
	public boolean save(Kind bean) {
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
	
	@RequestMapping("/get/{id}")
	public Kind get(@PathVariable("id") int id) {
		return biz.get(id);
	}
	
	@RequestMapping("/list")
	public List<Kind> query() {
		return biz.find();
	}
}

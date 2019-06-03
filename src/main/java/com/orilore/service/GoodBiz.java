package com.orilore.service;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class GoodBiz implements IGoodBiz{
	@Resource
	private GoodMapper mapper;
	@Override
	public void save(Good bean) {
		if(bean.getId()!=null){
			mapper.update(bean);
		}else {
			mapper.insert(bean);
		}
	}
	@Override
	public void remove(int id) {
		mapper.delete(id);
	}
	@Override
	public Good get(int id) {
		return mapper.selectOne(id);
	}
	@Override
	public List<Good> find() {
		return mapper.select();
	}
	@Override
	public void setPhoto(int id, String path) {
		Good bean = new Good();
		bean.setId(id);
		bean.setPhoto(path);
		this.mapper.upload(bean);
	}
}

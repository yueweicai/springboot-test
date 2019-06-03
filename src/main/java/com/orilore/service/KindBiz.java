package com.orilore.service;
import com.orilore.model.*;
import com.orilore.mapper.*;
import java.util.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
@Service
public class KindBiz implements IKindBiz{
	@Resource
	private KindMapper mapper;
	
	@Override
	public void save(Kind bean) {
		if(bean.getId()!=null) {
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
	public Kind get(int id) {
		return mapper.selectOne(id);
	}
	@Override
	public List<Kind> find() {
		return mapper.select();
	}
}

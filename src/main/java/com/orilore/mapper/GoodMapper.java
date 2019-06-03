package com.orilore.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.orilore.model.*;
@Mapper
public interface GoodMapper{
	public void insert(Good bean);
	public Good selectOne(int id);
	public void delete(int id);
	public List<Good> select();
	public void update(Good bean);
	public void upload(Good bean);
}
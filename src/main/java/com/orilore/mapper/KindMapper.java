package com.orilore.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.orilore.model.*;

@Mapper
public interface KindMapper{
	public void insert(Kind bean);
	public Kind selectOne(int id);
	public void delete(int id);
	public List<Kind> select();
	public void update(Kind bean);
}
package com.orilore.service;
import com.orilore.model.*;
import java.util.List;
public interface IGoodBiz{
	public void save(Good good);
	public void remove(int id);
	public Good get(int id);
	public List<Good> find();
	public void setPhoto(int id,String path);
}
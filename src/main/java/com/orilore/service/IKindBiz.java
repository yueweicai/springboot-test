package com.orilore.service;
import com.orilore.model.*;
import java.util.List;
public interface IKindBiz{
	public void save(Kind kind);
	public void remove(int id);
	public Kind get(int id);
	public List<Kind> find();
}
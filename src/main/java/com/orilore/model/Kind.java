package com.orilore.model;

import java.util.List;

public class Kind{
	private List<Good> goods;
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}

		return this.id;
	}
	private String kname;
	public void setKname(String kname){
		this.kname=kname;
	}

		return this.kname;
	}

	public List<Good> getGoods() {
		return goods;
	}

	public void setGoods(List<Good> goods) {
		this.goods = goods;
	}
}
package com.orilore.model;
public class Good{
	private Kind kind;
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}

		return this.id;
	}
	private String gname;
	public void setGname(String gname){
		this.gname=gname;
	}

		return this.gname;
	}
	private Float price;
	public void setPrice(Float price){
		this.price=price;
	}

		return this.price;
	}
	private String size;
	public void setSize(String size){
		this.size=size;
	}

		return this.size;
	}
	private String facotry;
	public void setFacotry(String facotry){
		this.facotry=facotry;
	}

		return this.facotry;
	}
	private String photo;
	public void setPhoto(String photo){
		this.photo=photo;
	}

		return this.photo;
	}
	
	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}
}
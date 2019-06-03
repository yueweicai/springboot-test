package com.orilore.model;
public class Good{
	private Kind kind;
	private Integer id;
	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return this.id;
	}
	private String gname;
	public void setGname(String gname){
		this.gname=gname;
	}
	public String getGname(){
		return this.gname;
	}
	private Float price;
	public void setPrice(Float price){
		this.price=price;
	}
	public Float getPrice(){
		return this.price;
	}
	private String size;
	public void setSize(String size){
		this.size=size;
	}
	public String getSize(){
		return this.size;
	}
	private String facotry;
	public void setFacotry(String facotry){
		this.facotry=facotry;
	}
	public String getFacotry(){
		return this.facotry;
	}
	private String photo;
	public void setPhoto(String photo){
		this.photo=photo;
	}
	public String getPhoto(){
		return this.photo;
	}
	
	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}
}
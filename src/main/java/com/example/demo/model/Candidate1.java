package com.example.demo.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Candidate1 {

	@Id
	private int cid;
	private String cname;
	private String ctech;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
		
	}
	
	public String getCtech() {
		return ctech;
	}
	public void setCtech(String ctech) {
		this.ctech = ctech;
	}
	@Override
	public String toString() {
		return "Candidate1 [cid=" + cid + ", cname=" + cname + ", ctech=" + ctech + "]";
	}
	
	
}

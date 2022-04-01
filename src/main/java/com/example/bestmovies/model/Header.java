package com.example.bestmovies.model;

import java.util.ArrayList;
import java.util.List;

public class Header{
	private String status;
	private String copyright;
	private boolean has_more;
	private int num_results;
	private List<Results> results = new ArrayList<>();
	
	public Header(String status, String copyright, boolean has_more, int num_results, List<Results> results) {
		this.status = status;
		this.copyright = copyright;
		this.has_more = has_more;
		this.num_results = num_results;
		this.results = results;
	}

	public Header() {
		
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getCopyright() {
		return copyright;
	}


	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}


	public boolean isHas_more() {
		return has_more;
	}


	public void setHas_more(boolean has_more) {
		this.has_more = has_more;
	}


	public int getNum_results() {
		return num_results;
	}


	public void setNum_results(int num_results) {
		this.num_results = num_results;
	}


	public List<Results> getResult() {
		return results;
	}


	public void setResult(List<Results> results) {
		this.results = results;
	}


	@Override
	public String toString() {
		return "Header [status=" + status + ", copyright=" + copyright + ", has_more=" + has_more + ", num_results="
				+ num_results + ", results=" + results + "]";
	}


}

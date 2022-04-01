package com.example.bestmovies.model;


public class Link{
	
	private String type;
	private String url;
	private String suggested_link_text;
	private Results result;
	
	public Link(String type, String url, String suggested_link_text, Results result) {
		this.type = type;
		this.url = url;
		this.suggested_link_text = suggested_link_text;
		this.result = result;
	}	

	public Results getResult() {
		return result;
	}



	public void setResult(Results result) {
		this.result = result;
	}

	public Link() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSuggested_link_text() {
		return suggested_link_text;
	}

	public void setSuggested_link_text(String suggested_link_text) {
		this.suggested_link_text = suggested_link_text;
	}

	@Override
	public String toString() {
		return "Link [type=" + type + ", url=" + url + ", suggested_link_text=" + suggested_link_text + "]";
	}
	

}

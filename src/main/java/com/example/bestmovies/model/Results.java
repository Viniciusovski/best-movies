package com.example.bestmovies.model;

import java.util.Date;

public class Results {
	private String display_title;
    private String mpaa_rating;
    private int critics_pick;
    private String byline;
    private String headline;
    private String summary_short;
    private Date publication_date;
    private Date opening_date;
    private Date date_updated;
    private Link link;
    private Multimedia multimedia;
    
	public Results() {
		
	}
	
	public Results(String display_title, String mpaa_rating, int critics_pick, String byline, String headline,
			String summary_short, Date publication_date, Date opening_date, Date date_updated, Link link,
			Multimedia multimedia) {
		this.display_title = display_title;
		this.mpaa_rating = mpaa_rating;
		this.critics_pick = critics_pick;
		this.byline = byline;
		this.headline = headline;
		this.summary_short = summary_short;
		this.publication_date = publication_date;
		this.opening_date = opening_date;
		this.date_updated = date_updated;
		this.link = link;
		this.multimedia = multimedia;
	}

	public String getDisplay_title() {
		return display_title;
	}

	public void setDisplay_title(String display_title) {
		this.display_title = display_title;
	}

	public String getMpaa_rating() {
		return mpaa_rating;
	}

	public void setMpaa_rating(String mpaa_rating) {
		this.mpaa_rating = mpaa_rating;
	}

	public int getCritics_pick() {
		return critics_pick;
	}

	public void setCritics_pick(int critics_pick) {
		this.critics_pick = critics_pick;
	}

	public String getByline() {
		return byline;
	}

	public void setByline(String byline) {
		this.byline = byline;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getSummary_short() {
		return summary_short;
	}

	public void setSummary_short(String summary_short) {
		this.summary_short = summary_short;
	}

	public Date getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}

	public Date getOpening_date() {
		return opening_date;
	}

	public void setOpening_date(Date opening_date) {
		this.opening_date = opening_date;
	}

	public Date getDate_updated() {
		return date_updated;
	}

	public void setDate_updated(Date date_updated) {
		this.date_updated = date_updated;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public Multimedia getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(Multimedia multimedia) {
		this.multimedia = multimedia;
	}

	@Override
	public String toString() {
		return "Results [display_title=" + display_title + ", mpaa_rating=" + mpaa_rating + ", critics_pick="
				+ critics_pick + ", byline=" + byline + ", headline=" + headline + ", summary_short=" + summary_short
				+ ", publication_date=" + publication_date + ", opening_date=" + opening_date + ", date_updated="
				+ date_updated + ", link=" + link + ", multimedia=" + multimedia + "]";
	}
}

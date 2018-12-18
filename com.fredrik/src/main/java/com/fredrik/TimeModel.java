package com.fredrik;

import java.util.Calendar;

public class TimeModel {
	
	public TimeModel(){}
	
	public String getTimeFromUNIX(long timestamp) {
		Calendar precent = Calendar.getInstance();
		java.text.SimpleDateFormat dfh = new java.text.SimpleDateFormat("hh");
		java.text.SimpleDateFormat dfmm = new java.text.SimpleDateFormat("mm");
		java.text.SimpleDateFormat dfs = new java.text.SimpleDateFormat("ss");
		
		return ""+dfh.format(precent.getTime())+":"+dfmm.format(precent.getTime())+":"+dfs.format(precent.getTime());
	}
	public String getDateFromUNIX(long timestamp) {
		Calendar precent = Calendar.getInstance();
		java.text.SimpleDateFormat dfd = new java.text.SimpleDateFormat("dd");
		java.text.SimpleDateFormat dfm = new java.text.SimpleDateFormat("MMM");
		java.text.SimpleDateFormat dfy = new java.text.SimpleDateFormat("yyyy");
		return ""+dfy.format(precent.getTime())+" "+dfm.format(precent.getTime())+" "+dfd.format(precent.getTime())+" ";
	}

	public static void main(String[] args) {
		long timestamp = System.currentTimeMillis();
		TimeModel tm = new TimeModel();
		System.out.println(tm.getDateFromUNIX(timestamp)+" "+tm.getTimeFromUNIX(timestamp));

	}

}

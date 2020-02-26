package com.model;

import java.util.ArrayList;

public class Pitch {
private String description;
private String pitcherName;
private String Guidelines;
private ArrayList<Userdata> taskForce;

public ArrayList<Userdata> getTaskForce() {
	return taskForce;
}
public void setTaskForce(ArrayList<Userdata> taskForce) {
	this.taskForce = taskForce;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPitcherName() {
	return pitcherName;
}
public void setPitcherName(String pitcherName) {
	this.pitcherName = pitcherName;
}
public String getGuidelines() {
	return Guidelines;
}
public void setGuidelines(String guidelines) {
	Guidelines = guidelines;
}
}

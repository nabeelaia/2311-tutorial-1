package practice;

import java.util.ArrayList;

public class tasks {
 public String name;
private ArrayList<String> listoftasks;
public tasks(String name, ArrayList<String> listoftasks) {
	super();
	this.name = name;
	this.listoftasks = listoftasks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ArrayList<String> getListoftasks() {
	return listoftasks;
}
public void setListoftasks(ArrayList<String> listoftasks) {
	this.listoftasks = listoftasks;
}
@Override
public String toString() {
	return "tasks [name=" + name + ", listoftasks=" + listoftasks + "]";
}




}

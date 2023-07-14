package com.springcores;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class TestStudent 
{
  @Value("Altaf Malik Mumbai")
  private String StudentName;
  
  @Value("Mumbai city is a good city")
  private String city;
  
  @Value("#{temp}")
  private List<String> address;
  
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
@Override
public String toString() {
	return "TestStudent [StudentName=" + StudentName + ", city=" + city + ", address=" + address + "]";
}
  

}

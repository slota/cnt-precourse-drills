package com.galvanize;
import java.util.List;
import java.util.ArrayList;

public class Business implements Addressable {
  String name;
  List<Address> list = new ArrayList<Address>();


  public Business(String newName){
    name = newName;
  }

  public String getName(){
    return name;
  }

  public void addAddress(Address address){
    list.add(address);
  }

  public List<Address> getAddresses(){
    return list;
  }
}

package com.galvanize;
import java.util.List;
import java.util.ArrayList;


public interface Addressable{
  List<Address> list = new ArrayList<Address>();

  static public void addAddress(Address address){
    list.add(address);
  }

  static public List<Address>  getAddresses(){
    List<Address> list = new ArrayList<Address>();
    return list;
  }

}

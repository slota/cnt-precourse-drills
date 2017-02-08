package com.galvanize;
import java.util.List;
import java.util.ArrayList;


public interface Addressable{
  static public List<Address>  getAddresses(){
    List<Address> list = new ArrayList<Address>();
    return list;
  }

  static public void addAddress(Address address){
    List<Address> list = new ArrayList<Address>();
  }
}

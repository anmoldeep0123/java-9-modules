package com.adee.homework;

import com.adee.api.Work;

public class HomeWork implements Work {

  public boolean doWork(String type) {
    System.out.println("Doing work : " + this.getClass().getSimpleName() + " : " + type);
    return false;
  }
}



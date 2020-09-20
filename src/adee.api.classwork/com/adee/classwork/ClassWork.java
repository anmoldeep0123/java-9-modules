package com.adee.classwork;

import com.adee.api.Work;

public class ClassWork implements Work {

  public boolean doWork(String type) {
    System.out.println("Doing work : " + this.getClass().getSimpleName() + " : " + type);
    return true;
  }
}


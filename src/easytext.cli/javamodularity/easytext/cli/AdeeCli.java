package javamodularity.easytext.cli;

import javamodularity.easytext.analysis.AdeeAnalysis;
import java.util.ServiceLoader;
import com.adee.api.Work;

public class AdeeCli {

  public static void main(String[] args) {
    System.out.println("Hello World  - CLI");
    System.out.println("AdeeAnalysis = " + new AdeeAnalysis());

    ServiceLoader.load(Work.class).forEach(
      service -> {
         System.out.println("Service = " + service.doWork(AdeeCli.class.getSimpleName()));
      }
    );
  }
}


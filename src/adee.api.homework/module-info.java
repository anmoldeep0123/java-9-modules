module adee.api.homework {

   requires adee.api;

   provides com.adee.api.Work
       with com.adee.homework.HomeWork;
}

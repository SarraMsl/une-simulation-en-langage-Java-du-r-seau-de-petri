package com.example.demo4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import static com.example.demo4.HelloApplication.Main.*;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    static class placeSalseAttents{
        int p1=0;

    }

    static class placeMédecin{

      int p2=1;

    }
    static class placeSalesExamen {
        int p3=0;

    }

    public  class  Main{
        public static int transission01(){

            ThreadLocalRandom   random= ThreadLocalRandom.current();
            int rand =random.nextInt(0,30);

            System.out.println("mald out sales  "+rand);
            placeSalseAttents p=new placeSalseAttents();
          int p01=p.p1+rand;
            System.out.println("mald in  sales   "+p01);
            rand=0;
            System.out.println("mald out sales   "+rand);
            return p01;
        }
        public static int[] transission02(int p01) {
            placeMédecin p002 = new placeMédecin();
            int p02 = p002.p2;
            System.out.println("medecien  "+p02);
            int p03 = 0;
            if (p01 > 0 && p02 == 1) {
                p01 = p01 - 1;
                p02 = p002.p2 - 1;
                placeSalesExamen p003 = new placeSalesExamen();
                p03 = p003.p3 + 1;
                System.out.println("medecien  "+p02);
                System.out.println("mald  sales   "+p01);
                System.out.println("salse exemen  "+p03);



            } else {
                int t001 = transission01();

            }
            return new int[]{p02,p03};
        }
        public static void transission03(int p02,int p03){


            p02=p02+1;
            System.out.println("medecien  "+p02);
            p03=p03-1;
            System.out.println("salse exemen  "+p03);
        }


        }

  public static void main(String[] args) {

      int t01 = transission01();

      int[] ints = transission02(t01);


      transission03(ints[0],ints[1]);
    }
}
package hgs.main;
import hgs.angel.Monkey;

/** 程序启动类 */
public class AppMain{  

  public static void main(String[] args) {
    Monkey m=new Monkey("智多星");  //创建代表智多星的Monkey
    m.speak();  //智多星说话
  }

}
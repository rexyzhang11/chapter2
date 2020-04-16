package hgs.angel;

/** ������ɽ���� */
public class Monkey{  

  /** ��ʾ���ӵ����� */
  String name; 
  
  /** ���������Ĺ��췽�� */
  public Monkey(){}

  /** �������Ĺ��췽�� */
  public Monkey(String name){  
    this.name=name;  //����Monkey�����name����
  }

  /** ģ����ӵ�˵����Ϊ */
  public void speak(){  
    /*
     ���Ӹ���Ҵ��к�
     ˵������Һã�����XXX��
    */
    System.out.println("大家好，我是"+name);
  }

}
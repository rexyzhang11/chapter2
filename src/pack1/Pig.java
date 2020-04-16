package pack1;
import pack2.*;
public class Pig {
    String name;

    public Pig(){};
    public Pig(String name){
        this.name = name;
    }

    public void eat(Food food){
        System.out.println("thank God!");
        System.out.println(food.name + "真好吃！");
    }

    public static void main(String[] args){
        Pig pig = new Pig("pack1");
        Food food = new Food("watermelon");
        pig.eat(food);

    }

}

package ocp.demo3;

/**
 * @author Yanjie Zhou
 * @create 2022/1/27 5:16 下午
 */
public class Test3 {
    public static void main(String[] args) {
        FruitShop shop =  new FruitShop();
        shop.sellFruit(new Apple());
        shop.sellFruit(new Banana());
        shop.sellFruit(new Watermelon());
    }
}

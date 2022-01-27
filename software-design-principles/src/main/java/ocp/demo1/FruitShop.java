package ocp.demo1;

/**
 * 水果店
 * @author Yanjie Zhou
 * @create 2022/1/27 5:09 下午
 */
public class FruitShop {

    public void sellFruit(Fruit fruit) {
        if (fruit.type == 1) {
            sellApple(fruit);
        } else if (fruit.type == 2) {
            sellBanana(fruit);
        }
    }

    private void sellApple(Fruit fruit) {
        System.out.println("卖出了一斤苹果！");
    }


    private void sellBanana(Fruit fruit) {
        System.out.println("卖出了一斤香蕉！");
    }

}

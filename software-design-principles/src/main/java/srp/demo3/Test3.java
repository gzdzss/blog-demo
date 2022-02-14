package srp.demo3;

/**
 * @author Yanjie Zhou
 * @create 2022/2/14 5:12 下午
 */
public class Test3 {
    public static void main(String[] args) {
        Birds birds = new Birds();
        birds.mainMoveMode("小鸟");
        birds.mainMoveMode("小蜜蜂");

        Beasts beasts = new Beasts();
        beasts.mainMoveMode("小狗");
        beasts.mainMoveMode("小猫");
    }
}

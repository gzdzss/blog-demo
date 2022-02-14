package srp.demo2;

/**
 * 动物
 * @author Yanjie Zhou
 * @create 2022/2/14 4:48 下午
 */
public class Animal {
    public void mainMoveMode(String animalName) {
        if ("小狗".equals(animalName)) {
            System.out.println(animalName + "用脚走路");
        } else {
            System.out.println(animalName + "用翅膀飞");
        }
    }
}

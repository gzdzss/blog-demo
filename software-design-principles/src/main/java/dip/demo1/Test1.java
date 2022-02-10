package dip.demo1;

/**
 * @author Yanjie Zhou
 * @create 2022/2/10 5:46 下午
 */
public class Test1 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.driveBMWCar(new BMWCar());
        driver.driveBenzCar(new BenzCar());
    }
}

package dip.demo2;

/**
 * @author Yanjie Zhou
 * @create 2022/2/10 5:52 下午
 */
public class Test2 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.driveCar(new BenzCar());
        driver.driveCar(new BenzCar());
        driver.driveCar(new TslaCar());
    }
}

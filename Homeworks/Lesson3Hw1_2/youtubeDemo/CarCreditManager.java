package youtubeDemo;

public class CarCreditManager extends BaseCreditManager implements ICreditManager {

    @Override
    public void calculate() {
        System.out.println("Araba kredisi hesaplandı");

    }

}

package test;

public class AppleEater implements EatApple {
    @Override
    public void eatAppleRaw() {
        System.out.println("生吃苹果");
    }

    @Override
    public void eatAppleCooked() {
        System.out.println("蒸熟了吃苹果");
    }
}

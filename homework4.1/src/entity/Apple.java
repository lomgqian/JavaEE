package entity;

public class Apple {
    private float applePrice;
    private String appleName;

    public float getApplePrice() {
        return applePrice;
    }

    public void setApplePrice(float applePrice) {
        this.applePrice = applePrice;
    }

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    @Override
    public String toString() {
        return "Apple [applePrice=" + applePrice + ", appleName=" + appleName + "]";
    }
}

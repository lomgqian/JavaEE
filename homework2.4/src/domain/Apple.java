package domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
public class Apple {
    private float price;
    private float weight;
    private String colour;
    public Apple(float price, float weight, String colour) {
        this.price = price;
        this.weight = weight;
        this.colour = colour;
    }
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getcolour() {
		return colour;
	}
	public void setcolour(String colour) {
		this.colour = colour;
	} 
}


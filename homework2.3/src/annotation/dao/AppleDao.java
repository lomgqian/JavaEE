package annotation.dao;
import java.util.List;

import annotation.domain.Apple;

public interface AppleDao {
	public Apple generateApple();
	public List<Apple> getApples();

}

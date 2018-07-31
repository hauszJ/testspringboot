package entity;

/**
 * @author Jac
 * @date 2018-07-31 16:15
 */
public class Product {
    private String name;
    private String type;
    private Food food;

    public Product(String name, String type, Food food) {
        this.name = name;
        this.type = type;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }
}

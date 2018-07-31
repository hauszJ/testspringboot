package entity;

/**
 * @author Jac
 * @date 2018-07-31 16:02
 */
public class Food {
    private String id;
    private String name;
    private String description;
    private String icon;
    private double price;

    public Food(String id, String name, String description, String icon, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

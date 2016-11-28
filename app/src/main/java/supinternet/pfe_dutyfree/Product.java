package supinternet.pfe_dutyfree;

/**
 * Created by user on 28/11/2016.
 */

public class Product {
    private int color;
    private String title;
    private String description;

    public Product(int color, String title, String description) {
        this.color = color;
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getColor() {
        return this.color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}

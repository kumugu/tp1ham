package model;
 

 public class Menu {
    private int menuId;
    private String name;
    private double price;
    private String category;
    private int stock;

    public Menu(int menuId, String name, double price, String category, int stock) {
        this.menuId = menuId;
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public int getMenuId() { return menuId; }
    public void setMenuId(int menuId) { this.menuId = menuId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
 } 
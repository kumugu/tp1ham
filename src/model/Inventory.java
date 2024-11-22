 package model;
 
 import java.util.Date;

 public class Inventory {
    private int materialId;
    private String name;
    private int quantity;
    private Date expirationDate;

    public Inventory(int materialId, String name, int quantity, Date expirationDate) {
        this.materialId = materialId;
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public int getMaterialId() { return materialId; }
    public void setMaterialId(int materialId) { this.materialId = materialId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public Date getExpirationDate() { return expirationDate; }
    public void setExpirationDate(Date expirationDate) { this.expirationDate = expirationDate; }
 }

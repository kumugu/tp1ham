 package db;
 
 import java.sql.*;
 import java.util.ArrayList;
 import java.util.List;

import model.Menu;
 
 public class MenuRepository {
    public void addMenu(Menu menu) {
        String sql = "INSERT INTO Menu (menu_id, name, price, category, stock) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, menu.getMenuId());
            pstmt.setString(2, menu.getName());
            pstmt.setDouble(3, menu.getPrice());
            pstmt.setString(4, menu.getCategory());
            pstmt.setInt(5, menu.getStock());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Menu> getAllMenus() {
        List<Menu> menus = new ArrayList<>();
        String sql = "SELECT * FROM Menu";

        try (Connection conn = DatabaseConnector.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                menus.add(new Menu(
                    rs.getInt("menu_id"),
                    rs.getString("name"),
                    rs.getDouble("price"),
                    rs.getString("category"),
                    rs.getInt("stock")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return menus;
    }
 }

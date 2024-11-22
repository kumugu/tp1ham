package dao;
import model.Menu;
import util.DBConnector;

public void addMenu(Menu menu) throws SQLException {
    String sql = "INSERT INTO Menu (menu_id, name, price, event_discount, material_cost) VALUES (?, ?, ?, ?, ?)";
    try (Connection conn = DBConnector.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.setInt(1, menu.getMenuId());
        pstmt.setString(2, menu.getName());
        pstmt.setDouble(3, menu.getPrice());
        pstmt.setDouble(4, menu.getEventDiscount());
        pstmt.setDouble(5, menu.getMaterialCost());
        pstmt.executeUpdate();
    }
}
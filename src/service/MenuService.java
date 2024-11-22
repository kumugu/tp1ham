package service;

 
 import db.MenuRepository;
import model.Menu;

import java.util.List;
 
 public class MenuService {
    private final MenuRepository repository = new MenuRepository();

    public void addMenu(Menu menu) {
        repository.addMenu(menu);
    }

    public List<Menu> getAllMenus() {
        return repository.getAllMenus();
    }
 }
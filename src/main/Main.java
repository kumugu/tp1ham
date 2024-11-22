import java.util.Scanner;

import model.Menu;
import service.MenuService;

public static void main(String[] args) {
    MenuService menuService = new MenuService();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("1. 메뉴 추가");
        System.out.println("2. 메뉴 조회");
        System.out.println("3. 메뉴 삭제");
        System.out.println("4. 종료");
        System.out.print("선택: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("메뉴 이름: ");
                String name = scanner.next();
                System.out.print("가격: ");
                double price = scanner.nextDouble();
                System.out.print("할인: ");
                double discount = scanner.nextDouble();
                System.out.print("재료비: ");
                double materialCost = scanner.nextDouble();

                Menu menu = new Menu(0, name, price, discount, materialCost);
                menuService.addMenu(menu);
                break;
            case 2:
                menuService.getAllMenus().forEach(System.out::println);
                break;
            case 3:
                System.out.print("삭제할 메뉴 ID: ");
                int menuId = scanner.nextInt();
                menuService.deleteMenu(menuId);
                break;
            case 4:
                System.out.println("프로그램 종료");
                return;
        }
    }
}
package homework;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MenuService {
 
		private Scanner sc = new Scanner(System.in);
		
		private List<Menu> menuList = new LinkedList<Menu>(); 
		
		public MenuService() {
			menuList.add(new Menu("기본김밥","김밥",3000));
			menuList.add(new Menu("참치김밥","김밥",4000));
			menuList.add(new Menu("우엉김밥","김밥",4000));
			menuList.add(new Menu("돈까스김밥","김밥",5000));
			menuList.add(new Menu("기본라면","라면",4000));
			menuList.add(new Menu("하얀라면","라면",5000));
			menuList.add(new Menu("돈까스","돈까스",8000));
			menuList.add(new Menu("등심돈까스","돈까스",9000));
			menuList.add(new Menu("볶음밥","볶음밥",7000));
			menuList.add(new Menu("새우볶음밥","볶음밥",8000));
		
			
			
		}
  
  
		public void menuplay() {
			
	
			 
			try {
				
				int menuNum = 0;
				
		        do {
					System.out.println("--메뉴---");
					System.out.println("1.메뉴 조회");
					System.out.println("2.메뉴 추가");
					System.out.println("3.메뉴 삭제");
					System.out.println("0.종료");
					System.out.print("번호 입력 : ");
					menuNum = sc.nextInt();
					
					switch(menuNum){
					
					case 1 : menuSelect(); break;
					case 2 : menuAdd(); break;
					case 3 : System.out.println( menuDelte()); break;
					case 0 : System.out.println("종료되었습니다.");break;
					default : System.out.println("잘못입력했습니다.");
				
					}
					
			
					
			
					
					
			}while(menuNum!=0);
				
			
			
			
			
			}catch(Exception e) {
				System.out.println("잘못입력했습니다.");
				
				sc.next();
				

			}	
		}
  
		
		public void menuSelect() {
			
		
			for (Menu temp : menuList) {
				System.out.println(temp);
			}
		
			
			
		}
		
		public  void menuAdd() {
	    System.out.println("음식 이름 : ");
		sc.nextLine();
	    String input1 = sc.nextLine();
	    System.out.println("음식 종류 : ");
	    String input2 = sc.nextLine();
	    System.out.println("가격 : ");
	    int input3 = sc.nextInt();
	    
	    Menu menuNew = new Menu(input1,input2,input3);
	    
	    menuList.add(menuNew);
	    
	    
		System.out.println("완료");
			
			
		}
		
		
		public String menuDelte() {
			System.out.println("음식 이름 입력 :");
			String  delteName = sc.nextLine();
			
			for(Menu temp : menuList) {
				if(temp.getFoodname() ==  delteName) {
					menuList.remove(0);
				}
				else {
					System.out.println("잘못입력했습니다.");	
				}
				
			}
			
			return "삭제되었습니다.";
			
			
		}
		
		
		
}

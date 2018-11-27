
import java.util.*;
import java.io.*;

public class menu2{
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		HashMap<Integer,Todolist> h = new HashMap<Integer, Todolist>(); 
		Scanner scanner = new Scanner(System.in);
		//to do list 생성,수정,삭제 => 쓴 날짜,due date,내용
			int memNO =1;
			int num =0 ;
		while(true) {
			System.out.println("1. to do list 생성");
			System.out.println("2. to do list 보기 ");
			System.out.println("3. to do list 삭제");
			System.out.println("4. to do list 수정");
			System.out.println("5. 종료");
			System.out.print("메뉴 번호>>");
			
			int choice = scanner.nextInt();
			}
	}
}
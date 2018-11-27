package sowegong;

import java.util.*;
import java.io.*;


class Todolist implements Serializable{
	int num;
	String w_date;
	String d_date;
	String detail;

	public String getw_date() {
		return w_date;
	}
	public void setw_date(String w_date) {
		this.w_date = w_date;
	}	
	public String getd_date() {
		return d_date;
	}
	public void setd_date(String d_date) {
		this.d_date = d_date;
	}
	public String getdetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Todolist(String w_date,String d_date,String detail) {
		this.w_date=w_date;
		this.d_date=d_date;
		this.detail =detail;
	}
}

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
			
			if(choice==1) {
				System.out.print("작성 날짜:");
				String w_date = scanner.nextLine();
				w_date = scanner.nextLine();
				System.out.print("마감 날짜:");
				String d_date = scanner.nextLine();
				System.out.print("내용:");
				String detail = scanner.nextLine();
				h.put(memNO,new Todolist(w_date,d_date,detail)); 
				memNO++;
			}
			else if (choice==2) {
				 Set<Integer> keys = h.keySet();
				 Iterator<Integer> it = keys.iterator(); 
				while(it.hasNext()) {
					Integer no = it.next();
					 Todolist todo = h.get(no);
					 System.out.println("["+no+"]"+" [작성날짜:"+todo.getw_date()+", 마감날짜:"+todo.getd_date()+", 내용:"+todo.getdetail()+"]");
					 	}
				System.out.print("*******************************\n");
			}
			else if (choice==3) {
				
				Set<Integer> keys = h.keySet();
				 Iterator<Integer> it = keys.iterator(); 
				while(it.hasNext()) {
					Integer no = it.next();
					 Todolist todo = h.get(no);
					 System.out.println("["+no+"]"+" [작성날짜:"+todo.getw_date()+", 마감날짜:"+todo.getd_date()+", 내용:"+todo.getdetail()+"]");
			}
				System.out.print("*******************************\n");
				System.out.print("삭제하실 no를 고르시오:");
				int a= scanner.nextInt();
				Todolist m = h.get(a);
				   if(m!=null)
				    h.remove(a);
			}
			else if (choice==4) {
				Set<Integer> keys = h.keySet();
				 Iterator<Integer> it = keys.iterator(); 
				while(it.hasNext()) {
					Integer no = it.next();
					 Todolist todo = h.get(no);
					 System.out.println("["+no+"]"+" [작성날짜:"+todo.getw_date()+", 마감날짜:"+todo.getd_date()+", 내용:"+todo.getdetail()+"]");
			}
				System.out.print("*******************************\n");
				System.out.print("수정하실  member no를 고르시오:");
				int a= scanner.nextInt();
				
				System.out.print("1.마감날짜\n");
				System.out.print("2.내용\n");
				
				System.out.print("수정하실 항목 no:");
				int b= scanner.nextInt();
		
				Todolist m = h.get(a);
				
				   if(m!=null) {
					   if(b==1) {
						   System.out.print("마감 날짜:");
							String d_date = scanner.nextLine();
							d_date = scanner.nextLine();
							h.put(a,new Todolist(m.getw_date(),d_date,m.getdetail())); 
					   }
					   if (b==2) {
						   System.out.print("내용:");
							String detail = scanner.nextLine();
							detail = scanner.nextLine();
							h.put(a,new Todolist(m.getw_date(),m.getd_date(),detail)); 
					   }
				   }
				   System.out.print("*******************************\n");
			}
			else if (choice==5) {break;}
			else continue;
		}
	}
}
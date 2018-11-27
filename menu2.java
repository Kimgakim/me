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
		//to do list ����,����,���� => �� ��¥,due date,����
			int memNO =1;
			int num =0 ;
		while(true) {
			System.out.println("1. to do list ����");
			System.out.println("2. to do list ���� ");
			System.out.println("3. to do list ����");
			System.out.println("4. to do list ����");
			System.out.println("5. ����");
			System.out.print("�޴� ��ȣ>>");
			
			int choice = scanner.nextInt();
			
			if(choice==1) {
				System.out.print("�ۼ� ��¥:");
				String w_date = scanner.nextLine();
				w_date = scanner.nextLine();
				System.out.print("���� ��¥:");
				String d_date = scanner.nextLine();
				System.out.print("����:");
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
					 System.out.println("["+no+"]"+" [�ۼ���¥:"+todo.getw_date()+", ������¥:"+todo.getd_date()+", ����:"+todo.getdetail()+"]");
					 	}
				System.out.print("*******************************\n");
			}
			else if (choice==3) {
				
				Set<Integer> keys = h.keySet();
				 Iterator<Integer> it = keys.iterator(); 
				while(it.hasNext()) {
					Integer no = it.next();
					 Todolist todo = h.get(no);
					 System.out.println("["+no+"]"+" [�ۼ���¥:"+todo.getw_date()+", ������¥:"+todo.getd_date()+", ����:"+todo.getdetail()+"]");
			}
				System.out.print("*******************************\n");
				System.out.print("�����Ͻ� no�� ���ÿ�:");
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
					 System.out.println("["+no+"]"+" [�ۼ���¥:"+todo.getw_date()+", ������¥:"+todo.getd_date()+", ����:"+todo.getdetail()+"]");
			}
				System.out.print("*******************************\n");
				System.out.print("�����Ͻ�  member no�� ���ÿ�:");
				int a= scanner.nextInt();
				
				System.out.print("1.������¥\n");
				System.out.print("2.����\n");
				
				System.out.print("�����Ͻ� �׸� no:");
				int b= scanner.nextInt();
		
				Todolist m = h.get(a);
				
				   if(m!=null) {
					   if(b==1) {
						   System.out.print("���� ��¥:");
							String d_date = scanner.nextLine();
							d_date = scanner.nextLine();
							h.put(a,new Todolist(m.getw_date(),d_date,m.getdetail())); 
					   }
					   if (b==2) {
						   System.out.print("����:");
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
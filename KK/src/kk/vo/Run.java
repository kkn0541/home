package kk.vo;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Run {






			public static void main(String[] args) {
				// TODO Auto-generated method stub

				
				
				private List<Member> member = new ArrayList<Member>();

				Scanner sc = new Scanner(System.in);

				public Service() {

					member.add(new Member("김길동", "1234", "19692222"));
					member.add(new Member("이이이", "4567", "19692222"));
					member.add(new Member("박박박", "9999", "19692222"));
					member.add(new Member("admin", "0000", "19692222"));

					
					for(Member mem : member) {
						System.out.println(mem);
					}
					
				}

				public void join() {
				
				
				Scanner sc = new Scanner(System.in);
				
				Friend friend = new Friend();
				
				List<Friend> name = new ArrayList<Friend>();
				
			name.add(new Friend("짱구", 10));
			name.add(new Friend("철수",11));
			name.add(new Friend("유리",12));
			name.add(new Friend("훈이" ,12));
			name.add(new Friend("admin",20));
			
			
	System.out.println(name.get(0).getAge()==10);
			
			boolean flag = true;
				while (flag) {
					System.out.println("\n======로그인-======");

					System.out.println("아이디 입력 : ");
					String id = sc.next();

					System.out.println("나이 입력");
					String age = sc.next();
					
					
					
					
					for(Friend ff :name) {
						System.out.println(ff);
					
					
				

						if (!(ff.getName().equals(id) || ff.getAge()==age)) {

							System.out.println("일치하는 회원없음");
							System.out.println(mb);
							break;

						}else if(mb.getId().equals(id) && mb.getPw().equals(pw) && mb.getId().equals("admin")) {

							
							System.out.println( "관리자 님 환영합니다.");
							flag = false;
							break;

						} else if (mb.getId().equals(id) && mb.getPw().equals(pw)) {

							System.out.println(id + "님 환영합니다.");
							flag = false;
							break;

						}

					}

			
			
			}
			
			
			
			
			//대입할 변수 타입과 받을 변수의 타입 일치해야함 friend 타입으로 
		
			
			
			
			
			
			
			
//			Random random = new Random();
//			Set<Integer> num= new HashSet<Integer>();
//			num.add(random.nextInt(name.size())+1);
		//	
//			name.add(friend);
//			System.out.println(name);
			
			
			
		//	
//			num.add(random.nextInt(name.size())); //
//			System.out.println(nu);
//			//Friend randomElement = name.get(randomIndex);
//			System.out.println( randomElement);
		//	
		//	
			
			
			
			
			
			}


}

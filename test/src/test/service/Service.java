package test.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import test.vo.Member;

public class Service {

	private List<Member> member = new ArrayList<Member>();

	private Scanner sc = new Scanner(System.in);

	public Service() {

		member.add(new Member("김길동", "1234", "19692222"));
		member.add(new Member("이이이", "4567", "19692222"));
		member.add(new Member("박박박", "9999", "19692222"));
		member.add(new Member("admin", "0000", "19692222"));

		for (Member mem : member) {
			System.out.println(mem.getId().equals("admin"));
		}

	}

//	public void join() {
//		boolean flag = true;
//
//		while (flag) {
//
//			System.out.print("아이디:");
//			String id = sc.next();
//
//			
//			
//			System.out.print("비밀번호:");
//			String pw = sc.next();
//
//			System.out.print("비밀번호 확인:");
//			String pw2 = sc.next();
//
//			System.out.print("생년월일:");
//			String birth = sc.next();
//
//			if (pw.equals(pw2)) {
//				System.out.println("성공");
//				member.add(new Member(id, pw, birth));
//
//				for (Member mb : member) {
//					System.out.println(mb);
//				}
//
//				flag = false;
//				break;
//			} else {
//				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
//
//			}
//
//		}
//
//	}

	// 조회
	public void login() {
		// System.out.println(member);
		System.out.println("입력");
		String input = sc.next();
		for (Member mem : member) {

			// System.out.println(input.equals(mem.getId()));
			System.out.println(mem.getId().equals(input));

//				  System.out.println(member);
//			        System.out.println("입력할 아이디를 입력하세요:");
//			        String input = sc.next(); // 사용자 입력 받기
//			        System.out.print("입력한 아이디: " + input);
//			        System.out.print("비교 결과: " + mem.getId().equals(input)); // 아이디 비교
		}
	}

	public void login2() {

//		System.out.println("입력할 아이디를 입력하세요:");
//		String input = sc.next();
//		System.out.println(input);
//		System.out.println(input.contains("\n"));

		
			System.out.println("로그인");
			System.out.println("아이디입력");
			String id = sc.next();
			
			System.out.println("비밀번호 입력");
			String pw = sc.next();
			for (Member mem : member) {

				if (mem.getId().equals(id)) {
					if(id.equals("admin")) {
					System.out.println("관리자님 환영합니다."+id);
					}
					break;
				}
			}
			System.out.println("그만");
		}
	}


//				if (!(mb.getId().equals(id) || mb.getPw().equals(pw))) {
//
//					System.out.println("일치하는 회원없음");
//					break;
//
//				}else if(mb.getId().equals(id) && mb.getPw().equals(pw) ) {
//					if(mb.getId().equals("admin")){
//					
//					System.out.println( "관리자 님 환영합니다.");
//				}
//					break;
//
//				} else if (mb.getId().equals(id) && mb.getPw().equals(pw)) {
//
//					System.out.println(id + "님 환영합니다.");
//					flag = false;
//					break;
//
//				}

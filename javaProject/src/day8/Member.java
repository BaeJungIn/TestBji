package day8;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	//오버라이드된 equals - MemberEx에서 사용
	public boolean equals(Object obj) {
			if(obj instanceof Member) {
				Member member = (Member)obj;
				if(id.equals(member.id)) {
					return true;
				}
			}
			return false;
		}
	}


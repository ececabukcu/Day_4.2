package gameSimulation;

public class MemberManager implements IMemberService {

	@Override
	public void add(Member member) {
		
		System.out.println("oyuncu " + member.getFirstName() +" "+ member.getLastName() + " oyuna kaydedildi");
		
		
	}

	@Override
	public void update(Member member) {
		
		System.out.println("oyuncu " + member.getFirstName() +" "+ member.getLastName() + " bilgileri güncellendi");
		
	}

	@Override
	public void delete(Member member) {
		
		System.out.println("oyuncu " + member.getFirstName() +" " + member.getLastName() + " oyundan silindi");
	}
	

}

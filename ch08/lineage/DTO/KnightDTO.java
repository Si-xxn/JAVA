package ch08.lineage.DTO;

public class KnightDTO extends HumanDTO{

	private String sword; // 칼
	
	private String armor ;
	
	
	private String shield;
	public String getSword() {
		return sword;
	}
	public String getArmor() {
		return armor;
	}
	public String getShield() {
		return shield;
	}
	public void setSword(String sword) {
		this.sword = sword;
	}
	public void setArmor(String armor) {
		this.armor = armor;
	}
	public void setShield(String shield) {
		this.shield = shield;
	}
	
	
}

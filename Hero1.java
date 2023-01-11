package RPG;


public class Hero1 {
	private String heroname;
	private int heroAttac;
	private int heroHp;
	
	
	public Hero1(String heroname,int heroAttac,int heroHp) {
		this.heroname = heroname;
		this.heroAttac = heroAttac;
		this.heroHp = heroHp;
	}
	
	
//	ダメージ計算用データを返す
	
	public int getAttackValue() {
		return heroAttac;
	}
	
//	ヒーローの体力を下げる動作
	public void downHp() {
		setHeroHp(getHeroHp() - heroAttac);
	}
//	heroゲッター
	public String getheroname() {
		return heroname;
	}
	public int getheroattac() {
		return heroAttac;
	}
	public int getHeroHp() {
		return heroHp;
	}
	
//	heroセッター
	public void setheroname(String heroname) {
		this.heroname = heroname;
	}
	public void setHp(int herohp) {
		this.setHeroHp(herohp);
	}
	public void setHeroHp(int heroHp) {
		this.heroHp = heroHp;
	}
	public void setheroAttac(int heroAttac) {
		this.heroAttac = heroAttac;
	}
	
//	ヒーロー必殺技
	public int getSpecialAttackValue() {
		return 100;
	}
	

}

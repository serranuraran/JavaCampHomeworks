package overriding;

public class Main {

	public static void main(String[] args) {
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] { new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager() };
		for (BaseKrediManager krediManager : krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}



		FinalKeyword[] finalKeywords = new FinalKeyword[] { new FinalKeywordKrediManager() };
		for (FinalKeyword finalKeyword : finalKeywords) {
			System.out.println("Final Key Örneði :" + finalKeyword.hesapla(999));
		}

	}
}
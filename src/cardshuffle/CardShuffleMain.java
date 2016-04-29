package cardshuffle;


public class CardShuffleMain {
	/**
	 * [결과]
	 * 기본 카드 배열:[1, 2, 3, 4, 5, 6, 7, 8, 9]
	 * 섞은 후 카드배열(랜덤):[1, 8, 7, 3, 5, 2, 9, 6, 4]
	 */
	public static void main(String[] args) {
		CardShuffle card = new CardShuffle();
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("기본 카드 배열:" + java.util.Arrays.toString(original));
		int[] result = card.shuffle(original);
		System.out.println("섞은 후 카드배열:" + java.util.Arrays.toString(result));

	}
}

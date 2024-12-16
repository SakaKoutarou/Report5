public class Main {
    public static void main(String[] args) {
        String str = null; // 条件1: nullを代入

        try {
            // NullPointerExceptionを発生させる
            System.out.println(str.length());
        } catch (NullPointerException e) { // 条件2: NullPointerExceptionをキャッチ
            // NullPointerExceptionが発生したことを表示
            System.out.println("NullPointerExceptionが発生しました。");
            // 条件3: getMessage()の内容を出力
            System.out.println("例外メッセージ: " + e.getMessage());
        }
    }
}

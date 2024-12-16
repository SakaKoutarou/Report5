public class Main {
    public static void main(String[] args) {
        String str = "壱百満"; // 条件1: 文字列を代入

        try {
            int value = Integer.parseInt(str); // 条件2: parseInt()を使用
            System.out.println("変換結果: " + value);
        } catch (NumberFormatException e) {
            // 例外が発生した場合のメッセージ
            System.out.println("NumberFormatExceptionが発生しました。");
            System.out.println("例外メッセージ: " + e.getMessage());
        }
    }
}

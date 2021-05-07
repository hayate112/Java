package practice;

import java.sql.SQLException;

public class Chapter11 {
    public static void main(String[] args) {

        try {
            int array[] = { 1, 3, 5 };
            Chapter11.validIndex(array, 2);
            Chapter11.validIndex(array, 3);

            System.out.println("validIndexの呼び出し終了");
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentExceptionが発生しました");
            e.printStackTrace();
        }

        // try-catch文を記述
        try {
        	Chapter11.throwSQLException();
        	// ・throwSQLExceptionメソッドを呼び出し
        } catch (SQLException e) {
        	// ・SQLExceptionをキャッチして、メッセージとスタックトレースを出力
        	System.out.println("SQLExceptionが発生しました");
        	e.printStackTrace();
        	// ・"throwSQLExceptionの呼び出し終了"のメッセージを出力
        } finally {
        	System.out.println("throwSQLExceptionの呼び出し終了");
        }

        System.out.println("mainメソッド終了");
    }

    // validIndexメソッドを作成
    public static void validIndex(int[] array, int index) {
    	// ・indexがarrayのサイズの範囲内なら、インデックスの要素を出力
    	if (array.length <= index) {
    		// ・サイズの範囲外なら、IllegalArgumentExceptionをスロー
    		throw new IllegalArgumentException(index + " はサイズの範囲外です");
    	}
    	System.out.println("インデックス " + index + " の要素は" + array[index] + " です");
    }

    public static void throwSQLException() throws SQLException {
        throw new SQLException("SQLエラーです");
    }
}
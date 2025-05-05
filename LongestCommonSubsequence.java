public class LongestCommonSubsequence {
    public int maiorComum(String s1, String s2){
        int [][] pd = new int[s1.length() + 1][s2.length() +1];
            for (int i = s1.length() - 1; i>=0; i--){
                for (int j = s2.length() - 1; j>=0; j--){
                    if (s1.charAt(i) == s2.charAt(j)) {
                        pd[i][j] = 1 + pd[i + 1][j + 1];
                    }
                    else {
                        pd[i][j] = Math.max(pd[i][j + 1], pd[i +1][j]);
                    }
                }
            }
        return pd[0][0];
    }

}

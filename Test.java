public class Test {

    public static void main(String args[]){
        LongestCommonSubsequence mc = new LongestCommonSubsequence();

        String s1 = "abcdefg";
        String s2 = "acfg";

        int resultado = mc.maiorComum(s1, s2);

        System.out.println(resultado);
    }

}

public class RollingHash {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int p = 31;
        int mod = (int)1e9 + 7;
        long pow = 1;
        long hashValue = 0;

        for(char ch : s.toCharArray()){
            hashValue = (hashValue + (ch - 'a' + 1) * pow)%mod;
            pow = (pow * p)%mod;
        }

        System.out.println(hashValue);
    }
}

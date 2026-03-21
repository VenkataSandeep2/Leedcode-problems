class Reversenumber{
    public static void main(String[] args) {
    	int n = 132;
        int ans = 0;

        while(n > 0) {
            int digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }
        System.out.println(ans);
    }
}

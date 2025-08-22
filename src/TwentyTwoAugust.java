class TwentyTwoAugust {
    public boolean isPowerOfThree(int n) {
        // if (n <= 0) return false; // powers of 3 are positive
        // while (n % 3 == 0) {
        //     n /= 3; // keep dividing by 3
        // }
        // return n == 1;
        if(n <= 0){
            return false;
        }
        while(n%3 == 0){
            n /= 3;
        }
        if(n == 1){
            return true;
        }
        return false; 
    }
}
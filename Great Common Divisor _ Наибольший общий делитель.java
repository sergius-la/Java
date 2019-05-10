    // Using loop
    int commonDivisor(int a, int b) {
        int max = (a > b) ? a : b;
        int min = (b < a) ? b : a;

        for (int i = min; min > 0; i--) {
            if (max % i == 0 && min % i == 0) {
                return i;
            }
        }
        return -1;
    }

    // Using recursion
     static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
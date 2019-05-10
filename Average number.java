double getAverage(int[] nums) {
    double sum = 0;
    for (int i : nums) {
       sum += i;
    }
    return sum / nums.length;
}
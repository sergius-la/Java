// Round 10
private int round(int num) {
    return (int) (Math.round(num/10.0) * 10);
}


// Helper function to round a value based on its last digit -- Проверить
public int round10(int num) {
  int remainder = num % 10;
  num -= remainder;
  if (remainder >= 5) {
    num += 10;
  }
  return num;
}
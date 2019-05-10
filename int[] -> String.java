int[] x = new int[] {3,4,5};
String s = Arrays.toString(x).replaceAll("[\\,\\[\\]\\ ]", "")

String s = IntStream.of(x)
  .mapToObj(Integer::toString)
  .collect(Collectors.joining(""));
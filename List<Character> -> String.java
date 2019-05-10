// List<Character> to String
List<Character> listChar = new ArrayList<Character>();
String str = listChar.stream().map(e->e.toString()).collect(Collectors.joining());
// String to Int
String numberAsString = "2018"; //Causing: Character can't be converted
int number = Integer.parseInt(numberAsString);


// String to Double 
String numberAsString = "20.18"; //Causing: Character can't be converted. Floating point should be a dot.
double number = Double.parseDouble(numberAsString);
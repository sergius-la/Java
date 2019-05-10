// Урок: https://youtu.be/fiUS7cbfE_8

                    // File name
File file = new File("temp.txt");

file.mkdir(); // Create a directory
file.createNewFile(); // Created a file


File file = new File("temp.txt");
file.createNewFile();
                                                
FileWriter fileWriter = new FileWriter(file);
fileWriter.write("String 1\n"); // Write a line into a file
fileWriter.write("String 2\n");
fileWriter.write("String 2\n");
fileWriter.flush();
fileWriter.close();



// Для записи в файл                             
BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // Конструктор принимает FileWriter
bufferedWriter.write("String 4");
bufferedWriter.newLine();
bufferedWriter.flush();
bufferedWriter.close();


// Для чтения из файла
BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
while (bufferedReader.ready()) {
    System.out.println(bufferedReader.readLine());
}
/*
1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого
запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main  {
    public static void main(String[] args) throws IOException {

           Task_1 task_1 = new Task_1();
           System.out.println(task_1.getWhere());}
}

/* Реализуйте алгоритм сортировки пузырьком числового массива, результат
после каждой итерации запишите в лог-файл
*/

/*public class Main {
    public static void main(String[] args) {
        int[] array = {9, 23, 2, 4, 5, 1};

        try (FileWriter fileWriter = new FileWriter("log.txt");
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            printArray(array, printWriter);

            Task_2.bubble(array, printWriter);

            printArray(array, printWriter);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printArray(int[] array, PrintWriter printWriter) {
    }
}*/




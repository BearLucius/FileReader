import java.io.FileReader;
import java.util.Scanner;
//try1
// План действий:
// 1) Сделать массив в который мы будем впихивать нашу строку.
// 2) Сделать метод который будет считать кол-во строк (Тобиш massiv.lenght = Строке)
// 3) В каждой строке определить кол-во в ней символов (Через char).
// 4) В каждой строке определить кол-во слов (Тоесть, он должен будет читать слово до пробела, повышать счётчик на 1 и работать дальше).
public class Main {
    public static void main(String[] args) throws Exception {
            FileReader fr = new FileReader("Q://Крапивин Илья ИС-3 (bearlucius)//11.1 Посчитать количество строк и слов//note.txt");
            Scanner scanner = new Scanner(fr);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            fr.close();
        }
    }




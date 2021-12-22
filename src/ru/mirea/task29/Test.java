package ru.mirea.task29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] clientsInfo = {"Петров П.П.", "Примогемов В.П.", "Кулаков П.С."};
        String[] employeeInfo = {"Кабанова К.К.", "Дощечкин А.В.", "Свиристелова С.Г."};
        String[] bankServicesInfo = {"Петров П.П. взял кредит на 2000 рублей, баланс Примогемова В.П. составляет 500 рублей, депозит Кулакова П.С. составяет 10000000 рублей"};

        CurInfo CurInfo = new CurInfo(clientsInfo, employeeInfo, bankServicesInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("./src/ru/mirea/task29/file.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем данные в файл
        objectOutputStream.writeObject(CurInfo);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("./src/ru/mirea/task29/file.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurInfo CurInfo1 = (CurInfo) objectInputStream.readObject();

        System.out.println(CurInfo1);
    }
}

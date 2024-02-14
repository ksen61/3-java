package org.example;//это объявление пакета для организации и структурирования кода и также чтобы предотвратить конфликты имен между классами
import java.util.Scanner;// это оператор импорта для считываания ввода с клавиатуры

public class Main {//объявление класса Main
    public static void main(String[] args) {// обьявляем метод main, который запускает программу
        Scanner scanner = new Scanner(System.in);//создаем объект Scanner с именем scanner для считывания ввода с клавиатуры

        System.out.println("Введите три целых числа a, b и c:");//выводится сообщение пользователю с просьбой ввести 3 целых числа
        int a = scanner.nextInt();// сохраняем ввод пользователя с клавиатуры в переменную a типа int
        int b = scanner.nextInt();// сохраняем ввод пользователя с клавиатуры в переменную b типа int
        int c = scanner.nextInt();// сохраняем ввод пользователя с клавиатуры в переменную c типа int

        if (a <= 0 || b <= 0 || c <= 0) {// проверка на то, что хотя бы одно число отрицательное или равно нулю, если условие выполняется, то выводится сообщение об
            // ошибке, что стороны  стороны треугольника должны быть положительными числами
            System.out.println("Ошибка: стороны треугольника должны быть положительными числами.");
        } else if (isRightTriangle(a, b, c)) { // проверка, являются ли стороны тругольника a, b и с сторонами прямоугольного треугольника, если условие выполняется,
            // то выводится сообщение, что стороны образуют прямоугольный треугольник
            System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
        } else if (isEquilateralTriangle(a, b, c)) {// проверка, являются ли стороны тругольника a, b и с сторонами равностороннего треугольника, если условие
            // выполняется, то выводится сообщение, что стороны образуют равносторонний треугольник
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");
        } else if (isIsoscelesTriangle(a, b, c)) {// проверка, являются ли стороны тругольника a, b и с сторонами равнобедренного треугольника, если условие
            // выполняется, то выводится сообщение, что стороны образуют равнобедренный треугольник
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
        } else if (!isTriangle(a, b, c)) {// проверка, не являются ли стороны тругольника a, b и с сторонами треугольника, если условие выполняется,
            // то выводится сообщение, что стороны не образуют треугольник
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");
        } else {// если все предыдущие условие не были выполнены, то выводится сообщение, что стороны обрахают обычный треугольник
            System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника");
        }

        scanner.close();//закрытие объекта Scanner
    }

    public static boolean isRightTriangle(int a, int b, int c) {// метод для проверки являются ли стороны a, b и c сторонами прямоугольного треугольника
        return a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b; // возвращает true, если выполняется хотя бы одно из условий теоремы
        // Пифагора
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {// метод для проверки являются ли стороны a, b и c сторонами равносторонненого
        // треугольника
        return a == b && b == c;// возвращает true, если все стороны равны друг другу
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {// метод для проверки являются ли стороны a, b и c сторонами равнобедренного треугольника
        return a == b || b == c || c == a;// возвращает true, если хотя бы две стороны равны
    }

    public static boolean isTriangle(int a, int b, int c) {// метод для проверки являются ли стороны a, b и c сторонами треугольника
        return a + b > c && b + c > a && c + a > b;// возвращает true, если выполняется неравенство треугольника
    }
}
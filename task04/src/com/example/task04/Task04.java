package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    System.out.println("Возможно вы делите на 0"); //обрабатываем исключение при делении на 0
                    return 0;
                } else {
                    return (float) a / b;
                }
        }
        return 0;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        float result = calculate(-36, 10, "/");
        System.out.println(result);
    }

}

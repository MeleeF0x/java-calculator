public class Calculator {
    //Поля используемых значений
    private static float num1;
    private static float num2;
    private static float result;
    //Гетеры и сетеры
    public static void SetNum1(float num){
        num1 = num;
        return;
    }
    public static void SetNum2(float num){
        num2 = num;
        return;
    }
    public static float GetNum1(){
        return num1;
    }
    public static float GetNum2(){
        return num2;
    }
    public static float GetResult(){
        return result;
    }
    //Метод суммирования чисел
    public static void Sum(){
        result = num1 + num2;
        return;
    }
    //Метод вычитания чисел
    public static void Sub(){
        result = num1 - num2;
        return;
    }
    //Метод умножения чисел
    public static void Mult(){
        result = num1 * num2;
        return;
    }
    //Метод деления чисел
    public static void Div(){
        result = num1 / num2;
        return;
    }
}

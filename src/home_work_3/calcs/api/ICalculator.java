package home_work_3.calcs.api;

public interface ICalculator {


    /**
     * Деление
     * @param x1 - число введенное пользователем
     * @param x2 - число введенное пользователем
     * @return - результат деления х1 на х2
     */
    double div(double x1, double x2);

    /**
     * Умножение
     * @param x1 - число введенное пользователем
     * @param x2 - число введенное пользователем
     * @return - результат умножения х1 на х2
     */
    double mul(double x1, double x2);

    /**
     * Вычитание
     * @param x1 - число введенное пользователем
     * @param x2 - число введенное пользователем
     * @return - результат вычитания х1 на х2
     */
    double sub(double x1, double x2);

    /**
     * Сложение
     * @param x1 - Число введённое пользователем
     * @param x2 - Число введённое пользователем
     * @return - результат сложения х1 и х2
     */
    double add(double x1, double x2);

    /**
     * Возведение в степень
     * @param x1 - число возводимое в степень
     * @param x2 - степень
     * @return - результат возведения числа х1 в степень х2
     */
    double degree(double x1, int x2);

    /**
     * Модуль
     * @param number - число введенное пользователем
     * @return - модуль числа
     */
    double module(double number);

    /**
     * Корень
     * @param number - число извлекаемое из под корня
     * @return - ответ
     */
    double root(double number);



}

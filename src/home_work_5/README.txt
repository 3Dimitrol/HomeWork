Создал класс DataContainer, выполнил задания :

В методе main, записаны проверки из заданий

1) Создал класс DataContainer у которого есть один дженерик;
2) Внутри DataContainer создал поле T[] data;
3) Создал один конструктор DataContainer();
4) Создал метод int add(T item) который добавляет данные во внутреннее поле data и возвращает номер позиции в которую были вставлены данные;
5) Создал метод T get(int index). Данный метод получает из DataContainer'а, из поля data, предварительно сохранённый объект который мы передали на предыдущем шаге через метод add;
6) Создал метод T[] getItems() который возвращает массив из поля data;
7) Создал метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу;
8) Создал метод boolean delete(T item) который будет удалять элемент из нашего поля data;
9) Создал НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator). Данный метод занимается сортировкой данных записанных в поле data используя реализацию сравнения из ПЕРЕДАННОГО объекта comparator;
     Интефейс Comparator реализован классом Compar;
     Выполнена только часть 9 задания с сортировкой, сортировка чисел;

Есть мысли что сделал неправильно, так как в методах участвует приведение типов.
Чувствую сильную слабость в знаниях с передачей данных и дженериками, надеюсь после разбора ДЗ5, станет понятнее

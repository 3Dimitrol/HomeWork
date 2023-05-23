package home_work_3.calcs.api;

public interface ICommunicationPrinter {

     /**
      * Метод проверяет, какой пользователь будет использовать ПК
      * @param name - вводится имя пользователя
      * @return - "Вася" - "Привет!" "Я тебя так долго ждал".
      * 		  "Анастасия" - "Я тебя так долго ждал".
      * 		  В случае если это будет другое имя - "Добрый день, а вы кто?".
      */
     String welcome(String name);

}

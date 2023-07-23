package com.abbott.cycle_timer;
import java.util.Timer;
import java.util.TimerTask;

public class UpdateTimer {
    private Timer timer = new Timer();
    private String data;
    // Метод для установки данных
    public void setData(String data) {
        this.data = data;
    }
    // Метод для получения данных
    public String getData() {
        return data;
    }
    // Метод для запуска таймера
    public void startFetchingData() {
        // Создаем задачу для выполнения кода каждую минуту
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (getData() != null) {
                    System.out.println(getData());
                }
            }
        };
        // Запускаем таймер
        timer.schedule(task, 0, 60000);
    }
    // Метод для остановки таймера
    public void stopFetchingData() {
        // Останавливаем таймер
        timer.cancel();
        timer.purge();
        System.out.println("Таймер остановлен.");
    }
}
/**
 * Этот код представляет класс UpdateTimer, в котором реализован таймер для получения и вывода данных каждую минуту.
 * При создании экземпляра UpdateTimer можно установить данные с помощью метода setData.
 * Метод startFetchingData запускает таймер, который каждую минуту выводит данные на экран,
 * если они были установлены в методе setData.
 * Метод stopFetchingData останавливает таймер и выводит сообщение об остановке.
 */
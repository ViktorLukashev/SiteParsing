package com.abbott;

import java.util.Timer;
import java.util.TimerTask;

public class UpdateTimer {
    private Timer timer = new Timer();

    public void startFetchingData(String t) {
        // Создаем таймер и задачу для выполнения кода каждую минуту

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (t != null) {
                    System.out.println(t);
                }
            }
        };

        // Запускаем таймер
        timer.schedule(task, 0, 60000); // выполнение каждую минуту
    }

    public void stopFetchingData() {
        // Останавливаем таймер
        timer.cancel();
        timer.purge();
        System.out.println("Таймер остановлен.");
    }
}

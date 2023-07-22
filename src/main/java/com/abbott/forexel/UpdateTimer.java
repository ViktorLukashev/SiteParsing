package com.abbott.forexel;

import java.util.Timer;
import java.util.TimerTask;

class UpdateTimer {
    private Timer timer = new Timer();

    protected void startFetchingData(String t) {
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

    protected void stopFetchingData() {
        // Останавливаем таймер
        timer.cancel();
        timer.purge();
        System.out.println("Таймер остановлен.");
    }
}

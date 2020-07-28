package Part11.Lesson13;

public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        public LightOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = true;
        }

        public String toString() {
            return "Свет включен";
        }
    }

    public class LightOff extends Event {
        public LightOff(long delayTime) {
            super(delayTime);
        }

        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Свет выключен";
        }
    }

    private boolean airing = false;

    public class AiringOn extends Event {
        public AiringOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Проветривание включено";
        }

        @Override
        public void action() {
            airing = true;
        }
    }

    public class AiringOff extends Event {
        public AiringOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public String toString() {
            return "Проветривание выключено";
        }

        @Override
        public void action() {
            airing = false;
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {
        public WaterOn(long delayTime) {
            super(delayTime);
        }

        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Полив включен";
        }
    }

    public class WaterOff extends Event {
        public WaterOff(long delayTime) {
            super(delayTime);
        }

        public void action() {

            water = false;
        }

        public String toString() {
            return "Полив выключен";
        }
    }

    private String thermostat = "День";

    public class ThermostatNight extends Event {
        public ThermostatNight(long delayTime) {
            super(delayTime);
        }

        public void action() {
// Здесь размещается код управления оборудованием,
            thermostat = "Ночь";
        }

        public String toString() {
            return "Термостат использует ночной режим";
        }
    }

    public class ThermostatDay extends Event {
        public ThermostatDay(long delayTime) {
            super(delayTime);
        }

        public void action() {
// Здесь размещается код управления оборудованием,
            thermostat = "День";
        }

        public String toString() {
            return "Термостат использует дневной режим";
        }
    }

    // Пример метода action(), вставляющего новый экземпляр
// самого себя в список событий:
    public class Bell extends Event {
        public Bell(long delayTime) {
            super(delayTime);
        }

        public void action() {
            addEvent(new Bell(delayTime));
        }

        public String toString() {
            return "Бам!";
        }
    }

    public class Restart extends Event {
        private Event[] eventList;

        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList)
                addEvent(e);
        }

        public void action() {
            for (Event e : eventList) {
                e.start(); // Перезапуск каждого события
                addEvent(e);
            }
            start(); // Перезапуск текущего события
            addEvent(this);
        }

        public String toString() {
            return "Перезапуск системы";
        }
    }

    public static class Terminate extends Event {
        public Terminate(long delayTime) {
            super(delayTime);
        }

        public void action() {
            System.exit(0);
        }

        public String toString() {
            return "Отключение";
        }
    }
}

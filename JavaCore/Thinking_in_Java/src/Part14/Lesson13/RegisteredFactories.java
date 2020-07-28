package Part14.Lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Part> partFactories = new ArrayList<Part>();

    static {
        partFactories.add(new FuelFilter());
        partFactories.add(new AirFilter());
        partFactories.add(new CabinAirFilter());
        partFactories.add(new OilFilter());
        partFactories.add(new FanBelt());
        partFactories.add(new PowerSteeringBelt());
        partFactories.add(new GeneratorBelt());
    }

    private static Random rand = new Random(47);

    public static Part createRandom() throws IllegalAccessException, InstantiationException {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).getClass().newInstance();
    }
}

class Filter extends Part {
}

class FuelFilter extends Filter {
    public static class Factory
            implements Part14.Lesson13.Factory<FuelFilter> {
        public FuelFilter create() {
            return new FuelFilter();
        }
    }
}

class AirFilter extends Filter {
    public static class Factory
            implements Part14.Lesson13.Factory<AirFilter> {
        public AirFilter create() {
            return new AirFilter();
        }
    }
}

class CabinAirFilter extends Filter {
    public static class Factory implements Part14.Lesson13.Factory<CabinAirFilter> {
        public CabinAirFilter create() {
            return new CabinAirFilter();
        }
    }
}

class OilFilter extends Filter {
    public static class Factory implements Part14.Lesson13.Factory<OilFilter> {
        public OilFilter create() {
            return new OilFilter();
        }
    }
}

class Belt extends Part {
}

class FanBelt extends Belt {
    public static class Factory implements Part14.Lesson13.Factory<FanBelt> {
        public FanBelt create() {
            return new FanBelt();
        }
    }
}

class GeneratorBelt extends Belt {
    public static class Factory implements Part14.Lesson13.Factory<GeneratorBelt> {
        public GeneratorBelt create() {
            return new GeneratorBelt();
        }
    }
}

class PowerSteeringBelt extends Belt {
    public static class Factory implements Part14.Lesson13.Factory<PowerSteeringBelt> {
        public PowerSteeringBelt create() {
            return new PowerSteeringBelt();
        }
    }
}

public class RegisteredFactories {
    public static void main(String[] args) {
        TypeCounter counter = new TypeCounter(Part.class);
        counter.count(new Filter());
        System.out.println(counter);
       /* for (int i = 0; i < 10; i++)
            System.out.println(Part.createRandom());*/
    }
}

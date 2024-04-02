import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<Optional> optionalConstructor = Optional.class.getDeclaredConstructor(Object.class);
        optionalConstructor.setAccessible(true);
        Optional<String> optionalString = optionalConstructor.newInstance("VALUE");
        System.out.println("isPresent: " + optionalString.isPresent());
        System.out.println("value: " + optionalString.get());
    }
}

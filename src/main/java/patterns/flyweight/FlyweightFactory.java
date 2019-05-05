
package patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

/**
 * A factory for creating FlyWeight objects.
 */




@Slf4j
public final class FlyweightFactory {

    /** The list. */
    private final List<FlyWeight> list = new ArrayList<>();

    /**
     * Creates the flyweight object.
     *
     * @return the fly weight
     */
    public FlyWeight create() {
        final FlyWeight flyWeight = new FlyWeight("CommonState");
        list.add(flyWeight);
        return flyWeight;
    }

}

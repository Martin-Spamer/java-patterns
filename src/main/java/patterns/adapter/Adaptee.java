
package patterns.adapter;

public class Adaptee implements AdapteeInterface {

    @Override
    public Result operation() {
        return new Result();
    }

}

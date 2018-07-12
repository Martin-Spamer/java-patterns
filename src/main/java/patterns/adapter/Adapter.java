
package patterns.adapter;

public class Adapter implements TargetInterface {

    @Override
    public Result operation() {
        AdapteeInterface adaptee = new Adaptee();
        return adaptee.operation();
    }

}

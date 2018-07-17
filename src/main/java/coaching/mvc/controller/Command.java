
package coaching.mvc.controller;

import java.util.Properties;

import coaching.mvc.CommandInterface;

public class Command implements CommandInterface {

    @Override
    public Properties execute(final Properties parameters) {
        return parameters;
    }

}

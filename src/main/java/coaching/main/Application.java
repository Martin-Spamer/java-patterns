/**
 * This file is part of Automated Testing Framework for Java (atf4j).
 *
 * Atf4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Atf4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with atf4j.  If not, see http://www.gnu.org/licenses/.
 */

package coaching.main;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    private Application() {
        super();
    }

    public static void main(final String[] args) {
        LOG.trace("System properties = {}", System.getProperties().toString());
        LOG.debug("args = {}", Arrays.toString(args));
        new Application();
    }

}

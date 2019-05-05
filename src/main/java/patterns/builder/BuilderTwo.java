
package patterns.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * BuilderTwo Class.
 */




@Slf4j
public class BuilderTwo extends AbstractBuilder {

    /*
     * (non-Javadoc)
     * @see patterns.gof.creational.builder.AbstractBuilder#build()
     */
    @Override
    public AbstractPart build() {
        return new PartTwo();
    }

    /*
     * (non-Javadoc)
     * @see patterns.builder.AbstractBuilder#build(java.lang.String)
     */
    @Override
    public AbstractPart build(final String partName) {
        return new PartTwo(partName);
    }

}

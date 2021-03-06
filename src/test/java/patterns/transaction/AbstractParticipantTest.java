
package patterns.transaction;

import static org.hamcrest.CoreMatchers.notNullValue;

import org.junit.Test;

import static org.junit.Assert.assertThat;

/**
 * AbstractParticipant class tests.
 */
public final class AbstractParticipantTest {

    /**
     * The TestMockParticipant.
     */
    public final class TestMockParticipant extends AbstractParticipant {

        /*
         * (non-Javadoc)
         * @see patterns.transaction.AbstractParticipant#operation1()
         */
        @Override
        public ParticipantInterface operation() {
            return this;
        }

        /*
         * (non-Javadoc)
         * @see patterns.transaction.ParticipantInterface#join()
         */
        @Override
        public ParticipantInterface join() {
            return this;
        }

        /*
         * (non-Javadoc)
         * @see patterns.transaction.ParticipantInterface#commit()
         */
        @Override
        public ParticipantInterface commit() {
            return this;
        }

        /*
         * (non-Javadoc)
         * @see patterns.transaction.ParticipantInterface#cancel()
         */
        @Override
        public ParticipantInterface cancel() {
            return this;
        }

    }

    /**
     * Unit test to typical usage commit.
     */
    @Test
    public void testTypicalUsageCommit() {
        // Given
        final AbstractParticipant target = new TestMockParticipant();
        target.join();

        // When
        target.operation();

        // Then
        target.commit();
    }

    /**
     * Unit test to typical usage cancel.
     */
    @Test
    public void testTypicalUsageCancel() {
        // Given
        final AbstractParticipant target = new TestMockParticipant();
        target.join();

        // When
        target.operation();

        // Then
        target.cancel();
    }

    /**
     * Type.
     */
    @Test
    public void type() {
        assertThat(AbstractParticipant.class, notNullValue());
    }

}

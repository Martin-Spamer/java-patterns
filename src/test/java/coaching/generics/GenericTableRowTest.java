
package coaching.generics;

import java.util.UUID;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import lombok.extern.slf4j.Slf4j;


/** The Constant 			log. */
@Slf4j
public class GenericTableRowTest {

    /**
     * test GenericTableRow object.
     */
    @Test
    public void testGenericTableRow() {
        GenericTableRow<UUID> tableRow = new GenericTableRow<UUID>();
        assertEquals(0, tableRow.length());
        log.info(tableRow.toRowString());
        log.info(tableRow.toString());
    }

    /**
     * test GenericTableRow object.
     */
    @Test
    public void testGenericTableRowString() {
        GenericTableRow<UUID> tableRow = new GenericTableRow<UUID>(UUID.randomUUID().toString());
        assertEquals(1, tableRow.length());
        log.info(tableRow.toRowString());
        log.info(tableRow.toString());
    }

    /**
     * test GenericTableRow object.
     */
    @Test
    public void testGenericTableRowTArray() {
        GenericTableRow<UUID> tableRow = new GenericTableRow<UUID>(new UUID[] { UUID.randomUUID(), UUID.randomUUID() });
        assertEquals(2, tableRow.length());
        log.info(tableRow.toRowString());
        log.info(tableRow.toString());
    }

    /**
     * test GenericTableRow object.
     */
    @Test
    public void testAddCellsString() {
        GenericTableRow<UUID> tableRow = new GenericTableRow<UUID>().addCells(UUID.randomUUID().toString());
        assertEquals(1, tableRow.length());
        log.info(tableRow.toRowString());
        log.info(tableRow.toString());
    }

    /**
     * test GenericTableRow object.
     */
    @Test
    public void testAddCellsTArray() {
        GenericTableRow<UUID> tableRow = new GenericTableRow<UUID>().addCells(new UUID[] { UUID.randomUUID(), UUID.randomUUID() });
        assertEquals(2, tableRow.length());
        log.info(tableRow.toRowString());
        log.info(tableRow.toString());
    }

}


package coaching.generics;

import java.util.UUID;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GenericTableTest {

    @Test
    public void testGenericTable() {
        GenericTable<UUID> genericTable = new GenericTable<UUID>();
        assertNotNull(genericTable);
        assertEquals("GenericTable [tableName=null, colNames=[], rows=[]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testGenericTableString() {
        String tableName = "tableName";
        GenericTable<UUID> genericTable = new GenericTable<UUID>(tableName);
        assertNotNull(genericTable);
        assertEquals("GenericTable [tableName=tableName, colNames=[], rows=[]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testGenericTableNull() {
        GenericTable<UUID> genericTable = new GenericTable<UUID>(null);
        assertNotNull(genericTable);
        assertEquals("GenericTable [tableName=null, colNames=[], rows=[]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testSetGetName() {
        GenericTable<UUID> genericTable = new GenericTable<UUID>();
        assertNotNull(genericTable);
        String tableName = "tableName";
        assertEquals(tableName, genericTable.setName(tableName).getName());
        assertEquals("GenericTable [tableName=tableName, colNames=[], rows=[]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testAddColumnName() {
        GenericTable<UUID> genericTable = new GenericTable<UUID>("tableName");
        assertNotNull(genericTable);
        genericTable.addColumnName("One").toString();
        assertEquals("GenericTable [tableName=tableName, colNames=[One], rows=[]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testAddColumnNameNull() {
        GenericTable<UUID> genericTable = new GenericTable<UUID>("tableName");
        assertNotNull(genericTable);
        genericTable.addColumnName(null).toString();
        assertEquals("GenericTable [tableName=tableName, colNames=[null], rows=[]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testAddColumnNames() {
        GenericTable<UUID> genericTable = new GenericTable<UUID>("tableName");
        assertNotNull(genericTable);
        String colNames = "One,Two,Three,Four";
        assertEquals(genericTable, genericTable.addColumnName(colNames));
        assertEquals("GenericTable [tableName=tableName, colNames=[One,Two,Three,Four], rows=[]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testAddColumnArray() {
        GenericTable<UUID> genericTable = new GenericTable<UUID>("tableName");
        assertNotNull(genericTable);
        UUID[] colData = {
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID(),
                UUID.randomUUID() };
        assertEquals(genericTable, genericTable.addColumn(colData));
        assertEquals("GenericTable [tableName=tableName, colNames=[], rows=[]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testAddColumnNull() {
        GenericTable<UUID> genericTable = new GenericTable<UUID>("tableName");
        assertNotNull(genericTable);
        UUID[] colData = null;
        assertEquals(genericTable, genericTable.addColumn(colData));
        assertEquals("GenericTable [tableName=tableName, colNames=[], rows=[]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testAddRowGenericTableRow() {
        GenericTable<UUID> genericTable = new GenericTable<UUID>("tableName");
        assertNotNull(genericTable);
        UUID[] colData = null;
        assertEquals(genericTable, genericTable.addRow(new GenericTableRow<UUID>()));
        assertEquals("GenericTable [tableName=tableName, colNames=[], rows=[[[]]]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testGetRow() {
        GenericTable<UUID> genericTable = new GenericTable<UUID>("tableName");
        assertNotNull(genericTable);
        assertEquals(genericTable, genericTable.addRow(new GenericTableRow<UUID>()));
        GenericTableRow<UUID> row = genericTable.getRow(0);
        assertEquals("GenericTable [tableName=tableName, colNames=[], rows=[[[]]]]", genericTable.toString());
        log.info("{}", genericTable);
    }

    @Test
    public void testTableHeader() {
        log.info("{}", new GenericTable<UUID>().tableHeader());
    }

    @Test
    public void testTableBody() {
        log.info("{}", new GenericTable<UUID>().tableBody());
    }

    @Test
    public void testToCsvString() {
        log.info("{}", new GenericTable<UUID>().toCsvString());
    }

    @Test
    public void testToString() {
        log.info("{}", new GenericTable<UUID>().toString());
    }

}

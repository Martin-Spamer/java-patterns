
package coaching.template;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import coaching.resources.ResourceLoader;

public class TemplateTest {

    /** provides logging */
    private static final Logger log = LoggerFactory.getLogger(TemplateTest.class);

    @Test
    public void testTemplateTypicalUsage() {
        InputStream stream = ResourceLoader.getStream("Test.template");
        Template template = Template.from(stream);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Name", "Alice");
        map.put("Age", new Integer(21));
        map.put("Data", Boolean.TRUE);
        assertEquals(template, template.merge(map));
        log.info("{}", template);
    }

    @Test
    public void testTemplateLoadJson() {
        Template template = new Template();
        String filename = "./resources/Json.Template";
        assertNotEquals(template, template.load(filename));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Name", "Alice");
        map.put("Age", new Integer(21));
        map.put("Data", Boolean.TRUE);
        assertEquals(template, template.merge(map));
        log.info("{}", template);
    }

    @Test
    public void testTemplateLoadCode() {
        Template template = new Template();
        String filename = "./resources/Code.Template";
        assertNotEquals(template, template.load(filename));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("package", "example");
        map.put("className", "FooBar");
        assertEquals(template, template.merge(map));
        log.info("{}", template);
    }

    @Test
    public void testTemplate() {
        assertNotNull(new Template());
    }

    @Test
    public void testTemplateString() {
        assertNotNull(new Template(""));
    }

    @Test
    public void testTemplateLoadString() {
        Template template = new Template();
        assertEquals(template, template.load(""));
    }

    @Test
    public void testTemplateReplaceNullProperties() {
        Template template = new Template();
        Properties nullProperties = null;
        assertEquals(template, template.merge(nullProperties));
    }

    @Test
    public void testTemplateReplaceProperties() {
        Template template = new Template();
        assertEquals(template, template.merge(new Properties()));
    }

    @Test
    public void testTemplateReplaceNullMap() {
        Template template = new Template();
        Map<String, Object> map = null;
        assertEquals(template, template.merge(map));
    }

    @Test
    public void testTemplateReplaceEmptyMap() {
        Template template = new Template();
        Map<String, Object> map = new HashMap<String, Object>();
        assertEquals(template, template.merge(map));
    }

}

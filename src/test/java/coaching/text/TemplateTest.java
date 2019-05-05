
package coaching.text;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import static org.junit.Assume.assumeNotNull;

import coaching.resources.ResourceLoader;
import coaching.text.Template.TemplateException;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class TemplateTest {

    /**
     *  provides logging.
     *
     * @throws TemplateException the template exception
     */

    @Test
    public void testTemplateFromStream() throws TemplateException {
        InputStream stream = ResourceLoader.getStream("Test.template");
        assumeNotNull(stream);

        Template template = Template.from(stream);
        assumeNotNull(stream);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("String", "Alice");
        map.put("Number", new Integer(21));
        map.put("Boolean", Boolean.TRUE);

        assertEquals(template, template.merge(map));
        template.toLog();
    }

    /**
     * test Template object.
     *
     * @throws TemplateException the template exception
     */
    @Test
    public void testJsonTemplateFromStream() throws TemplateException {
        InputStream stream = ResourceLoader.getStream("Json.template");
        assumeNotNull(stream);

        Template template = Template.from(stream);
        assumeNotNull(stream);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("String", "Alice");
        map.put("Number", new Integer(21));
        map.put("Boolean", Boolean.TRUE);

        assertEquals(template, template.merge(map));
        template.toLog();
    }

    /**
     * test Template object.
     *
     * @throws TemplateException the template exception
     */
    @Test
    public void testTemplateJson() throws TemplateException {
        Template template = Template.from("src/test/resources/Json.template");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Name", "Alice");
        map.put("Number", new Integer(21));
        map.put("Boolean", Boolean.TRUE);

        assertEquals(template, template.merge(map));
        template.toLog();
    }

    /**
     * test Template object.
     *
     * @throws TemplateException the template exception
     */
    @Test
    public void testTemplateLoadJson() throws TemplateException {
        Template template = new Template();
        String filename = "src/test/resources/Json.template";
        assertEquals(template, template.load(filename));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("Name", "Alice");
        map.put("Number", new Integer(21));
        map.put("Boolean", Boolean.TRUE);

        assertEquals(template, template.merge(map));
        template.toLog();
    }

    /**
     * test Template object.
     *
     * @throws TemplateException the template exception
     */
    @Test
    public void testTemplateFromFilename() throws TemplateException {
        Template template = new Template();
        String filename = "src/test/resources/Code.template";
        assertEquals(template, template.load(filename));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("package", "com.example");
        map.put("className", "FooBar");

        assertEquals(template, template.merge(map));
        template.toLog();
    }

    /**
     * test Template object.
     *
     * @throws TemplateException the template exception
     */
    @Test
    public void testTemplateLoadCode() throws TemplateException {
        Template template = new Template();
        String filename = "src/test/resources/Code.template";
        assertEquals(template, template.load(filename));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("package", "com.example");
        map.put("className", "FooBar");

        assertEquals(template, template.merge(map));
        template.toLog();
    }

    /**
     * test Template object.
     */
    @Test
    public void testTemplate() {
        assertNotNull(new Template());
    }

    /**
     * test Template object.
     */
    @Test
    public void testTemplateString() {
        assertNotNull(new Template(""));
    }

    /**
     * test Template object.
     *
     * @throws TemplateException the template exception
     */
    @Test(expected = TemplateException.class)
    public void testTemplateLoadString() throws TemplateException {
        Template template = new Template();
        template.load("");
    }

    /**
     * test Template object.
     *
     * @throws TemplateException the template exception
     */
    @Test
    public void testTemplateReplaceNullProperties() throws TemplateException {
        Template template = new Template();
        Properties nullProperties = null;
        assertEquals(template, template.merge(nullProperties));
    }

    /**
     * test Template object.
     *
     * @throws TemplateException the template exception
     */
    @Test
    public void testTemplateReplaceProperties() throws TemplateException {
        Template template = new Template();
        assertEquals(template, template.merge(new Properties()));
    }

    /**
     * test Template object.
     *
     * @throws TemplateException the template exception
     */
    @Test
    public void testTemplateReplaceNullMap() throws TemplateException {
        Template template = new Template();
        Map<String, Object> map = null;
        assertEquals(template, template.merge(map));
    }

    /**
     * test Template object.
     *
     * @throws TemplateException the template exception
     */
    @Test
    public void testTemplateReplaceEmptyMap() throws TemplateException {
        Template template = new Template();
        Map<String, Object> map = new HashMap<String, Object>();
        assertEquals(template, template.merge(map));
    }

}

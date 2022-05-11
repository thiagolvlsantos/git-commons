package io.github.thiagolvlsantos.git.commons.file;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;
import java.util.Properties;

import org.junit.Test;

import io.github.thiagolvlsantos.git.commons.properties.PropertyUtils;

public class PropertyUtilsTest {

	@Test
	public void testMerged() throws IOException {
		Properties p = PropertyUtils.merged("file.properties");
		assertFalse(p.containsKey("index"));
		assertEquals(p.get("$eq"), "PredicateEquals");
		assertEquals(p.get("$=="), "PredicateEquals");
		assertEquals(p.get("$ne"), "MyPredicateNotEquals");
	}
}

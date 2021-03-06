package com.google.refine.tests.expr.functions.xml;

import org.testng.annotations.Test;

import com.google.refine.expr.functions.xml.XmlAttr;
import com.google.refine.tests.util.TestUtils;

public class xmlAttrTests {
    @Test
    public void serializeXmlAttr() {
        String json = "{\"description\":\"Selects a value from an attribute on an XML or HTML Element\",\"returns\":\"String attribute Value\",\"params\":\"Element e, String s\"}";
        TestUtils.isSerializedTo(new XmlAttr(), json);
    }
}


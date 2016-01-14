package org.jpos.ee.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.io.IOException;

@Converter(autoApply = true)
public class ObjectNodeConverter implements AttributeConverter<ObjectNode,String> {

    @Override
    public String convertToDatabaseColumn(ObjectNode attribute) {
        return attribute.toString();
    }

    @Override
    public ObjectNode convertToEntityAttribute(String dbData) {
        try {
            return (ObjectNode) new ObjectMapper().readTree(dbData);
        } catch (IOException e) {
            return null;
        }
    }
}


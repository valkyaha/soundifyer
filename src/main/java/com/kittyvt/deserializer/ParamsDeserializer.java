package com.kittyvt.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.kittyvt.domain.bnk.hirc.body.soundtype.action.Params;

import java.io.IOException;

public class ParamsDeserializer extends StdDeserializer<Object> {

    public ParamsDeserializer() {
        this(null);
    }

    public ParamsDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Object deserialize(JsonParser p, DeserializationContext context) throws IOException {
        JsonNode node = p.getCodec().readTree(p);

        if (node.isTextual()) {
            return node.asText();
        } else if (node.isObject()) {
            return p.getCodec().treeToValue(node, Params.class);
        }

        throw new IOException("Unexpected JSON type for params in action field");

    }
}

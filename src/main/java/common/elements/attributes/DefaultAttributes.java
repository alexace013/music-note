package common.elements.attributes;

import lombok.Getter;

import static java.lang.Byte.parseByte;
import static common.elements.attributes.DefaultFontParameters.FONT_STYLE;
import static common.elements.attributes.DefaultFontParameters.FONT_SIZE;

public abstract class DefaultAttributes {

    protected static final String DEFAULT_FONT_STYLE = FONT_STYLE.getParam().toString();
    protected static final byte DEFAULT_FONT_SIZE = parseByte(FONT_SIZE.getParam().toString());

}

@Getter
enum DefaultFontParameters {

    FONT_STYLE("Arial"),
    FONT_SIZE(12);

    private Object param;

    DefaultFontParameters(final Object param) {
        this.param = param;
    }

}
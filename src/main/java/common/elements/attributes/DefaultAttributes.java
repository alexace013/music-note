package common.elements.attributes;

import lombok.Getter;

import static java.lang.Byte.parseByte;

public abstract class DefaultAttributes {

    protected static final String DEFAULT_FONT_STYLE = DefaultFontParameters.FONT_STYLE.getParam().toString();
    protected static final byte DEFAULT_FONT_SIZE = parseByte(DefaultFontParameters.FONT_SIZE.getParam().toString());

    @Getter
    private enum DefaultFontParameters {

        FONT_STYLE("Arial"),
        FONT_SIZE(12);

        private Object param;

        DefaultFontParameters(final Object param) {
            this.param = param;
        }

    }
}
# music-note
Music Note App v.1.02.d

About app
=====================

Text about app.
Test text.

What can help you fix some troubles with application
-----------------------------------
**1.** Next steps can your help fix one of the troubles related with **lombok:**

`Settings -> Compiler -> Annotation Processors -> click checkbox 'Enable annotation processing'`

**2.** Your can change font style into next classes:

`common.elements.attributes.FxButtonElementAttributes`

and 

`common.elements.attributes.FxTextElementAttributes`

changes

`common.elements.attributes.FxTextElementAttributes#DEFAULT_FONT_STYLE`

and 

`common.elements.attributes.FxButtonElementAttributes#DEFAULT_FONT_STYLE`

any another font style (as example: **Courier New**(find any fonts into file `../music-note/info/font`))

**3.** For run and generate report need use next commands:

`mvn clean test`

`mvn surefire-report:report`

or next command:

`mvn clean test surefire-report:report`

and find report into`../note-music/target/site/surefire-report.html` file.
package ru.vik.documentviewsample

import ru.vik.documentview.DocumentView
import ru.vik.utils.color.Color
import ru.vik.utils.document.Border
import ru.vik.utils.document.CharacterStyle
import ru.vik.utils.document.Size
import ru.vik.utils.document.invoke
import ru.vik.utils.html.Tag
import ru.vik.utils.htmldocument.BaseHtmlDocument

fun htmlTest(documentView: DocumentView) {
    val htmlDocument = BaseHtmlDocument()

    documentView.document = htmlDocument
    documentView {
        document {
            borderStyle {
                horizontalPadding = Size.dp(8f)
                border = Border.px(1f, Color.BLACK)
                margin = Size.dp(4f)
            }

            baselineMode = DocumentView.Baseline.PARAGRAPH
//            baselineMode = DocumentView.Baseline.CHARACTERS
        }
    }

//    /* Пример 1 */
//    htmlDocument.text = """
//        Lorem <b>ipsum</b> <i>dolor</i> <b><i>sit</i></b> <u>amet</u>, <s>consectetur</s>
//        adipiscing <sup>elit</sup>, sed <sub>do</sub> eiusmod ...
//    """.trimIndent()

//    /* Примеры 1.2 - 1.4 */
//    htmlDocument {
//        /* Пример 1.2 */
//        tag("b") {
//            type = Tag.Type.CHARACTER
//            characterStyle {
//                bold = true
//            }
//        }

//        /* Пример 1.3 */
//        tag("i") {
//            type = Tag.Type.CHARACTER
//            characterStyle {
//                italic = true
//            }
//        }
//
//        /* Пример 1.4 */
//        tag("u") {
//            type = Tag.Type.CHARACTER
//            characterStyle {
//                underline = true
//            }
//        }
//
//        tag("s") {
//            type = Tag.Type.CHARACTER
//            characterStyle {
//                strike = true
//            }
//        }
//
//        tag("sup") {
//            type = Tag.Type.CHARACTER
//            characterStyle {
//                verticalAlign = CharacterStyle.VAlign.TOP
//                size = Size.em(0.58f)
//            }
//        }
//
//        tag("sub") {
//            type = Tag.Type.CHARACTER
//            characterStyle {
//                verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM
//                size = Size.em(0.58f)
//                leading = Size.ratio(1f)
//            }
//        }
//
//        htmlDocument.text = """
//            Lorem <b>ipsum</b> <i>dolor</i> <b><i>sit</i></b> <u>amet</u>, <s>consectetur</s>
//            adipiscing <sup>elit</sup>, sed <sub>do</sub> eiusmod ...
//        """.trimIndent()
//
//        tag("red") {
//            type = Tag.Type.CHARACTER
//            characterStyle {
//                color = Color.RED
//            }
//        }
//
//        tag("condensed") {
//            type = Tag.Type.CHARACTER
//            characterStyle {
//                scaleX = 0.6f
//            }
//        }
//
//        htmlDocument.text = """
//            <red>Lorem</red> <b>ipsum</b> <i>dolor</i> <b><i>sit</i></b> <u>amet</u>, <s>consectetur</s>
//            adipiscing <sup>elit</sup>, sed <sub>do</sub> <condensed>eiusmod</condensed> ...
//        """.trimIndent()

//    }

    /* Пример 2 */
    htmlDocument {
        tag("h1") {
            type = Tag.Type.PARAGRAPH

            characterStyle {
                size = Size.em(1.6f)
                bold = true
            }

            borderStyle {
                marginBottom = Size.dp(4f)
                borderBottom = Border.dp(1f, Color.LTGRAY)
            }
        }

        tag("div") {
            type = Tag.Type.SECTION

            borderStyle {
                border = Border.px(1f, Color.BLACK)
                margin = Size.dp(4f)
            }
        }

        tag("p") {
            type = Tag.Type.PARAGRAPH

            borderStyle {
                border = Border.px(1f, Color.BLACK)
                margin = Size.dp(4f)
                backgroundColor = Color.rgb(224, 255, 224)
            }

            paragraphStyle {
                spaceBefore = Size.em(1f)
                spaceAfter = Size.em(1f)
            }
        }

        text = """
            <h1>Lorem ipsum</h1>
            <div>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
                <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
            </div>
        """.trimIndent()
    }


//        _document.setText("<h1>Header 1</h1>\n" +
//                "<h2>Header 2</h2>\n" +
//                "<p>Sans_serif: $test</p>\n" +
//                "<p font='sans_serif2'>Sans_serif2: $test</p>\n" +
//                "<p font='serif'>Serif: $test</p>\n" +
//                "<p font='serif2'>Serif2: $test</p>\n" +
//                "<p font='mono'>Mono: $test</p>\n" +
//                "<p font='mono2'>Mono2: $test</p>\n" +
//                "<csl><red>П</red>рї\u00ADи\u00ADди́\u00ADте ко мнѣ̀ всѝ " +
//                "трꙋж\u00ADда́ю\u00ADщї\u00ADи\u00ADсѧ и҆ ѡ҆б\u00ADре\u00ADме\u00ADне́н\u00ADнїи, " +
//                "и҆ а҆́зъ оу҆по\u00ADко́ю вы̀. <red>В</red>оз\u00AD̾ми́\u00ADте и҆́го моѐ на се\u00ADбѐ, и҆ " +
//                "на\u00ADꙋ\u00ADчи́\u00ADте\u00ADсѧ ѿ ме\u00ADнѐ, ꙗ҆́кѡ кро́\u00ADтокъ є҆́смь и҆  " +
//                "сми\u00ADре́нъ се́рд\u00ADцемъ, и҆ ѡ҆б\u00ADрѧ́\u00ADще\u00ADте по\u00ADко́й " +
//                "дꙋ\u00ADша́мъ ва́\u00ADшымъ. <red>И҆́</red>го бо моѐ бла́\u00ADго, и҆ бре́\u00ADмѧ моѐ " +
//                "лег\u00ADко̀ є҆́сть.</csl>\n" +
//                "<p>Text<sup>sup</sup>, textBuilder<sub>sub</sub></p>\n" +
//                "<p>Text<sup>sup<sup>sup</sup></sup>, textBuilder<sub>sub<sub>sub</sub></sub></p>\n" +
//                "<p>Text<sup>sup<sub>sub<sup>sup<sub>sub</sub></sup></sub></sup>, " +
//                "textBuilder<sub>sub<sup>sup<sub>sub<sup>sup</sup></sub></sup></sub>.</p>\n" +
//                "<blockquote>«Наши люди в булочную на такси не ездят!»</blockquote>")

//
//        _document.addTag("h2", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.PARAGRAPH,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.size = Size.em(1.4f)
//                    characterStyle.bold = true
//                },
//                onSetBorderStyle = { tag, borderStyle ->
//                    borderStyle.marginBottom = Size.dp(8f)
//                    borderStyle.borderBottom = Border.dp(1f, Color.rgb(224, 224, 224))
//                }
//        ))
//
//
//        _document.addTag("csl", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.PARAGRAPH,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.font = "ponomar"
//                    characterStyle.scaleX = 0.85f
//                },
//                onSetParagraphStyle = { tag, paragraphStyle ->
//                    paragraphStyle.align = ParagraphStyle.Align.JUSTIFY
//                    paragraphStyle.firstLeftIndent = Size.em(2f)
//                },
//                onSetBorderStyle = { tag, borderStyle ->
//                    borderStyle.marginBottom = Size.dp(8f)
//                    borderStyle.setBorder(Border.dp(1f, Color.rgb(0x5B8930)))
//                    borderStyle.setPadding(topAndBottom = null, leftAndRight = Size.dp(4f))
//                    borderStyle.backgroundColor = Color.argb(64, 0x5B8930)
//                }
//        ))
//
//        _document.addTag("blockquote", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.PARAGRAPH,
//                onSetBorderStyle = { tag, borderStyle ->
//                    borderStyle.marginBottom = Size.dp(8f)
//                    borderStyle.marginLeft = Size.dp(16f)
//                    borderStyle.borderLeft = Border.dp(4f, Color.rgb(0xE08A1E))
//                    borderStyle.paddingLeft = Size.dp(16f)
//                    borderStyle.backgroundColor = Color.argb(64, 0xE08A1E)
//                },
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.backgroundColor = Color.rgb(64, 64, 64)
//                    characterStyle.italic = true
//                }
//        ))
//
//        val test = "Normal, <b>bold</b>, <i>italic</i>, <u>underline</u>, " +
//                "<s>strike</s>, <red>custom</red>."
//
//        _document.setText("<h1>Header 1</h1>\n" +
//                "<h2>Header 2</h2>\n" +
//                "<p>Sans_serif: $test</p>\n" +
//                "<p font='sans_serif2'>Sans_serif2: $test</p>\n" +
//                "<p font='serif'>Serif: $test</p>\n" +
//                "<p font='serif2'>Serif2: $test</p>\n" +
//                "<p font='mono'>Mono: $test</p>\n" +
//                "<p font='mono2'>Mono2: $test</p>\n" +
//                "<csl><red>П</red>рї\u00ADи\u00ADди́\u00ADте ко мнѣ̀ всѝ " +
//                "трꙋж\u00ADда́ю\u00ADщї\u00ADи\u00ADсѧ и҆ ѡ҆б\u00ADре\u00ADме\u00ADне́н\u00ADнїи, " +
//                "и҆ а҆́зъ оу҆по\u00ADко́ю вы̀. <red>В</red>оз\u00AD̾ми́\u00ADте и҆́го моѐ на се\u00ADбѐ, и҆ " +
//                "на\u00ADꙋ\u00ADчи́\u00ADте\u00ADсѧ ѿ ме\u00ADнѐ, ꙗ҆́кѡ кро́\u00ADтокъ є҆́смь и҆  " +
//                "сми\u00ADре́нъ се́рд\u00ADцемъ, и҆ ѡ҆б\u00ADрѧ́\u00ADще\u00ADте по\u00ADко́й " +
//                "дꙋ\u00ADша́мъ ва́\u00ADшымъ. <red>И҆́</red>го бо моѐ бла́\u00ADго, и҆ бре́\u00ADмѧ моѐ " +
//                "лег\u00ADко̀ є҆́сть.</csl>\n" +
//                "<p>Text<sup>sup</sup>, textBuilder<sub>sub</sub></p>\n" +
//                "<p>Text<sup>sup<sup>sup</sup></sup>, textBuilder<sub>sub<sub>sub</sub></sub></p>\n" +
//                "<p>Text<sup>sup<sub>sub<sup>sup<sub>sub</sub></sup></sub></sup>, " +
//                "textBuilder<sub>sub<sup>sup<sub>sub<sup>sup</sup></sub></sup></sub>.</p>\n" +
//                "<blockquote>«Наши люди в булочную на такси не ездят!»</blockquote>")

//        _document.getTagConfig("blockquote")?.let {
//            it.onSetBorderStyle = { tag, borderStyle ->
//                borderStyle.setSpace(Size.dp(8f), null, Size.dp(8f), Size.em(1f))
//                borderStyle.borderLeft = Border.dp(4f, Color.rgb(192, 192, 192))
//                borderStyle.paddingLeft = Size.em(1f)
//                borderStyle.backgroundColor = Color.rgb(224, 224, 224)
////                it.onSetBorderStyle?.invoke(tag, borderStyle)
//            }
//
//            it.onSetCharacterStyle = { tag, characterStyle ->
//                characterStyle.backgroundColor = Color.rgb(128, 128, 128)
//                characterStyle.italic = true
//                _document.setCharacterStyleFromAttributes(tag, characterStyle)
//            }
//        }

}
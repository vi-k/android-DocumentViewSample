package ru.vik.documentviewsample

import android.app.Activity
import android.graphics.Typeface
import ru.vik.documentview.DocumentView
import ru.vik.documentview.from
import ru.vik.utils.color.Color
import ru.vik.utils.document.*
import ru.vik.utils.font.Font
import ru.vik.utils.html.Tag
import ru.vik.utils.htmldocument.BaseHtmlDocument
import ru.vik.utils.htmldocument.toHtmlColor
import ru.vik.utils.htmldocument.toHtmlSize

fun htmlTest(activity: Activity, documentView: DocumentView) {
    val htmlDocument = BaseHtmlDocument()

    documentView.document = htmlDocument

    documentView {
        fontList {
            family("sans_serif") from Font(Typeface.SANS_SERIF)
            family("serif") from Font(Typeface.SERIF)
            family("mono") from Font(Typeface.MONOSPACE)

            font("ponomar") to Font(
                    Typeface.createFromAsset(activity.assets, "fonts/PonomarUnicode.ttf")!!,
                    hyphen = '_', // Символ переноса для старославянского языка
                    ascentRatio = 0.9f,
                    descentRatio = 0.9f,
                    scale = 1.2f)

            font("georgia") to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/georgia.ttf")!!)
            font("georgia", isBold = true) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/georgiab.ttf")!!)
            font("georgia", isItalic = true) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/georgiai.ttf")!!)
            font("georgia", isBold = true, isItalic = true) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/georgiaz.ttf")!!)

            font("segoeui", weight = 100) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/segoeuil.ttf")!!)
            font("segoeui", weight = 100, isItalic = true) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/seguili.ttf")!!)
            font("segoeui", weight = 250) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/segoeuisl.ttf")!!)
            font("segoeui", weight = 250, isItalic = true) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/seguisli.ttf")!!)
            font("segoeui", weight = 400) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/segoeui.ttf")!!)
            font("segoeui", weight = 400, isItalic = true) to Font(
                    Typeface.createFromAsset(activity.assets, "fonts/segoeuii.ttf")!!)
            font("segoeui", weight = 550) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/seguisb.ttf")!!)
            font("segoeui", weight = 550, isItalic = true) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/seguisbi.ttf")!!)
            font("segoeui", weight = 700) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/segoeuib.ttf")!!)
            font("segoeui", weight = 700, isItalic = true) to Font(
                    Typeface.createFromAsset(activity.assets, "fonts/segoeuiz.ttf")!!)
            font("segoeui", weight = 900) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/seguibl.ttf")!!)
            font("segoeui", weight = 900, isItalic = true) to
                    Font(Typeface.createFromAsset(activity.assets, "fonts/seguibli.ttf")!!)
        }

        document {
            borderStyle {
                horizontalPadding = Size.dp(8f)
                border = Border.px(1f, Color.BLACK)
                margin = Size.dp(4f)
            }

//            baselineMode = DocumentView.Baseline.SECTION
//            baselineMode = DocumentView.Baseline.PARAGRAPH
//            baselineMode = DocumentView.Baseline.CHARACTERS
        }
    }

//    /* Пример 1.1 */
//    htmlDocument.text = "Lorem <b>ipsum</b> <i>dolor</i> <b><i>sit</i></b> <u>amet</u>, " +
//            "<s>consectetur</s> adipiscing <sup>elit</sup>, sed <sub>do</sub> eiusmod ..."

//    /* Примеры 1.2-1.5 */
//    htmlDocument {
//
//        /* Пример 1.2 */
//        tag("b") {
//            type = Tag.Type.CHARACTER
//            characterStyle {
//                bold = true
//            }
//        }

//        /* Пример 1.3 (вместе с 1.2) */
//        tag("i") {
//            type = Tag.Type.CHARACTER
//            characterStyle {
//                isItalic = true
//            }
//        }

//        /* Пример 1.4 (вместе с 1.2 и 1.3) */
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

//        htmlDocument.text = "Lorem <b>ipsum</b> <i>dolor</i> <b><i>sit</i></b> <u>amet</u>, " +
//                "<s>consectetur</s> adipiscing <sup>elit</sup>, sed <sub>do</sub> eiusmod ..."

//        /* Пример 1.5 (вместе с 1.2, 1.3 и 1.4) */
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
//        htmlDocument.text = "<red>Lorem</red> <b>ipsum</b> <i>dolor</i> <b><i>sit</i></b> " +
//                "<u>amet</u>, <s>consectetur</s> adipiscing <sup>elit</sup>, sed <sub>do</sub> " +
//                "<condensed>eiusmod</condensed> ..."

//    }


//    /* Примеры 2.1-2.2 */
//    htmlDocument {
//        /* Пример 2.1 */
//        tag("h1") {
//            type = Tag.Type.PARAGRAPH
//            characterStyle {
//                size = Size.em(2f)
//                bold = true
//            }
//            paragraphStyle {
//                spaceBefore = Size.em(0.67f)
//                spaceAfter = Size.em(0.67f)
//            }
//        }
//
//        tag("h2") {
//            type = Tag.Type.PARAGRAPH
//            characterStyle {
//                size = Size.em(1.5f)
//                bold = true
//            }
//            paragraphStyle {
//                spaceBefore = Size.em(0.83f)
//                spaceAfter = Size.em(0.83f)
//            }
//        }
//
//        tag("h3") {
//            type = Tag.Type.PARAGRAPH
//            characterStyle {
//                size = Size.em(1.17f)
//                bold = true
//            }
//            paragraphStyle {
//                spaceBefore = Size.em(1f)
//                spaceAfter = Size.em(1f)
//            }
//        }
//
//        tag("p") {
//            type = Tag.Type.PARAGRAPH
//            paragraphStyle {
//                spaceBefore = Size.em(1f)
//                spaceAfter = Size.em(1f)
//            }
//        }

//        /* Пример 2.2 */
//        characterStyle {
//            size = Size.pt(8f)
//            font = "sans_serif"
//        }
//
//        paragraphStyle {
//            firstLeftIndent = Size.pt(16f)
//            spaceBefore = Size.pt(4f)
//            spaceAfter = Size.pt(4f)
//        }
//
//        tag("h1") {
//            type = Tag.Type.PARAGRAPH
//            characterStyle {
//                size = Size.pt(16f)
//                bold = true
//                font = "serif"
//            }
//            paragraphStyle {
//                spaceBefore = Size.pt(12f)
//                spaceAfter = Size.pt(12f)
//            }
//        }
//
//        tag("h2") {
//            type = Tag.Type.PARAGRAPH
//            characterStyle {
//                size = Size.pt(12f)
//                bold = true
//                font = "serif"
//            }
//            paragraphStyle {
//                spaceBefore = Size.pt(8f)
//                spaceAfter = Size.pt(8f)
//            }
//        }
//
//        tag("h3") {
//            type = Tag.Type.PARAGRAPH
//            characterStyle {
//                size = Size.pt(8f)
//                bold = true
//                font = "serif"
//            }
//        }
//
//        tag("p") {
//            type = Tag.Type.PARAGRAPH
//        }

//        text = """
//            <h1>Lorem ipsum</h1>
//            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
//            <h2>Ut enim</h2>
//            <p>Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
//            <h3>Duis aute</h3>
//            <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
//            <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
//        """.trimIndent()
//    }


//    /* Пример 3 */
//    htmlDocument {
//        tag("p") {
//            type = Tag.Type.PARAGRAPH
//        }
//
//        tag("div") {
//            type = Tag.Type.SECTION
//            characterStyle {
//                isItalic = true
//                font = "serif"
//            }
//            paragraphStyle {
//                spaceBefore = Size.em(0.5f)
//                spaceAfter = Size.em(0.5f)
//            }
//            borderStyle {
//                horizontalPadding = Size.em(1f)
//                border = Border.dp(1f, Color.rgb(0x22A7F0))
//                verticalMargin = Size.mm(2f)
//            }
//        }
//
//        tag("div2") {
//            type = Tag.Type.SECTION
//            characterStyle {
//                font = "sans_serif"
//                color = Color.GRAY
//            }
//            paragraphStyle {
//                firstLeftIndent = Size.em(2f)
//                align = ParagraphStyle.Align.JUSTIFY
//            }
//            borderStyle {
//                marginLeft = Size.dp(16f)
//                borderLeft = Border.dp(8f, Color.LTGRAY)
//                paddingLeft = Size.dp(16f)
//                verticalMargin = Size.mm(2f)
//            }
//        }
//
//        tag("br") {
//            type = Tag.Type.BR
//        }
//
//        text = """
//            <div>
//                <p>Lorem<br> ipsum dolor<br> sit amet, consecte-<br>tur adipiscing elit, sed do<br> eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
//                <p>Ut enim ad minim veniam, quis<br> nostrud exercitation ullamco<br> laboris nisi ut aliquip<br> ex ea commodo<br> consequat.</p>
//            </div>
//            <div2>
//                <p>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.</p>
//                <p>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
//            </div2>
//        """.trimIndent()
//    }


//    /* Примеры 4.1-4.3 */
//    htmlDocument {
//        tag("font") {
//            type = Tag.Type.CHARACTER

//            /* Пример 4.1 */
//            characterStyle { tag ->
//                tag.attributes["color"]?.toHtmlColor()?.also { color = it }
//                tag.attributes["size"]?.toHtmlSize(allowPercent = true)?.also { size = it }
//                tag.attributes["face"]?.also { font = it }
//            }

//            /* Пример 4.2 */
//            attr("color") {
//                characterStyle { value ->
//                    value.toHtmlColor()?.also { color = it }
//                }
//            }
//
//            attr("size") {
//                characterStyle { value ->
//                    value.toHtmlSize()?.also { this.size = it }
//                }
//            }
//
//            attr("face") {
//                characterStyle { value ->
//                    value.also { font = it }
//                }
//            }

//        }

//        /* Пример 4.3 */
//        attr("color", "font") {
//            characterStyle { value ->
//                value.toHtmlColor()?.also { color = it }
//            }
//        }
//        attr("size", "font") {
//            characterStyle { value ->
//                value.toHtmlSize()?.also { this.size = it }
//            }
//        }
//        attr("face", "font") {
//            characterStyle { value ->
//                value.also { font = it }
//            }
//        }
//
//        tag("span") {
//            type = Tag.Type.CHARACTER
//        }

//        htmlDocument.text = "<font color='#ff0000'>Lorem</font> " +
//                "<font color='#0f0'>ipsum</font> " +
//                "<font color='rgb(0,0,255)'>dolor</font> " +
//                "<font color='rgba(0,0,0,0.5)'>sit</font> " +
//                "<font size='1.75em'>amet</font>, " +
//                "<font size='24px'>consectetur</font> " +
//                "<font size='125%'>adipiscing</font> " +
//                "elit, " +
//                "<font face='mono'>sed do eiusmod</font> " +
//                "<font face='georgia'>tempor incididunt ut labore</font> " +
//                "<span color='#f00' size='2em' face='sans_serif'>et dolore magna aliqua</span>."
//    }


//    /* Пример 5 */
//    htmlDocument {
//        tag("p") {
//            type = Tag.Type.PARAGRAPH
//        }
//
//        tag("div") {
//            type = Tag.Type.SECTION
//        }
//
//        tag("div2") {
//            type = Tag.Type.SECTION
//        }
//
//        attr("align", "h1", "h2", "h3", "h4", "h5", "h6", "div", "p") {
//            paragraphStyle { value ->
//                when (value) {
//                    "left" -> align = ParagraphStyle.Align.LEFT
//                    "center" -> align = ParagraphStyle.Align.CENTER
//                    "right" -> align = ParagraphStyle.Align.RIGHT
//                    "justify" -> align = ParagraphStyle.Align.JUSTIFY
//                }
//            }
//        }
//
//        attr("lang") {
//            characterStyle { value ->
//                if (value == "csl") font = "ponomar"
//            }
//        }
//
//        htmlDocument.text = """
//            <div align='center'>
//                <p>In the centre.</p>
//                <p lang='csl'>Посредѣ̀.</p>
//            </div>
//            <div align='right'>
//                <p>On the right.</p>
//                <p lang='csl'>Ѡ҆деснѹ́ю.</p>
//            </div>
//            <div2 align='center'>
//                <p>On the left. Not in the centre.</p>
//                <p lang='csl'>Ѡ҆шѹ́юю, а҆  не посредѣ̀.</p>
//            </div2>
//        """.trimIndent()
//    }


    /* Пример 6 */
    htmlDocument {
//        tag("br") {
//            type = Tag.Type.BR
//        }
//
//        tag("div") {
//            type = Tag.Type.SECTION
//        }

        tag("p") {
            type = Tag.Type.PARAGRAPH
        }

        tag("span") {
            type = Tag.Type.CHARACTER
        }

        htmlDocument.text = "<span style='color: rgb(255,0,0); font-size: 0.8em; font-style: isItalic; font-weight: bold'>Lorem ipsum dolor <b><i>sit</i></b> " +
                "<u>amet</u>, <s>consectetur</s> adipiscing <sup>elit</sup>, sed <sub>do</sub> " +
                "<condensed>eiusmod</condensed> ..."
    }
}

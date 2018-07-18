package ru.vik.documentviewsample

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ru.vik.documentview.DocumentView
import ru.vik.documentview.Font
import ru.vik.documentview.FontList
import ru.vik.utils.color.Color
import ru.vik.utils.document.*

class MainActivity : AppCompatActivity() {

//    private lateinit var docView: DocumentView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val docView: DocumentView = findViewById(R.id.docView)

//        /* Пример 1 - Простой пример */
//        docView.document.setText(
//                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ...")
//        docView.document
//                .addSpan(0, 5, CharacterStyle(color = Color.RED))
//                .addSpan(6, 11, CharacterStyle(bold = true))
//                .addSpan(12, 17, CharacterStyle(italic = true))
//                .addSpan(18, 21, CharacterStyle(bold = true, italic = true))
//                .addSpan(22, 26, CharacterStyle(underline = true))
//                .addSpan(28, 39, CharacterStyle(strike = true))
//                .addSpan(50, 55, CharacterStyle(baselineShift = Size.em(-0.4f),
//                        size = Size.em(0.85f)))
//                .addSpan(60, 63, CharacterStyle(baselineShift = Size.em(0.25f),
//                        size = Size.em(0.85f)))
//                .addSpan(64, 71, CharacterStyle(scaleX = 0.6f))

//        /* Пример 1.2 */
//        docView.document
//                .addWordSpan(1, CharacterStyle(color = Color.RED))
//                .addWordSpan(2, CharacterStyle(bold = true))
//                .addWordSpan(3, CharacterStyle(italic = true))
//                .addWordSpan(4, CharacterStyle(bold = true, italic = true))
//                .addWordSpan(5, CharacterStyle(underline = true))
//                .addWordSpan(6, CharacterStyle(strike = true))
//                .addWordSpan(8, CharacterStyle(
//                        baselineShift = Size.em(-0.4f), size = Size.em(0.85f)))
//                .addWordSpan(10, CharacterStyle(
//                        baselineShift = Size.em(0.25f), size = Size.em(0.85f)))
//                .addWordSpan(11, CharacterStyle(scaleX = 0.6f))

//        /* Пример 2 */
//        docView.document.setText("Lorem ipsum dolor sit amet ...")
//        docView.document
//                .addWordSpan(1, 3, CharacterStyle(bold = true))
//                .addWordSpan(3, 3, CharacterStyle(italic = true))

//        /* Пример 2.2 */
//        docView.document
//                .addWordSpan(1, 3, CharacterStyle(color = Color.RED))
//                .addWordSpan(3, -1, CharacterStyle(color = Color.GREEN))

//        /* Пример 3 - Абзацы */
//        docView.document.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed " +
//                "do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n" +
//                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
//                "aliquip ex ea commodo consequat.\n" +
//                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
//                "eu fugiat nulla pariatur.")
//        docView.document[0]
//                .addSpan(0, 1, CharacterStyle(color = Color.RED))
//        docView.document[1]
//                .addSpan(0, 1, CharacterStyle(color = Color.RED))
//        docView.document[2]
//                .addSpan(0, 1, CharacterStyle(color = Color.RED))

//        /* Пример 3.2 */
//        docView.document[0].characterStyle.italic = true
//        docView.document[1].characterStyle.size = Size.em(0.8f)
//        docView.document[2].characterStyle.color = Color.GRAY

//        /* Пример 4 - Шрифты (вместе с примером 3 без 3.2) */
//        docView.fontList.createFamily("sans_serif", Font(Typeface.SANS_SERIF))
//        docView.fontList.createFamily("serif", Font(Typeface.SERIF))
//        docView.fontList.createFamily("mono", Font(Typeface.MONOSPACE))
//
//        docView.document[0].characterStyle.font = "sans_serif"
//        docView.document[1].characterStyle.font = "serif"
//        docView.document[2].characterStyle.font = "mono"

//        /* Пример 5 */
//        docView.document.setText("Lorem ipsum dolor sit amet ...\n" +
//                "Lorem ipsum dolor sit amet ...")
//        docView.document[0]
//                .addWordSpan(1, 3, CharacterStyle(bold = true))
//                .addWordSpan(3, 3, CharacterStyle(italic = true))
//        docView.document[1]
//                .addWordSpan(1, 3, CharacterStyle(bold = true))
//                .addWordSpan(3, 3, CharacterStyle(italic = true))
//
//        docView.fontList.createFamily("serif1", Font(Typeface.SERIF))
//        docView.fontList["serif2"] = Font(Typeface.SERIF)
////        docView.fontList["serif2:bold"] = Font(Typeface.create(Typeface.SERIF, Typeface.BOLD))
////        docView.fontList["serif2:italic"] = Font(Typeface.create(Typeface.SERIF, Typeface.ITALIC))
////        docView.fontList["serif2:bold_italic"] = Font(Typeface.create(Typeface.SERIF, Typeface.BOLD_ITALIC))
//
//        docView.document[0].characterStyle.font = "serif1"
//        docView.document[1].characterStyle.font = "serif2"

//        /* Пример 6 */
//        val fontList = FontList()
//        fontList["georgia"] = Font(Typeface.createFromAsset(this.assets, "fonts/georgia.ttf")!!)
//        fontList["georgia:bold"] =
//                Font(Typeface.createFromAsset(this.assets, "fonts/georgiab.ttf")!!)
//        fontList["georgia:italic"] =
//                Font(Typeface.createFromAsset(this.assets, "fonts/georgiai.ttf")!!)
//        fontList["georgia:bold_italic"] =
//                Font(Typeface.createFromAsset(this.assets, "fonts/georgiaz.ttf")!!)
//
//        docView.fontList = fontList
//        docView.document.characterStyle.font = "georgia"
//
//        docView.document.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed " +
//                "do eiusmod tempor incididunt ut labore et dolore magna aliqua.")
//        docView.document
//                .addWordSpan(6, 8, CharacterStyle(bold = true))
//                .addWordSpan(9, -1, CharacterStyle(italic = true))

//        /* Пример 7 - Рамки */
//        docView.document.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed " +
//                "do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n" +
//                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
//                "aliquip ex ea commodo consequat.\n" +
//                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
//                "eu fugiat nulla pariatur.")
//        docView.document[0].borderStyle
//                .setPadding(Size.dp(8f))
//                .setBorder(Border.dp(1f, Color.rgb(0xDC3023)))
//                .setMargin(Size.dp(8f))
//                .setBackgroundColor(Color.argb(0.1f, 0xDC3023))
//        docView.document[1].borderStyle
//                .setPadding(Size.dp(8f))
//                .setBorder(Border.dp(1f, Color.rgb(0x22A7F0)))
//                .setMargin(Size.dp(8f))
//                .setBackgroundColor(Color.argb(0.1f, 0x22A7F0))
//        docView.document[2].borderStyle
//                .setPadding(Size.dp(8f))
//                .setBorder(Border.dp(1f, Color.rgb(0x26C281)))
//                .setMargin(Size.dp(8f))
//                .setBackgroundColor(Color.argb(0.1f, 0x26C281))

//        /* Пример 7.2 */
//        docView.document.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed " +
//                "do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n" +
//                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut " +
//                "aliquip ex ea commodo consequat.\n" +
//                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
//                "eu fugiat nulla pariatur.")
//        docView.document[0].borderStyle
//                .setPadding(Size.dp(8f))
//                .setBorderTop(Border.dp(8f, Color.rgb(0xDC3023)))
//                .setBorderRight(Border.dp(8f, Color.rgb(0x22A7F0)))
//                .setBorderBottom(Border.dp(8f, Color.rgb(0x26C281)))
//                .setBorderLeft(Border.dp(8f, Color.rgb(0x9B59B6)))
//                .setMargin(Size.dp(4f))
//                .setBackgroundColor(Color.argb(0.2f, 0xDC3023))
//        docView.document[1].borderStyle
//                .setPadding(Size.dp(8f))
//                .setBorderLeft(Border.dp(8f, Color.rgb(0x22A7F0)))
//                .setMargin(Size.dp(4f))
//                .setBackgroundColor(Color.argb(0.2f, 0x22A7F0))
//        docView.document[2].borderStyle
//                .setPadding(Size.dp(8f))
//                .setBorder(
//                        Border.dp(8f, Color.TRANSPARENT),
//                        Border.dp(8f, Color.rgb(0x26C281)))
//                .setMargin(Size.dp(4f))
//                .setBackgroundColor(Color.argb(0.2f, 0x26C281))
//
//        docView.document.borderStyle
//                .setPadding(Size.dp(4f))
//                .setBorder(Border.dp(4.0f, Color.rgb(0xF9690E)))
//                .setMargin(Size.dp(4f))
//                .setBackgroundColor(Color.argb(0.1f, 0xF9690E))

//        /* Пример 8 - Оформление абзацев */
//        docView.document.setText("Lorem ipsum\n" +
//                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
//                "tempor incididunt ut labore et dolore magna aliqua.\n" +
//                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
//                "ut aliquip ex ea commodo consequat.\n" +
//                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
//                "eu fugiat nulla pariatur.\n" +
//                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia " +
//                "deserunt mollit anim id est laborum.")
//
////        /* Пример 10 */
////        val string = "Lorem ipsum\n" +
////                "Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, sed do " +
////                "eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua.\n" +
////                "Ut enim ad mi~nim ve~niam, qu~is nos~t~rud exer~ci~ta~tion ul~lam~co la~bo~ris " +
////                "ni~si ut ali~qu~ip ex ea com~mo~do con~se~quat.\n" +
////                "Duis aute iru~re do~lor in rep~re~hen~de~rit in vo~lup~ta~te ve~lit es~se " +
////                "cil~lum do~lo~re eu fu~gi~at nul~la pa~ria~tur.\n" +
////                "Ex~cep~te~ur sint oc~cae~cat cu~pi~da~tat non pro~i~dent, sunt in cul~pa qui " +
////                "of~fi~cia de~se~runt mol~lit anim id est la~bo~rum."
////        docView.document.setText(string.replace('~', '\u00AD'))
//
//        docView.document.characterStyle
//                .setSize(Size.percent(120f))
//        docView.document.paragraphStyle
//                .setTopIndent(Size.dp(8f)) // Отступ сверху, общий для всех абзацев
//
//        docView.document[0].characterStyle
//                .setSize(Size.em(2f))
//        docView.document[0].paragraphStyle
//                .setAlign(ParagraphStyle.Align.CENTER)
//                .setTopIndent(Size.dp(0f))
//        docView.document[0].borderStyle
//                .setBorderBottom(Border.dp(1f, Color.LTGRAY))
//                .setMarginBottom(Size.dp(4f))
//        docView.document[1].paragraphStyle
//                .setAlign(ParagraphStyle.Align.LEFT)
//                .setFirstLeftIndent(Size.em(2f))
//        docView.document[2].paragraphStyle
//                .setAlign(ParagraphStyle.Align.RIGHT)
//        docView.document[3].paragraphStyle
//                .setAlign(ParagraphStyle.Align.JUSTIFY)
//        docView.document[4].paragraphStyle
//                .setAlign(ParagraphStyle.Align.JUSTIFY)
//                .setLastAlign(ParagraphStyle.Align.CENTER)

//        /* Пример 8.2 */
//        docView.document.setText("Куда ещё тянется провод\u2028из гроба того?\n" +
//                "Нет, Сталин не умер. Считает он смерть поправимостью.\n" +
//                "Мы вынесли из мавзолея его.\n" +
//                "Но как из наследников Сталина Сталина вынести?")
//
//        docView.document.characterStyle
//                .setFont("georgia")
//                .setItalic(true)
//
//        docView.document.paragraphStyle
//                .setLeftIndent(Size.em(2f))
//                .setFirstLeftIndent(Size.em(-2f))
//                .setFirstAlign(ParagraphStyle.Align.LEFT)
//                .setAlign(ParagraphStyle.Align.RIGHT)


//        // Пример 9 - коррекция шрифтов
//        docView.fontList["ponomar"] = Font(
//                typeface = Typeface.createFromAsset(this.assets, "fonts/PonomarUnicode.ttf")!!,
//                hyphen = '_',
//                scale = 1.2f)
//
//        docView.fontList.createFamily("serif", Font(Typeface.SERIF))
//        docView.fontList["ponomar"] = Font(
//                typeface = Typeface.createFromAsset(this.assets, "fonts/PonomarUnicode.ttf")!!)
//        docView.fontList["ponomar"] = Font(
//                typeface = Typeface.createFromAsset(this.assets, "fonts/PonomarUnicode.ttf")!!,
//                scale = 1.2f)
//        docView.fontList["ponomar"] = Font(
//                typeface = Typeface.createFromAsset(this.assets, "fonts/PonomarUnicode.ttf")!!,
//                ascentRatio = 0.8f,
//                descentRatio = 0.8f,
//                scale = 1.2f)
//
//        docView.document.setText("В начале сотворил Бог - Въ нача́лѣ сотворѝ бг҃ъ")
//        docView.document.addWordSpan(1, 4, CharacterStyle(font = "serif"))
//        docView.document.addWordSpan(5, -1, CharacterStyle(font = "ponomar"))

//        // Пример 10.2
//        docView.fontList["ponomar"] = Font(
//                typeface = Typeface.createFromAsset(this.assets, "fonts/PonomarUnicode.ttf")!!,
//                hyphen = '_',
//                ascentRatio = 0.9f,
//                descentRatio = 0.9f,
//                scale = 1.2f)
//
//        val text =
//                "Прї~и~ди́~те ко мнѣ̀ всѝ трꙋж~да́ю~щї~и~сѧ и҆ ѡ҆б~ре~ме~не́н~нїи, и҆ а҆́зъ " +
//                        "оу҆по~ко́ю вы̀. Воз̾~ми́~те и҆́го моѐ на се~бѐ, и҆ на~ꙋ~чи́~те~сѧ ѿ ме~нѐ, ꙗ҆́кѡ " +
//                        "кро́~токъ є҆́смь и҆ сми~ре́нъ се́рд~цемъ, и҆ ѡ҆б~рѧ́~ще~те по~ко́й дꙋ~ша́мъ " +
//                        "ва́~шымъ. И҆́го бо моѐ бла́~го, и҆ бре́~мѧ моѐ лег~ко̀ є҆́сть."
//        docView.document.setText(text.replace('~', '\u00AD'))
//        docView.document.characterStyle.font = "ponomar"
//        docView.document.paragraphStyle
//                .setFirstLeftIndent(Size.em(1f))
//                .setAlign(ParagraphStyle.Align.JUSTIFY)
//        docView.document.addSpan(0, 1, CharacterStyle(color = Color.RED))

//        /* Пример 11 - базовые линии */
//        val string = "Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, " +
//                "sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua."
//        docView.document.setText(string.replace('~', '\u00AD'))
//
//        docView.baselineMode = DocumentView.Baseline.PARAGRAPH

        /* Пример 11.2 */
        val string = "Lorem ipsum\n" +
                "Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, sed do " +
                "eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua.\n" +
                "Ut enim ad mi~nim ve~niam, qu~is nos~t~rud exer~ci~ta~tion ul~lam~co la~bo~ris " +
                "ni~si ut ali~qu~ip ex ea com~mo~do con~se~quat.\n" +
                "Duis1 aute2 iru~re3 do~lor4 in5 rep~re~hen~de~rit6 in7 vo~lup~ta~te8 ve~lit9 es~se10 " +
                "cil~lum11 do~lo~re12 eu13 fu~gi~at14 nul~la15 pa~ria~tur16.\n" +
                "Ex~cep~te~ur sint oc~cae~cat cu~pi~da~tat non pro~i~dent, sunt in cul~pa* qui " +
                "of~fi~cia de~se~runt mol~lit anim id est la~bo~rum."
        docView.document.setText(string.replace('~', '\u00AD'))

        docView.baselineMode = DocumentView.Baseline.VIEW
        docView.baselineColor = Color.rgb(0x4B77BE)

        docView.document.characterStyle
                .setSize(Size.dp(18f))
        docView.document.paragraphStyle
                .setAlign(ParagraphStyle.Align.JUSTIFY)
                .setFirstLeftIndent(Size.dp(24f))

        docView.document[0].characterStyle
                .setSize(Size.em(1.6f))
        docView.document[0].paragraphStyle
                .setAlign(ParagraphStyle.Align.CENTER)
                .setFirstLeftIndent(Size.dp(0f))
                .setTopIndent(Size.dp(0f))
                .setBottomIndent(Size.em(0.5f))
        docView.document[1].paragraphStyle
                .setFirstLeftIndent(Size.em(0f))

//        docView.document[2]
//                .addWordSpan(10, CharacterStyle(
//                        size = Size.em(1.4f)))
//        docView.document[3]
//                .addSpan(Regex("""\d+"""), -1, CharacterStyle(
//                        baselineShift = Size.em(0.25f),
//                        size = Size.em(0.7f)))
//        docView.document[4]
//                .addSpan(Regex("""\*"""), CharacterStyle(
//                        baselineShift = Size.em(-0.4f),
//                        size = Size.em(0.85f)))

        // Пример 11.3
        docView.document[2]
                .addWordSpan(10, CharacterStyle(
                        size = Size.em(1.4f)))
        docView.document[3]
                .addSpan(Regex("""\d+"""), CharacterStyle(
                        verticalAlign = CharacterStyle.VAlign.BOTTOM,
                        size = Size.em(0.6f)))
        docView.document[4]
                .addSpan(Regex("""\*"""), CharacterStyle(
                        verticalAlign = CharacterStyle.VAlign.TOP,
                        size = Size.em(0.7f)))

        docView.document.borderStyle
                .setPadding(Size.dp(8f))
                .setBorder(Border.px(1.0f, Color.BLACK))
                .setMargin(Size.dp(4f))



//        document.addTag("h1", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.PARAGRAPH,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.size = Size.em(1.6f)
//                    characterStyle.bold = true
//                },
//                onSetBorderStyle = { tag, borderStyle ->
//                    borderStyle.marginBottom = Size.dp(8f)
//                    borderStyle.borderBottom = Border.dp(1f, Color.rgb(224, 224, 224))
//                }
//        ))
//
//        document.addTag("h2", BaseHtmlDocument.TagConfig(
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
//        document.addTag("p", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.PARAGRAPH,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    tag.attributes["font"]?.let {
//                        characterStyle.font = it
//                    }
//                    tag.attributes["lang"]?.let {
//                        if (it == "csl") {
//                            characterStyle.font = it
//                            characterStyle.scaleX = 0.85f
//                        }
//                    }
//                },
//                onSetBorderStyle = { tag, borderStyle ->
//                    borderStyle.marginBottom = Size.dp(8f)
//                }
//        ))
//
//        document.addTag("csl", BaseHtmlDocument.TagConfig(
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
//        document.addTag("blockquote", BaseHtmlDocument.TagConfig(
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
//        document.addTag("b", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.bold = true
//                }
//        ))
//
//        document.addTag("i", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.italic = true
//                }
//        ))
//
//        document.addTag("u", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.underline = true
//                }
//        ))
//
//        document.addTag("s", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.strike = true
//                }
//        ))
//
//        document.addTag("sup", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.size = Size.em(0.85f)
//                    characterStyle.baselineShift = Size.em(0.25f)
//                }
//        ))
//
//        document.addTag("sub", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.size = Size.em(0.85f)
//                    characterStyle.baselineShift = Size.em(-0.4f)
//                }
//        ))
//
//        document.addTag("red", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.backgroundColor = Color.rgb(0xF22613)
//                }
//        ))
//
//        val test = "Normal, <b>bold</b>, <i>italic</i>, <u>underline</u>, " +
//                "<s>strike</s>, <red>custom</red>."
//
//        document.setText("<h1>Header 1</h1>\n" +
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

//        document.getTagConfig("blockquote")?.let {
//            it.onSetBorderStyle = { tag, borderStyle ->
//                borderStyle.setMargin(Size.dp(8f), null, Size.dp(8f), Size.em(1f))
//                borderStyle.borderLeft = Border.dp(4f, Color.rgb(192, 192, 192))
//                borderStyle.paddingLeft = Size.em(1f)
//                borderStyle.backgroundColor = Color.rgb(224, 224, 224)
////                it.onSetBorderStyle?.invoke(tag, borderStyle)
//            }
//
//            it.onSetCharacterStyle = { tag, characterStyle ->
//                characterStyle.backgroundColor = Color.rgb(128, 128, 128)
//                characterStyle.italic = true
//                document.setCharacterStyleFromAttributes(tag, characterStyle)
//            }
//        }
    }
}

package ru.vik.documentviewsample

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ru.vik.documentview.DocumentView
import ru.vik.documentview.Font
import ru.vik.documentview.FontList
import ru.vik.utils.color.Color
import ru.vik.utils.document.Border
import ru.vik.utils.document.ParagraphStyle
import ru.vik.utils.document.Size
import ru.vik.utils.html.Tag
import ru.vik.utils.htmldocument.BaseHtmlDocument

class MainActivity : AppCompatActivity() {

    private lateinit var docView: DocumentView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        docView = findViewById(R.id.docView)
        //docView.baselineMode = DocumentView.Baseline.INDENT

        val fontList = FontList()
        fontList.createFamily("sans_serif", Font(Typeface.SANS_SERIF))
        fontList["sans_serif2"] = Font(Typeface.SANS_SERIF)

        fontList.createFamily("serif", Font(Typeface.SERIF))
        fontList["serif2"] = Font(Typeface.SERIF)

        fontList.createFamily("mono", Font(Typeface.MONOSPACE))
        fontList["mono2"] = Font(Typeface.MONOSPACE)

        fontList["ponomar"] = Font(
                typeface = Typeface.createFromAsset(this.assets, "fonts/PonomarUnicode.ttf")!!,
                hyphen = '_',
                scale = 1.2f)

        docView.fontList = fontList
        docView.characterStyle.font = "sans_serif"
        docView.characterStyle.size = Size.dp(16f)
//        docView.characterStyle.scaleX = 0.85f

        val document = BaseHtmlDocument()
//        val document = SimpleHtmlDocument()
        docView.document = document

        document.blockStyle.setPadding(Size.dp(4f))

        document.addTag("h1", BaseHtmlDocument.TagConfig(
                type = Tag.Type.PARAGRAPH,
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.size = Size.em(1.6f)
                    characterStyle.bold = true
                },
                onSetBlockStyle = { tag, blockStyle ->
                    blockStyle.marginBottom = Size.dp(8f)
                    blockStyle.borderBottom = Border.dp(1f, Color.rgb(224, 224, 224))
                }
        ))

        document.addTag("h2", BaseHtmlDocument.TagConfig(
                type = Tag.Type.PARAGRAPH,
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.size = Size.em(1.4f)
                    characterStyle.bold = true
                },
                onSetBlockStyle = { tag, blockStyle ->
                    blockStyle.marginBottom = Size.dp(8f)
                    blockStyle.borderBottom = Border.dp(1f, Color.rgb(224, 224, 224))
                }
        ))

        document.addTag("p", BaseHtmlDocument.TagConfig(
                type = Tag.Type.PARAGRAPH,
                onSetCharacterStyle = { tag, characterStyle ->
                    tag.attributes["font"]?.let {
                        characterStyle.font = it
                    }
                    tag.attributes["lang"]?.let {
                        if (it == "csl") {
                            characterStyle.font = it
                            characterStyle.scaleX = 0.85f
                        }
                    }
                },
                onSetBlockStyle = { tag, blockStyle ->
                    blockStyle.marginBottom = Size.dp(8f)
                }
        ))

        document.addTag("csl", BaseHtmlDocument.TagConfig(
                type = Tag.Type.PARAGRAPH,
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.font = "ponomar"
                    characterStyle.scaleX = 0.85f
                },
                onSetParagraphStyle = { tag, paragraphStyle ->
                    paragraphStyle.align = ParagraphStyle.Align.JUSTIFY
                    paragraphStyle.firstLeftIndent = Size.em(2f)
                },
                onSetBlockStyle = { tag, blockStyle ->
                    blockStyle.marginBottom = Size.dp(8f)
                    blockStyle.setBorder(Border.dp(1f, Color.rgb(0x5B8930)))
                    blockStyle.setPadding(topAndBottom = null, leftAndRight = Size.dp(4f))
                    blockStyle.color = Color.argb(64, 0x5B8930)
                }
        ))

        document.addTag("blockquote", BaseHtmlDocument.TagConfig(
                type = Tag.Type.PARAGRAPH,
                onSetBlockStyle = { tag, blockStyle ->
                    blockStyle.marginBottom = Size.dp(8f)
                    blockStyle.marginLeft = Size.dp(16f)
                    blockStyle.borderLeft = Border.dp(4f, Color.rgb(0xE08A1E))
                    blockStyle.paddingLeft = Size.dp(16f)
                    blockStyle.color = Color.argb(64, 0xE08A1E)
                },
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.color = Color.rgb(64, 64, 64)
                    characterStyle.italic = true
                }
        ))

        document.addTag("b", BaseHtmlDocument.TagConfig(
                type = Tag.Type.CHARACTER,
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.bold = true
                }
        ))

        document.addTag("i", BaseHtmlDocument.TagConfig(
                type = Tag.Type.CHARACTER,
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.italic = true
                }
        ))

        document.addTag("u", BaseHtmlDocument.TagConfig(
                type = Tag.Type.CHARACTER,
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.underline = true
                }
        ))

        document.addTag("s", BaseHtmlDocument.TagConfig(
                type = Tag.Type.CHARACTER,
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.strike = true
                }
        ))

        document.addTag("sup", BaseHtmlDocument.TagConfig(
                type = Tag.Type.CHARACTER,
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.size = Size.em(0.85f)
                    characterStyle.baselineShift = Size.em(0.25f)
                }
        ))

        document.addTag("sub", BaseHtmlDocument.TagConfig(
                type = Tag.Type.CHARACTER,
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.size = Size.em(0.85f)
                    characterStyle.baselineShift = Size.em(-0.4f)
                }
        ))

        document.addTag("red", BaseHtmlDocument.TagConfig(
                type = Tag.Type.CHARACTER,
                onSetCharacterStyle = { tag, characterStyle ->
                    characterStyle.color = Color.rgb(0xF22613)
                }
        ))

        val test = "Normal, <b>bold</b>, <i>italic</i>, <u>underline</u>, " +
                "<s>strike</s>, <red>custom</red>."

        document.setText("<h1>Header 1</h1>\n" +
                "<h2>Header 2</h2>\n" +
                "<p>Sans_serif: $test</p>\n" +
                "<p font='sans_serif2'>Sans_serif2: $test</p>\n" +
                "<p font='serif'>Serif: $test</p>\n" +
                "<p font='serif2'>Serif2: $test</p>\n" +
                "<p font='mono'>Mono: $test</p>\n" +
                "<p font='mono2'>Mono2: $test</p>\n" +
                "<csl><red>П</red>рї\u00ADи\u00ADди́\u00ADте ко мнѣ̀ всѝ " +
                "трꙋж\u00ADда́ю\u00ADщї\u00ADи\u00ADсѧ и҆ ѡ҆б\u00ADре\u00ADме\u00ADне́н\u00ADнїи, " +
                "и҆ а҆́зъ оу҆по\u00ADко́ю вы̀. <red>В</red>оз\u00AD̾ми́\u00ADте и҆́го моѐ на се\u00ADбѐ, и҆ " +
                "на\u00ADꙋ\u00ADчи́\u00ADте\u00ADсѧ ѿ ме\u00ADнѐ, ꙗ҆́кѡ кро́\u00ADтокъ є҆́смь и҆  " +
                "сми\u00ADре́нъ се́рд\u00ADцемъ, и҆ ѡ҆б\u00ADрѧ́\u00ADще\u00ADте по\u00ADко́й " +
                "дꙋ\u00ADша́мъ ва́\u00ADшымъ. <red>И҆́</red>го бо моѐ бла́\u00ADго, и҆ бре́\u00ADмѧ моѐ " +
                "лег\u00ADко̀ є҆́сть.</csl>\n" +
                "<p>Text<sup>sup</sup>, text<sub>sub</sub></p>\n" +
                "<p>Text<sup>sup<sup>sup</sup></sup>, text<sub>sub<sub>sub</sub></sub></p>\n" +
                "<p>Text<sup>sup<sub>sub<sup>sup<sub>sub</sub></sup></sub></sup>, " +
                "text<sub>sub<sup>sup<sub>sub<sup>sup</sup></sub></sup></sub>.</p>\n" +
                "<blockquote>«Наши люди в булочную на такси не ездят!»</blockquote>")

//        document.getTagConfig("blockquote")?.let {
//            it.onSetBlockStyle = { tag, blockStyle ->
//                blockStyle.setMargin(Size.dp(8f), null, Size.dp(8f), Size.em(1f))
//                blockStyle.borderLeft = Border.dp(4f, Color.rgb(192, 192, 192))
//                blockStyle.paddingLeft = Size.em(1f)
//                blockStyle.color = Color.rgb(224, 224, 224)
////                it.onSetBlockStyle?.invoke(tag, blockStyle)
//            }
//
//            it.onSetCharacterStyle = { tag, characterStyle ->
//                characterStyle.color = Color.rgb(128, 128, 128)
//                characterStyle.italic = true
//                document.setCSFromAttributes(tag, characterStyle)
//            }
//        }

//        val sample = "Бл҃го\u00ADсло\u00ADвѝ дꙋ\u00ADшѐ моѧ̀ гдⷭ҇а: гдⷭ҇и бж҃е мо́й, " +
//                "воз\u00ADве\u00ADли́\u00ADчил\u00ADсѧ є҆сѝ ѕѣ\u00ADлѡ̀, во " +
//                "и҆с\u00ADпо\u00ADвѣ́\u00ADда\u00ADнїе и҆ въ ве\u00ADле\u00ADлѣ́\u00ADпо\u00ADтꙋ " +
//                "ѡ҆б\u00ADле́кл\u00ADсѧ є҆сѝ.<br>" +
//                "Ѡ҆дѣ\u00ADѧ́й\u00ADсѧ свѣ́\u00ADтомъ ꙗ҆́кѡ ри́\u00ADзою, " +
//                "прос\u00ADти\u00ADра́\u00ADѧй нб҃о ꙗ҆́кѡ ко́\u00ADжꙋ.<br>" +
//                "Пок\u00ADры\u00ADва́\u00ADѧй во\u00ADда́\u00ADми пре\u00ADвы́с\u00ADпрєн\u00ADнѧѧ " +
//                "своѧ̑, по\u00ADла\u00ADга́\u00ADѧй ѻ҆́б\u00ADла\u00ADки на " +
//                "вос\u00ADхож\u00ADде́\u00ADнїе своѐ, хо\u00ADдѧ́й на " +
//                "кри\u00ADлꙋ̀ вѣ́т\u00ADрє\u00ADню."
//
//        document.setText("Hello,World!<b>Hello,World!</b>Hello,World!Helló,World!Hello,World!Hello,World!" +
//                        "Hello,World!Hello,World!Hello,World!Hello,World!Hello,World!Hello,World!\n" +
//
//                        "<blockquote>Hello, World! Hello, World! Hello, World! Hello, World! Hello, " +
//                        "World! Hello, World! Hello, World!<sub>Hello, World!<sub>Hello, World!" +
//                        "<sub>Hello, world!</sub></sub></sub> Hello, World! Hello, World! " +
//                        "Hello, World! Hello, World! Hello, World! Hello, World!</blockquote>\n" +
//
//                        "<div>Hello, World! Hello, World! Hello, World! Hello, World! Hello, World! " +
//                        "Hello, World! Hello, World!<sup>Hello, World!<sup>Hello, World!<sup>Hello, " +
//                        "world!</sup></sup></sup> Hello, World! Hello, World! Hello, World! Hello, " +
//                        "World! Hello, World! Hello, World!</div>\n" +
//
//                        "<div>Hello, World! Hello, World! Hello, World! Hello, World! Hello, World! " +
//                        "Hello, World! Hello, World!<sup size=100%>Hello, World!<sup>Hello, World!" +
//                        "<sup>Hello, world!</sup></sup></sup> Hello, World! Hello, World! Hello, " +
//                        "World! Hello, World! Hello, World! Hello, World!</div>\n" +
//
//                        "<div lang=csl>\n" +
//                        "<p align=left firstLeftIndent=50%>$sample</p>\n" +
//                        "<p align=left>$sample</p>\n" +
//                        "<p align=right>$sample</p>\n" +
//                        "<p align=center>$sample</p>\n" +
//                        "<p align=justify firstLeftIndent=50%>$sample</p>\n" +
//                        "<p align=justify>$sample</p>\n" +
//                        "<p align=justify lastAlign=center>$sample</p>\n" +
//                        "<p align=justify lastAlign=right>$sample</p>\n" +
//                        "<p align=justify lastAlign=justify>$sample</p>\n" +
//                        "<p align=justify lastAlign=center firstLeftIndent=10% " +
//                        "firstRightIndent=10%>$sample</p>\n" +
//                        "</div>\n" +
//
//                        "<div>\n" +
//                        "<p bgColor='#f77' firstLeftIndent=2em>АААА <b>ББББ <i>ВВВВ <s>ГГГГ</b> ДДДД</i> " +
//                        "ЕЕЕЕ</s> <font size=30>Ё<b>ЁЁЁ</b></font> ЖЖЖЖ ЗЗЗЗ ИИИИ ЙЙЙЙ КККК ЛЛЛЛ</p>\n" +
//                        "<p bgColor='rgb(128,255,128)' leftIndent=2em rightIndent=2em>ЙА\u0301ДУ " +
//                        "ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ " +
//                        "ЙА́\u00ADДУ ЙА́Д\u00ADУ ЙА́Д\u00ADУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ " +
//                        "ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ</p>\n" +
//                        "<p bgColor='rgb(128,128,255)' firstLeftIndent=-2em leftIndent=2em>аааааа " +
//                        "бббббб вввввв гггггг дддддд ееееее ёёёёёё жжжжжж зззззз ииииии йййййй кккккк " +
//                        "лллллл</p>\n" +
//                        "<div bgColor='#77f' lang='csl'>\n" +
//                        "<p bgColor='rgba(255,128,0,0.5)'>н,<i>и,<b>би,<s>бис,</i>бс,</b>с</s></p>\n" +
//                        "<p bgColor='#00ff00'>ЙА\u0301ДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ " +
//                        "ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ</p>\n" +
//                        "</div>\n" +
//                        "<p bgColor='#eef' firstLeftIndent=-2em leftIndent=2em rightIndent=2em>удщрфц " +
//                        "удщрфц удщрфц удщрфц удщрфц удщрфц удщрфц</p>\n" +
//                        "<p bgColor='#ff000'>ЙА\u0301ДУ ЙА́Д\u00ADУ ЙА́Д\u00ADУ ЙА́Д\u00ADУ ЙА́Д\u00ADУ " +
//                        "ЙА́Д\u00ADУ ЙА́Д\u00ADУ ЙА́Д\u00ADУ ЙА́\u00ADДУ</p>\n" +
//                        "</div>" +
//
//                        ""
//        )
    }
}

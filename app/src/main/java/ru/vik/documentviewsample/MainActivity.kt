package ru.vik.documentviewsample

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ru.vik.documentview.DocumentView
import ru.vik.documentview.Font
import ru.vik.documentview.FontList
import ru.vik.utils.color.Color
import ru.vik.utils.document.Border
import ru.vik.utils.document.Size
import ru.vik.utils.htmldocument.SimpleHtmlDocument

class MainActivity : AppCompatActivity() {

    private lateinit var docView: DocumentView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fontList = FontList()
        fontList.createFamily("sans_serif", Font(Typeface.SANS_SERIF))
        fontList.createFamily("serif", Font(Typeface.SERIF))
        fontList["ponomar"] = Font(
                typeface = Typeface.createFromAsset(this.assets, "fonts/PonomarUnicode.ttf")!!,
                hyphen = '_',
                scale = 1.2f)

        docView = findViewById(R.id.docView)
        docView.baselineMode = DocumentView.Baseline.INDENT
        docView.fontList = fontList
        docView.characterStyle.font = "sans_serif"
        docView.characterStyle.size = Size.dp(16f)
        docView.characterStyle.scaleX = 0.85f

        val document = SimpleHtmlDocument()
        docView.document = document

        document.blockStyle.setPadding(Size.dp(4f))
        document.getTagConfig("blockquote")?.let {
            it.onSetBlockStyle = { tag, blockStyle ->
                blockStyle.setMargin(Size.dp(8f), null, Size.dp(8f), Size.em(1f))
                blockStyle.borderLeft = Border.dp(4f, Color.rgb(192, 192, 192))
                blockStyle.paddingLeft = Size.em(1f)
                blockStyle.color = Color.rgb(224, 224, 224)
//                it.onSetBlockStyle?.invoke(tag, blockStyle)
            }

            it.onSetCharacterStyle = { tag, characterStyle ->
                characterStyle.color = Color.rgb(128, 128, 128)
                characterStyle.italic = true
                document.setCSFromAttributes(tag, characterStyle)
            }
        }

        val sample = "Бл҃го\u00ADсло\u00ADвѝ дꙋ\u00ADшѐ моѧ̀ гдⷭ҇а: гдⷭ҇и бж҃е мо́й, " +
                "воз\u00ADве\u00ADли́\u00ADчил\u00ADсѧ є҆сѝ ѕѣ\u00ADлѡ̀, во " +
                "и҆с\u00ADпо\u00ADвѣ́\u00ADда\u00ADнїе и҆ въ ве\u00ADле\u00ADлѣ́\u00ADпо\u00ADтꙋ " +
                "ѡ҆б\u00ADле́кл\u00ADсѧ є҆сѝ.<br>" +
                "Ѡ҆дѣ\u00ADѧ́й\u00ADсѧ свѣ́\u00ADтомъ ꙗ҆́кѡ ри́\u00ADзою, " +
                "прос\u00ADти\u00ADра́\u00ADѧй нб҃о ꙗ҆́кѡ ко́\u00ADжꙋ.<br>" +
                "Пок\u00ADры\u00ADва́\u00ADѧй во\u00ADда́\u00ADми пре\u00ADвы́с\u00ADпрєн\u00ADнѧѧ " +
                "своѧ̑, по\u00ADла\u00ADга́\u00ADѧй ѻ҆́б\u00ADла\u00ADки на " +
                "вос\u00ADхож\u00ADде́\u00ADнїе своѐ, хо\u00ADдѧ́й на " +
                "кри\u00ADлꙋ̀ вѣ́т\u00ADрє\u00ADню."

        this.docView.document.setText(
                "Hello,World!<b>Hello,World!</b>Hello,World!Helló,World!Hello,World!Hello,World!" +
                        "Hello,World!Hello,World!Hello,World!Hello,World!Hello,World!Hello,World!\n" +

                        "<blockquote>Hello, World! Hello, World! Hello, World! Hello, World! Hello, " +
                        "World! Hello, World! Hello, World!<sub>Hello, World!<sub>Hello, World!" +
                        "<sub>Hello, world!</sub></sub></sub> Hello, World! Hello, World! " +
                        "Hello, World! Hello, World! Hello, World! Hello, World!</blockquote>\n" +

                        "<div>Hello, World! Hello, World! Hello, World! Hello, World! Hello, World! " +
                        "Hello, World! Hello, World!<sup>Hello, World!<sup>Hello, World!<sup>Hello, " +
                        "world!</sup></sup></sup> Hello, World! Hello, World! Hello, World! Hello, " +
                        "World! Hello, World! Hello, World!</div>\n" +

                        "<div>Hello, World! Hello, World! Hello, World! Hello, World! Hello, World! " +
                        "Hello, World! Hello, World!<sup size=100%>Hello, World!<sup>Hello, World!" +
                        "<sup>Hello, world!</sup></sup></sup> Hello, World! Hello, World! Hello, " +
                        "World! Hello, World! Hello, World! Hello, World!</div>\n" +

                        "<div lang=csl>\n" +
                        "<p align=left firstLeftIndent=50%>$sample</p>\n" +
                        "<p align=left>$sample</p>\n" +
                        "<p align=right>$sample</p>\n" +
                        "<p align=center>$sample</p>\n" +
                        "<p align=justify firstLeftIndent=50%>$sample</p>\n" +
                        "<p align=justify>$sample</p>\n" +
                        "<p align=justify lastAlign=center>$sample</p>\n" +
                        "<p align=justify lastAlign=right>$sample</p>\n" +
                        "<p align=justify lastAlign=justify>$sample</p>\n" +
                        "<p align=justify lastAlign=center firstLeftIndent=10% " +
                        "firstRightIndent=10%>$sample</p>\n" +
                        "</div>\n" +

                        "<div>\n" +
                        "<p bgColor='#f77' firstLeftIndent=2em>АААА <b>ББББ <i>ВВВВ <s>ГГГГ</b> ДДДД</i> " +
                        "ЕЕЕЕ</s> <font size=30>Ё<b>ЁЁЁ</b></font> ЖЖЖЖ ЗЗЗЗ ИИИИ ЙЙЙЙ КККК ЛЛЛЛ</p>\n" +
                        "<p bgColor='rgb(128,255,128)' leftIndent=2em rightIndent=2em>ЙА\u0301ДУ " +
                        "ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ " +
                        "ЙА́\u00ADДУ ЙА́Д\u00ADУ ЙА́Д\u00ADУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ " +
                        "ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ</p>\n" +
                        "<p bgColor='rgb(128,128,255)' firstLeftIndent=-2em leftIndent=2em>аааааа " +
                        "бббббб вввввв гггггг дддддд ееееее ёёёёёё жжжжжж зззззз ииииии йййййй кккккк " +
                        "лллллл</p>\n" +
                        "<div bgColor='#77f' lang='csl'>\n" +
                        "<p bgColor='rgba(255,128,0,0.5)'>н,<i>и,<b>би,<s>бис,</i>бс,</b>с</s></p>\n" +
                        "<p bgColor='#00ff00'>ЙА\u0301ДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ " +
                        "ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ ЙА́\u00ADДУ</p>\n" +
                        "</div>\n" +
                        "<p bgColor='#eef' firstLeftIndent=-2em leftIndent=2em rightIndent=2em>удщрфц " +
                        "удщрфц удщрфц удщрфц удщрфц удщрфц удщрфц</p>\n" +
                        "<p bgColor='#ff000'>ЙА\u0301ДУ ЙА́Д\u00ADУ ЙА́Д\u00ADУ ЙА́Д\u00ADУ ЙА́Д\u00ADУ " +
                        "ЙА́Д\u00ADУ ЙА́Д\u00ADУ ЙА́Д\u00ADУ ЙА́\u00ADДУ</p>\n" +
                        "</div>" +

                        ""
        )
    }
}

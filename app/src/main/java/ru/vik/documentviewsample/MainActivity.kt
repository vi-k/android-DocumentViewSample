package ru.vik.documentviewsample

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewManager
import org.jetbrains.anko.alignParentTop
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.padding
import org.jetbrains.anko.relativeLayout
import org.jetbrains.anko.support.v4.nestedScrollView
import ru.vik.documentview.DocumentView
import ru.vik.documentview.Font
import ru.vik.documentview.FontList
import ru.vik.utils.document.Size
import ru.vik.utils.htmldocument.SimpleHtmlDocument

class MainActivity : AppCompatActivity() {

    private lateinit var mDocView: DocumentView
    private val mFontList = FontList()

    //    inline fun ViewManager.documentView() = documentView {}
    private inline fun ViewManager.documentView(theme: Int = 0, init: DocumentView.() -> Unit) =
            ankoView({ DocumentView(it) }, theme, init)
//    private inline fun ViewManager.documentView(theme: Int = 0, init: DebugDocumentView.() -> Unit) =
//            ankoView({ DebugDocumentView(it) }, theme, init)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mFontList.createFamily("main", Font(Typeface.SERIF))
        mFontList["ponomar"] = Font(
                typeface = Typeface.createFromAsset(this.assets, "fonts/PonomarUnicode.ttf")!!,
                hyphen = '_',
                scale = 1.2f)

        var lastId = 0

        relativeLayout {
            nestedScrollView {
                id = ++lastId
                mDocView = documentView {
                    id = ++lastId
                    baselineMode = DocumentView.Baseline.INDENT
                    fontList = mFontList
                    characterStyle.font = "main"
                    characterStyle.size = Size.dp(17f)
                    characterStyle.scaleX = 0.85f
                    document = SimpleHtmlDocument()
                    document.blockStyle.setPadding(Size.dp(4f))
                }.lparams(width = matchParent)
            }.lparams(width = matchParent, height = matchParent) {
                alignParentTop()
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

        mDocView.document.setText("Hello,World!<b>Hello,World!</b>Hello,World!Helló,World!Hello,World!Hello,World!" +
                "Hello,World!Hello,World!Hello,World!Hello,World!Hello,World!Hello,World!\n" +

                "<div>Hello, World! Hello, World! Hello, World! Hello, World! Hello, " +
                "World! Hello, World! Hello, World!<sub>Hello, World!<sub>Hello, World!" +
                "<sub>Hello, world!</sub></sub></sub> Hello, World! Hello, World! " +
                "Hello, World! Hello, World! Hello, World! Hello, World!</div>\n" +

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

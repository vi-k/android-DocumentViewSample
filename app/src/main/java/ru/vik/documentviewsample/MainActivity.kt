/**
 * MainActivity.kt test
 */

package ru.vik.documentviewsample

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ru.vik.documentview.DocumentView
import ru.vik.documentview.Font
import ru.vik.documentview.FontList
import ru.vik.utils.color.Color
import ru.vik.utils.document.*

/**
 * MainActivity test
 */
class MainActivity : AppCompatActivity() {
    /**
     * onCreate - function
     *
     * @param savedInstanceState Test
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val metrics = applicationContext.resources.displayMetrics

        val docView: DocumentView = findViewById(R.id.docView)

//        /* Пример 1 - Простой пример */
//        docView {
//            document {
//                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ..."
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                span from 0 to 5 style CharacterStyle(color = Color.RED)
//                span from 6 to 11 style CharacterStyle(bold = true)
//                span from 12 to 17 style CharacterStyle(italic = true)
//                span from 18 to 21 style CharacterStyle(bold = true, italic = true)
//                span from 22 to 26 style CharacterStyle(underline = true)
//                span from 28 to 39 style CharacterStyle(strike = true)
//                span from 50 to 55 style CharacterStyle(baselineShift = Size.em(-0.4f), size = Size.em(0.85f))
//                span from 60 to 63 style CharacterStyle(baselineShift = Size.em(0.25f), size = Size.em(0.85f))
//                span from 64 to 71 style CharacterStyle(scaleX = 0.6f)
//            }
//        }


//        /* Пример 1.2 */
//        docView {
//            document {
//                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ..."
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                span on word(1) style CharacterStyle(color = Color.RED)
//                span on word(2) style CharacterStyle(bold = true)
//                span on word(3) style CharacterStyle(italic = true)
//                span on word(4) style CharacterStyle(bold = true, italic = true)
//                span on word(5) style CharacterStyle(underline = true)
//                span on word(6) style CharacterStyle(strike = true)
//                span on word(8) style CharacterStyle(baselineShift = Size.em(-0.4f), size = Size.em(0.85f))
//                span on word(10) style CharacterStyle(baselineShift = Size.em(0.25f), size = Size.em(0.85f))
//                span on word(11) style CharacterStyle(scaleX = 0.6f)
//            }
//        }


//        /* Примеры 2, 2.2 */
//        docView {
//            document {
//                text = "Lorem ipsum dolor sit amet ..."
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                /* Пример 2 */
//                span from word(1) to word(3) style CharacterStyle(bold = true)
//                span from word(3) to word(5) style CharacterStyle(italic = true)

//                /* Пример 2.2 */
//                span to word(3) style CharacterStyle(color = Color.RED)
//                span from word(3) style CharacterStyle(color = Color.GREEN)

//            }
//        }


//        /* Примеры 3, 3.2, 4 - Абзацы и шрифты */
//        docView {
//            document {
//                text = """
//                    |Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
//                    |Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
//                    |Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
//                    """.trimMargin()
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                val red = CharacterStyle(color = Color.RED)
//
//                /* Пример 3 */
//                paragraph(0) {
//                    span on 0 style red
//                }
//
//                paragraph(1) {
//                    span on 0 style red
//                }
//
//                paragraph(2) {
//                    span on 0 style red
//                }

//                /* Пример 3.2 */
//                paragraph(0) {
//                    characterStyle {
//                        italic = true
//                    }
//
//                    span on 0 style red
//                }
//
//                paragraph(1) {
//                    characterStyle {
//                        size = Size.em(0.8f)
//                    }
//
//                    span on 0 style red
//                }
//
//                paragraph(2) {
//                    characterStyle {
//                        color = Color.GRAY
//                    }
//
//                    span on 0 style red
//                }

//                /* Пример 4 - Шрифты */
//                fontList {
//                    "sans_serif" family Font(Typeface.SANS_SERIF)
//                    "serif" family Font(Typeface.SERIF)
//                    "mono" family Font(Typeface.MONOSPACE)
//                }
//
//                paragraph(0) {
//                    characterStyle {
//                        font = "sans_serif"
//                    }
//
//                    span on 0 style red
//                }
//
//                paragraph(1) {
//                    characterStyle {
//                        font = "serif"
//                    }
//
//                    span on 0 style red
//                }
//
//                paragraph(2) {
//                    characterStyle {
//                        font = "mono"
//                    }
//
//                    span on 0 style red
//                }

//            }
//        }


//        /* Пример 5 */
//        docView {
//            fontList {
//                "serif1" family Font(Typeface.SERIF)
//                "serif2" to Font(Typeface.SERIF)
//
////                /* Пример 5.2 */
////                "serif2:bold" to Font(Typeface.create(Typeface.SERIF, Typeface.BOLD))
////                "serif2:italic" to Font(Typeface.create(Typeface.SERIF, Typeface.ITALIC))
////                "serif2:bold_italic" to Font(Typeface.create(Typeface.SERIF, Typeface.BOLD_ITALIC))
//
//            }
//
//            document {
//                text = "Lorem ipsum dolor sit amet ...\nLorem ipsum dolor sit amet ..."
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                paragraph(0) {
//                    characterStyle {
//                        font = "serif1"
//                    }
//
//                    span to "dolor" style CharacterStyle(bold = true)
//                    span from "dolor" style CharacterStyle(italic = true)
//                }
//
//                paragraph(1) {
//                    characterStyle {
//                        font = "serif2"
//                    }
//
//                    span to "dolor" style CharacterStyle(bold = true)
//                    span from "dolor" style CharacterStyle(italic = true)
//                }
//
//            }
//        }


//        /* Пример 6 */
//        val commonFontList = FontList {
//            "georgia" to Font(Typeface.createFromAsset(assets, "fonts/georgia.ttf")!!)
//            "georgia:bold" to Font(Typeface.createFromAsset(assets, "fonts/georgiab.ttf")!!)
//            "georgia:italic" to Font(Typeface.createFromAsset(assets, "fonts/georgiai.ttf")!!)
//            "georgia:bold_italic" to Font(Typeface.createFromAsset(assets, "fonts/georgiaz.ttf")!!)
//        }
//
//        docView {
//            fontList = commonFontList
//
//            document {
//                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
//
//                characterStyle {
//                    font = "georgia"
//                }
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                span from "consectetur" to "incididunt" style CharacterStyle(bold = true)
//                span from "sed" style CharacterStyle(italic = true)
//            }
//        }


//        /* Пример 7 - Рамки */
//        docView {
//            document {
//                text = """
//                    |Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
//                    |Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
//                    |Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
//                    """.trimMargin()
//
//                borderStyle {
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                paragraph(0) {
//                    borderStyle {
//                        padding = Size.dp(8f)
//                        border = Border.dp(1f, Color.rgb(0xDC3023))
//                        margin = Size.dp(8f)
//                        backgroundColor = Color.argb(0.1f, 0xDC3023)
//                    }
//                }
//
//                paragraph(1) {
//                    borderStyle {
//                        padding = Size.dp(8f)
//                        border = Border.dp(1f, Color.rgb(0x22A7F0))
//                        margin = Size.dp(8f)
//                        backgroundColor = Color.argb(0.1f, 0x22A7F0)
//                    }
//                }
//
//                paragraph(2) {
//                    borderStyle {
//                        padding = Size.dp(8f)
//                        border = Border.dp(1f, Color.rgb(0x26C281))
//                        margin = Size.dp(8f)
//                        backgroundColor = Color.argb(0.1f, 0x26C281)
//                    }
//                }
//            }
//        }


//        /* Пример 7.2 */
//        docView {
//            document {
//                text = """
//                    |Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
//                    |Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
//                    |Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
//                    """.trimMargin()
//
//                borderStyle {
//                    padding = Size.dp(4f)
//                    border = Border.dp(4.0f, Color.rgb(0xF9690E))
//                    margin = Size.dp(4f)
//                    backgroundColor = Color.argb(0.1f, 0xF9690E)
//                }
//
//                paragraph(0) {
//                    borderStyle {
//                        padding = Size.dp(8f)
//                        borderTop = Border.dp(8f, Color.rgb(0xDC3023))
//                        borderRight = Border.dp(8f, Color.rgb(0x22A7F0))
//                        borderBottom = Border.dp(8f, Color.rgb(0x26C281))
//                        borderLeft = Border.dp(8f, Color.rgb(0x9B59B6))
//                        margin = Size.dp(4f)
//                        backgroundColor = Color.argb(0.2f, 0xDC3023)
//                    }
//                }
//
//                paragraph(1) {
//                    borderStyle {
//                        padding = Size.dp(8f)
//                        borderLeft = Border.dp(8f, Color.rgb(0x22A7F0))
//                        margin = Size.dp(4f)
//                        backgroundColor = Color.argb(0.2f, 0x22A7F0)
//                    }
//                }
//
//                paragraph(2) {
//                    borderStyle {
//                        padding = Size.dp(8f)
//                        verticalBorder = Border.dp(8f, Color.TRANSPARENT)
//                        horizontalBorder = Border.dp(8f, Color.rgb(0x26C281))
//                        margin = Size.dp(4f)
//                        backgroundColor = Color.argb(0.2f, 0x26C281)
//                    }
//                }
//            }
//        }


//        /* Пример 8 - Оформление абзацев */
//        docView {
//            document {
//                text = """
//                    |Lorem ipsum
//                    |Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
//                    |Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
//                    |Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
//                    |Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
//                """.trimMargin()
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                characterStyle {
//                    size = Size.em(1.2f)
//                }
//
//                paragraphStyle {
//                    spaceBefore = Size.dp(8f) // Отступ сверху, общий для всех абзацев
//                }
//
//                paragraph(0) {
//                    characterStyle {
//                        size = Size.em(2f)
//                    }
//
//                    paragraphStyle {
//                        align = ParagraphStyle.Align.CENTER
//                        spaceBefore = Size.dp(0f)
//                    }
//
//                    borderStyle {
//                        borderBottom = Border.dp(1f, Color.LTGRAY)
//                        marginBottom = Size.dp(4f)
//                    }
//                }
//
//                paragraph(1) {
//                    paragraphStyle {
//                        align = ParagraphStyle.Align.LEFT
//                        firstLeftIndent = Size.em(2f)
//                    }
//                }
//
//                paragraph(2) {
//                    paragraphStyle {
//                        align = ParagraphStyle.Align.RIGHT
//                    }
//                }
//
//                paragraph(3) {
//                    paragraphStyle {
//                        align = ParagraphStyle.Align.JUSTIFY
//                    }
//                }
//
//                paragraph(4) {
//                    paragraphStyle {
//                        align = ParagraphStyle.Align.JUSTIFY
//                        lastAlign = ParagraphStyle.Align.CENTER
//                    }
//                }
//            }
//        }


//        /* Пример 8.2 */
//        docView {
//            fontList {
//                "georgia" to Font(Typeface.createFromAsset(assets, "fonts/georgia.ttf")!!)
//                "georgia:bold" to Font(Typeface.createFromAsset(assets, "fonts/georgiab.ttf")!!)
//                "georgia:italic" to Font(Typeface.createFromAsset(assets, "fonts/georgiai.ttf")!!)
//                "georgia:bold_italic" to Font(Typeface.createFromAsset(assets, "fonts/georgiaz.ttf")!!)
//            }
//
//            document {
//                text = "Куда ещё тянется провод\u2028из гроба того?\n" +
//                        "Нет, Сталин не умер. Считает он смерть поправимостью.\n" +
//                        "Мы вынесли из мавзолея его.\n" +
//                        "Но как из наследников Сталина Сталина вынести?"
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                characterStyle {
//                    font = "georgia"
//                    italic = true
//                }
//
//                paragraphStyle {
//                    leftIndent = Size.em(2f)
//                    firstLeftIndent = Size.em(-2f)
//                    firstAlign = ParagraphStyle.Align.LEFT
//                    align = ParagraphStyle.Align.RIGHT
//                }
//            }
//        }


//        /* Примеры 9, 9.2, 9.3 - коррекция шрифтов */
//        docView {
//            fontList {
//                "serif" family Font(Typeface.SERIF)
//
//                /* Пример 9 */
//                "ponomar" to Font(Typeface.createFromAsset(assets, "fonts/PonomarUnicode.ttf")!!)

//                /* Пример 9.2 */
//                "ponomar" to Font(Typeface.createFromAsset(assets, "fonts/PonomarUnicode.ttf")!!,
//                        scale = 1.2f)

//                /* Пример 9.3 */
//                "ponomar" to Font(Typeface.createFromAsset(assets, "fonts/PonomarUnicode.ttf")!!,
//                        scale = 1.2f, ascentRatio = 0.8f, descentRatio = 0.8f)

//            }
//
//            document {
//                text = "В начале сотворил Бог - Въ нача́лѣ сотворѝ бг҃ъ"
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                span to word (4) style CharacterStyle(font = "serif")
//                span from word(5) style CharacterStyle(font = "ponomar")
//            }
//        }


//        /* Пример 10 - по примеру 8 */
//        docView.document {
//            // Мягкие переносы для наглядности обозначаем знаком '~', затем их переводим в '\u00AD'
//            text = """
//                |Lorem ipsum
//                |Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua.
//                |Ut enim ad mi~nim ve~niam, qu~is nos~t~rud exer~ci~ta~tion ul~lam~co la~bo~ris ni~si ut ali~qu~ip ex ea com~mo~do con~se~quat.
//                |Duis aute iru~re do~lor in rep~re~hen~de~rit in vo~lup~ta~te ve~lit es~se cil~lum do~lo~re eu fu~gi~at nul~la pa~ria~tur.
//                |Ex~cep~te~ur sint oc~cae~cat cu~pi~da~tat non pro~i~dent, sunt in cul~pa qui of~fi~cia de~se~runt mol~lit anim id est la~bo~rum.
//                """.trimMargin().replace('~', '\u00AD')
//
//            borderStyle {
//                padding = Size.dp(8f)
//                border = Border.px(1.0f, Color.BLACK)
//                margin = Size.dp(4f)
//            }
//
//            characterStyle {
//                size = Size.em(1.2f)
//            }
//
//            paragraphStyle {
//                spaceBefore = Size.dp(8f) // Отступ сверху, общий для всех абзацев
//            }
//
//            paragraph(0) {
//                characterStyle {
//                    size = Size.em(2f)
//                }
//
//                paragraphStyle {
//                    align = ParagraphStyle.Align.CENTER
//                    spaceBefore = Size.dp(0f)
//                }
//
//                borderStyle {
//                    borderBottom = Border.dp(1f, Color.LTGRAY)
//                    marginBottom = Size.dp(4f)
//                }
//            }
//
//            paragraph(1).paragraphStyle {
//                align = ParagraphStyle.Align.LEFT
//                firstLeftIndent = Size.em(2f)
//            }
//
//            paragraph(2).paragraphStyle {
//                align = ParagraphStyle.Align.RIGHT
//            }
//
//            paragraph(3).paragraphStyle {
//                align = ParagraphStyle.Align.JUSTIFY
//            }
//
//            paragraph(4).paragraphStyle {
//                align = ParagraphStyle.Align.JUSTIFY
//                lastAlign = ParagraphStyle.Align.CENTER
//            }
//        }


//        /* Пример 10.2 */
//        docView {
//            fontList {
//                "ponomar" to Font(
//                        typeface = Typeface.createFromAsset(assets, "fonts/PonomarUnicode.ttf")!!,
//                        hyphen = '_', // Символ переноса для старославянского языка
//                        ascentRatio = 0.9f,
//                        descentRatio = 0.9f,
//                        scale = 1.2f)
//            }
//
//            document {
//                text = "Прї~и~ди́~те ко мнѣ̀ всѝ трꙋж~да́ю~щї~и~сѧ и҆ ѡ҆б~ре~ме~не́н~нїи, и҆ а҆́зъ оу҆по~ко́ю вы̀. Воз̾~ми́~те и҆́го моѐ на се~бѐ, и҆ на~ꙋ~чи́~те~сѧ ѿ ме~нѐ, ꙗ҆́кѡ кро́~токъ є҆́смь и҆ сми~ре́нъ се́рд~цемъ, и҆ ѡ҆б~рѧ́~ще~те по~ко́й дꙋ~ша́мъ ва́~шымъ. И҆́го бо моѐ бла́~го, и҆ бре́~мѧ моѐ лег~ко̀ є҆́сть."
//                        .replace('~', '\u00AD')
//
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                characterStyle {
//                    font = "ponomar"
//                }
//
//                paragraphStyle {
//                    firstLeftIndent = Size.em(1f)
//                    align = ParagraphStyle.Align.JUSTIFY
//                }
//
//                span on 0 style CharacterStyle(color = Color.RED)
//            }
//        }


//        /* Пример 11 - базовые линии */
//        docView {
//            baselineMode = DocumentView.Baseline.PARAGRAPH
//            document {
//                text = "Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua."
//                        .replace('~', '\u00AD')
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//            }
//        }


//        /* Примеры 11.2 - 11.8 */
//        docView {
//            baselineMode = DocumentView.Baseline.VIEW
//            baselineColor = Color.rgb(0x4B77BE)
//
//            document {
//                text = """
//                    |Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua.
//                    |Ut enim ad mi~nim ve~niam, qu~is nos~t~rud exer~ci~ta~tion ul~lam~co la~bo~ris ni~si ut ali~qu~ip ex ea com~mo~do con~se~quat.
//                    |Duis1 aute2 iru~re3 do~lor4 in5 rep~re~hen~de~rit6 in7 vo~lup~ta~te8 ve~lit9 es~se10 cil~lum11 do~lo~re12 eu13 fu~gi~at14 nul~la15 pa~ria~tur16.
//                    |Ex~cep~te~ur sint oc~cae~cat cu~pi~da~tat non pro~i~dent1, sunt in cul~pa* qui of~fi~cia de~se~runt mol~lit anim2 id est la~bo~rum.
//                    """.trimMargin().replace('~', '\u00AD')
//
//                borderStyle {
//                    verticalPadding = Size.dp(0f)
//                    horizontalPadding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                characterStyle {
//                    size = Size.sp(18f)
//                }
//
//                paragraphStyle {
//                    align = ParagraphStyle.Align.JUSTIFY
//                    firstLeftIndent = Size.dp(24f)
//                }

//                // Пример 11.2
//                paragraph(1) {
//                    span on word(10) style CharacterStyle(size = Size.em(1.4f))
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style CharacterStyle(
//                            baselineShift = Size.em(0.33f),
//                            size = Size.em(0.58f))
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style CharacterStyle(
//                            baselineShift = Size.em(-0.5f),
//                            size = Size.em(0.58f))
//                }

//                // Пример 11.3
//                paragraph(1) {
//                    span on word(10) style CharacterStyle(size = Size.em(1.4f))
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.BOTTOM,
//                            size = Size.em(0.58f))
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.TOP,
//                            size = Size.em(0.58f))
//                }

//                // Пример 11.4
//                paragraph(1) {
//                    span on word(10) style CharacterStyle(size = Size.em(1.4f))
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM,
//                            size = Size.em(0.58f))
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.TOP,
//                            size = Size.em(0.58f))
//                }

//                // Пример 11.5
//                paragraph(1) {
//                    span on word(10) style CharacterStyle(
//                            size = Size.em(1.4f),
//                            leading = Size.dp(0f))
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM,
//                            size = Size.em(0.58f),
//                            leading = Size.dp(0f))
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.TOP,
//                            size = Size.em(0.58f))
//                }

//                // Пример 11.5.2
//                paragraph(1) {
//                    span on word(10) style CharacterStyle(
//                            size = Size.em(1.4f),
//                            leading = Size.ratio(1f))
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM,
//                            size = Size.em(0.58f),
//                            leading = Size.ratio(1f))
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.TOP,
//                            size = Size.em(0.58f))
//                }

//                // Пример 11.6
//                characterStyle {
//                    leading = Size.fh(1.15f)
//                }
//
//                paragraph(1) {
//                    span on word(10) style CharacterStyle(
//                            size = Size.em(1.4f),
//                            leading = Size.ratio(1f))
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM,
//                            size = Size.em(0.58f),
//                            leading = Size.ratio(1f))
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.TOP,
//                            size = Size.em(0.58f))
//                }

//                // Пример 11.7
//                characterStyle {
//                    leading = Size.fh(1.15f)
//                }
//
//                paragraph(0) {
//                    span on 0 style CharacterStyle(
//                            size = Size.em(1.4f),
//                            leading = Size.ratio(1f))
//                }
//
//                paragraph(1) {
//                    span on word(10) style CharacterStyle(
//                            size = Size.em(1.4f),
//                            leading = Size.ratio(1f))
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM,
//                            size = Size.em(0.58f),
//                            leading = Size.ratio(1f))
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.TOP,
//                            size = Size.em(0.58f))
//                }

//                // Пример 11.8
//                characterStyle {
//                    leading = Size.fh(1.15f)
//                }
//
//                firstBaselineToTop = true
//
////                paragraph(0) {
////                    span on 0 style CharacterStyle(
////                            size = Size.em(1.4f),
////                            leading = Size.ratio(1f))
////                }
//
//                paragraph(1) {
//                    span on word(10) style CharacterStyle(
//                            size = Size.em(1.4f),
//                            leading = Size.ratio(1f))
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM,
//                            size = Size.em(0.58f),
//                            leading = Size.ratio(1f))
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style CharacterStyle(
//                            verticalAlign = CharacterStyle.VAlign.TOP,
//                            size = Size.em(0.58f))
//                }

//            }
//        }


//        _document.addTag("h1", BaseHtmlDocument.TagConfig(
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
//        _document.addTag("p", BaseHtmlDocument.TagConfig(
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
//        _document.addTag("b", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.bold = true
//                }
//        ))
//
//        _document.addTag("i", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.italic = true
//                }
//        ))
//
//        _document.addTag("u", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.underline = true
//                }
//        ))
//
//        _document.addTag("s", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.strike = true
//                }
//        ))
//
//        _document.addTag("sup", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.size = Size.em(0.85f)
//                    characterStyle.baselineShift = Size.em(0.25f)
//                }
//        ))
//
//        _document.addTag("sub", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.size = Size.em(0.85f)
//                    characterStyle.baselineShift = Size.em(-0.4f)
//                }
//        ))
//
//        _document.addTag("red", BaseHtmlDocument.TagConfig(
//                type = Tag.Type.CHARACTER,
//                onSetCharacterStyle = { tag, characterStyle ->
//                    characterStyle.backgroundColor = Color.rgb(0xF22613)
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
//                _document.setCharacterStyleFromAttributes(tag, characterStyle)
//            }
//        }
    }
}
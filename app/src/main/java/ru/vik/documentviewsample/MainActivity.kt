/**
 * MainActivity.kt test
 */

package ru.vik.documentviewsample

import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ru.vik.documentview.DocumentView
import ru.vik.documentview.from
import ru.vik.documentview.typeface
import ru.vik.utils.color.Color
import ru.vik.utils.font.Font
import ru.vik.utils.document.*
import ru.vik.utils.font.FontList

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

        val documentView: DocumentView = findViewById(R.id.docView)

        htmlTest(this, documentView)

//        /* Пример 1 - Простой пример */
//        documentView {
//            document {
//                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ..."
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1.0f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                span from 0 to 5 style { color = Color.RED }
//                span from 6 to 11 style { bold = true }
//                span from 12 to 17 style { italic = true }
//                span from 18 to 21 style { bold = true; italic = true }
//                span from 22 to 26 style { underline = true }
//                span from 28 to 39 style { strike = true }
//                span from 50 to 55 style { baselineShift = Size.em(-0.4f); size = Size.em(0.85f) }
//                span from 60 to 63 style { baselineShift = Size.em(0.25f); size = Size.em(0.85f) }
//                span from 64 to 71 style { scaleX = 0.6f }
//            }
//        }


//        /* Пример 1.2 (скриншот тот же) */
//        documentView {
//            document {
//                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod ..."
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                span on word(1) style { color = Color.RED }
//                span on word(2) style { bold = true }
//                span on word(3) style { italic = true }
//                span on word(4) style { bold = true; italic = true }
//                span on word(5) style { underline = true }
//                span on word(6) style { strike = true }
//                span on word(8) style { baselineShift = Size.em(-0.4f); size = Size.em(0.85f) }
//                span on word(10) style { baselineShift = Size.em(0.25f); size = Size.em(0.85f) }
//                span on word(11) style { scaleX = 0.6f }
//            }
//        }


//        /* Примеры 2.1-2.2 */
//        documentView {
//            document {
//                text = "Lorem ipsum dolor sit amet ..."
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                /* Пример 2 */
//                span from word(1) to word(3) style { bold = true }
//                span from word(3) to word(5) style { italic = true }

//                /* Пример 2.2 */
//                span to word(3) style { color = Color.RED }
//                span from word(3) style { color = Color.GREEN }

//            }
//        }


//        /* Примеры 3.1-3.3 - Абзацы и шрифты */
//        documentView {
//            document {
//                text = """
//                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
//                    Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
//                    Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
//                """.trimIndent()
//
//                borderStyle {
//                    padding  = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }

//                /* Пример 3.1 */
//                paragraph(0) {
//                    span on 0 style CharacterStyle(color = Color.RED)
//                }
//
//                paragraph(1) {
//                    span on 0 style CharacterStyle(color = Color.RED)
//                }
//
//                paragraph(2) {
//                    span on 0 style CharacterStyle(color = Color.RED)
//                }
//
////                /* 3.1.2 */
////                paragraph(0..2) {
////                    span on 0 style CharacterStyle(color = Color.RED)
////                }
//
////                /* 3.1.3 */
////                paragraph(0, 1, 2) {
////                    span on 0 style CharacterStyle(color = Color.RED)
////                }
//
////                /* 3.1.4 */
////                paragraph {
////                    span on 0 style CharacterStyle(color = Color.RED)
////                }

//                /* Пример 3.2 */
//                paragraph {
//                    span on 0 style CharacterStyle(color = Color.RED)
//                }
//
//                paragraph(0) {
//                    characterStyle {
//                        italic = true
//                    }
//                }
//
//                paragraph(1) {
//                    characterStyle {
//                        size = Size.em(0.8f)
//                    }
//                }
//
//                paragraph(2) {
//                    characterStyle {
//                        color = Color.GRAY
//                    }
//                }

//                /* Пример 3.3 - Шрифты */
//                fontList {
//                    family("sans_serif") from Font(Typeface.SANS_SERIF)
//                    family("serif") from Font(Typeface.SERIF)
//                    family("mono") from Font(Typeface.MONOSPACE)
//                }
//
//                paragraph {
//                    span on 0 style CharacterStyle(color = Color.RED)
//                }
//
//                paragraph(0) {
//                    characterStyle {
//                        font = "sans_serif"
//                    }
//                }
//
//                paragraph(1) {
//                    characterStyle {
//                        font = "serif"
//                    }
//                }
//
//                paragraph(2) {
//                    characterStyle {
//                        font = "mono"
//                    }
//                }

//            }
//        }


//        /* Пример 4.1 */
//        documentView {
//            fontList {
//                family("serif1") from Font(Typeface.SERIF)
//                font("serif2") to Font(Typeface.SERIF)
//                // Или другой вариант:
//                // font("serif2") {
//                //     typeface = Typeface.SERIF
//                // }
//
//                /* Пример 4.2 */
////                font("serif2", isBold = true) to Font(Typeface.create(Typeface.SERIF, Typeface.BOLD))
////                font("serif2", isItalic = true) to Font(Typeface.create(Typeface.SERIF, Typeface.ITALIC))
////                font("serif2", isBold = true, isItalic = true) to Font(Typeface.create(Typeface.SERIF, Typeface.BOLD_ITALIC))
//            }
//
//            document {
//                text = "Lorem ipsum dolor sit amet ...\nLorem ipsum dolor sit amet ..."
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                paragraph {
//                    span to "dolor" style { bold = true }
//                    span from "dolor" style { italic = true }
//                }
//
//                paragraph(0) {
//                    characterStyle {
//                        font = "serif1"
//                    }
//                }
//
//                paragraph(1) {
//                    characterStyle {
//                        font = "serif2"
//                    }
//                }
//
//            }
//        }


//        /* Пример 5 */
//        documentView {
//            fontList {
//                font("segoeui", weight = 100) to Font(Typeface.createFromAsset(assets, "fonts/segoeuil.ttf")!!)
//                font("segoeui", weight = 100, isItalic = true) to Font(Typeface.createFromAsset(assets, "fonts/seguili.ttf")!!)
//                font("segoeui", weight = 250) to Font(Typeface.createFromAsset(assets, "fonts/segoeuisl.ttf")!!)
//                font("segoeui", weight = 250, isItalic = true) to Font(Typeface.createFromAsset(assets, "fonts/seguisli.ttf")!!)
//                font("segoeui", weight = 400) to Font(Typeface.createFromAsset(assets, "fonts/segoeui.ttf")!!)
//                font("segoeui", weight = 400, isItalic = true) to Font(Typeface.createFromAsset(assets, "fonts/segoeuii.ttf")!!)
//                font("segoeui", weight = 550) to Font(Typeface.createFromAsset(assets, "fonts/seguisb.ttf")!!)
//                font("segoeui", weight = 550, isItalic = true) to Font(Typeface.createFromAsset(assets, "fonts/seguisbi.ttf")!!)
//                font("segoeui", weight = 700) to Font(Typeface.createFromAsset(assets, "fonts/segoeuib.ttf")!!)
//                font("segoeui", weight = 700, isItalic = true) to Font(Typeface.createFromAsset(assets, "fonts/segoeuiz.ttf")!!)
//                font("segoeui", weight = 900) to Font(Typeface.createFromAsset(assets, "fonts/seguibl.ttf")!!)
//                font("segoeui", weight = 900, isItalic = true) to Font(Typeface.createFromAsset(assets, "fonts/seguibli.ttf")!!)
//            }
//
//            document {
//                text = """
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                    Lorem ipsum dolor sit amet ...
//                """.trimIndent()
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                characterStyle {
//                    font = "segoeui"
//                }
//
//                paragraph { index ->
//                    characterStyle {
//                        weight = when (index % 6) {
//                            0 -> Font.THIN   // 100
//                            1 -> 250
//                            2 -> Font.NORMAL // 400
//                            3 -> 550
//                            4 -> Font.BOLD   // 700
//                            5 -> Font.BLACK  // 900
//                            else -> Font.NORMAL
//                        }
//                        if (index in 6..11) italic = true
//                        if (index in 12..17) oblique = true
//                    }
//                }
//            }
//        }


//        /* Примеры 6.1-6.3 - коррекция шрифтов */
//        documentView {
//            fontList {
//                family("serif") from Font(Typeface.SERIF)

//                /* Пример 6.1 */
//                font("ponomar") to Font(Typeface.createFromAsset(assets, "fonts/PonomarUnicode.ttf")!!)

//                /* Пример 6.2 */
//                font("ponomar") to Font(Typeface.createFromAsset(assets, "fonts/PonomarUnicode.ttf")!!,
//                        scale = 1.2f)

//                /* Пример 6.3 */
//                font("ponomar") to Font(Typeface.createFromAsset(assets, "fonts/PonomarUnicode.ttf")!!,
//                        scale = 1.2f, ascentRatio = 0.8f, descentRatio = 0.8f)

//            }
//
//            document {
//                text = "В начале сотворил Бог - Въ нача́лѣ сотворѝ бг҃ъ"
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                span to word(4) style { font = "serif" }
//                span from word(5) style { font = "ponomar" }
//            }
//        }


//        /* Пример 7 */
//        val commonFontList = FontList {
//            font("georgia") to Font(Typeface.createFromAsset(assets, "fonts/georgia.ttf")!!)
//            font("georgia", isBold = true) to Font(Typeface.createFromAsset(assets, "fonts/georgiab.ttf")!!)
//            font("georgia", isItalic = true) to Font(Typeface.createFromAsset(assets, "fonts/georgiai.ttf")!!)
//            font("georgia", isBold = true, isItalic = true) to Font(Typeface.createFromAsset(assets, "fonts/georgiaz.ttf")!!)
//        }
//
//        documentView {
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
//                    border = Border.px(1f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                span from "consectetur" to "incididunt" style { bold = true }
//                span from "sed" style { italic = true }
//            }
//        }


//        /* Пример 8.1 - Рамки */
//        documentView {
//            document {
//                text = """
//                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
//                    Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
//                    Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
//                """.trimIndent()
//
//                borderStyle {
//                    border = Border.px(1f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                paragraph { index ->
//                    borderStyle {
//                        val color = when (index) {
//                            0 -> 0xDC3023
//                            1 -> 0x22A7F0
//                            2 -> 0x26C281
//                            else -> 0
//                        }
//                        padding = Size.dp(8f)
//                        backgroundColor = Color.argb(0.1f, color)
//                        border = Border.dp(1f, Color.rgb(color))
//                        margin = Size.dp(8f)
//                    }
//                }
//            }
//        }


//        /* Пример 8.2 */
//        documentView {
//            document {
//                text = """
//                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
//                    Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
//                    Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
//                """.trimIndent()
//
//                borderStyle {
//                    border = Border.dp(4f, Color.rgb(0xF9690E))
//                    margin = Size.dp(4f)
//                    backgroundColor = Color.argb(0.1f, 0xF9690E)
//                }
//
//                paragraph {
//                    borderStyle {
//                        padding = Size.dp(8f)
//                        margin = Size.dp(8f)
//                    }
//                }
//
//                paragraph(0) {
//                    borderStyle {
//                        borderTop = Border.dp(8f, Color.rgb(0xDC3023))
//                        borderRight = Border.dp(8f, Color.rgb(0x22A7F0))
//                        borderBottom = Border.dp(8f, Color.rgb(0x26C281))
//                        borderLeft = Border.dp(8f, Color.rgb(0x9B59B6))
//                        backgroundColor = Color.argb(0.2f, 0xDC3023)
//                    }
//                }
//
//                paragraph(1) {
//                    borderStyle {
//                        borderLeft = Border.dp(8f, Color.rgb(0x22A7F0))
//                        backgroundColor = Color.argb(0.2f, 0x22A7F0)
//                    }
//                }
//
//                paragraph(2) {
//                    borderStyle {
//                        verticalBorder = Border.dp(8f, Color.TRANSPARENT)
//                        horizontalBorder = Border.dp(8f, Color.rgb(0x26C281))
//                        backgroundColor = Color.argb(0.2f, 0x26C281)
//                    }
//                }
//            }
//        }


//        /* Пример 9 - Оформление абзацев */
//        documentView {
//            document {
//                text = """
//                    Lorem ipsum
//                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
//                    Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
//                    Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
//                    Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
//                """.trimIndent()
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
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


//        /* Пример 10 */
//        documentView {
//            fontList {
//                font("georgia") to Font(Typeface.createFromAsset(assets, "fonts/georgia.ttf")!!)
//                font("georgia", isBold = true) to Font(Typeface.createFromAsset(assets, "fonts/georgiab.ttf")!!)
//                font("georgia", isItalic = true) to Font(Typeface.createFromAsset(assets, "fonts/georgiai.ttf")!!)
//                font("georgia", isBold = true, isItalic = true) to Font(Typeface.createFromAsset(assets, "fonts/georgiaz.ttf")!!)
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
//                    border = Border.px(1f, Color.BLACK)
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


//        /* Пример 11 - по примеру 9 */
//        documentView.document {
//            // Мягкие переносы для наглядности обозначаем знаком '~', затем их переводим в '\u00AD'
//            text = """
//                Lorem ipsum
//                Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua.
//                Ut enim ad mi~nim ve~niam, qu~is nos~t~rud exer~ci~ta~tion ul~lam~co la~bo~ris ni~si ut ali~qu~ip ex ea com~mo~do con~se~quat.
//                Duis aute iru~re do~lor in rep~re~hen~de~rit in vo~lup~ta~te ve~lit es~se cil~lum do~lo~re eu fu~gi~at nul~la pa~ria~tur.
//                Ex~cep~te~ur sint oc~cae~cat cu~pi~da~tat non pro~i~dent, sunt in cul~pa qui of~fi~cia de~se~runt mol~lit anim id est la~bo~rum.
//            """.trimIndent().replace('~', '\u00AD')
//
//            borderStyle {
//                padding = Size.dp(8f)
//                border = Border.px(1f, Color.BLACK)
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


//        /* Пример 12 */
//        documentView {
//            fontList {
//                font("ponomar") {
//                    typeface = Typeface.createFromAsset(assets, "fonts/PonomarUnicode.ttf")!!
//                    hyphen = '_' // Символ переноса для старославянского языка
//                    ascentRatio = 0.9f
//                    descentRatio = 0.9f
//                    scale = 1.2f
//                }
//            }
//
//            document {
//                text = "Прї~и~ди́~те ко мнѣ̀ всѝ трꙋж~да́ю~щї~и~сѧ и҆ ѡ҆б~ре~ме~не́н~нїи, и҆ а҆́зъ оу҆по~ко́ю вы̀. Воз̾~ми́~те и҆́го моѐ на се~бѐ, и҆ на~ꙋ~чи́~те~сѧ ѿ ме~нѐ, ꙗ҆́кѡ кро́~токъ є҆́смь и҆ сми~ре́нъ се́рд~цемъ, и҆ ѡ҆б~рѧ́~ще~те по~ко́й дꙋ~ша́мъ ва́~шымъ. И҆́го бо моѐ бла́~го, и҆ бре́~мѧ моѐ лег~ко̀ є҆́сть."
//                        .replace('~', '\u00AD')
//
//
//                borderStyle {
//                    padding = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
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
//                span on 0 style { color = Color.RED }
//            }
//        }


//        /* Пример 13 - базовые линии */
//        documentView {
//            baselineMode = DocumentView.Baseline.SECTION
//            document {
//                text = "Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua."
//                        .replace('~', '\u00AD')
//
//                borderStyle {
//                    horizontalPadding = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//            }
//        }


//        /* Примеры 14.1-14.7 */
//        documentView {
//            baselineMode = DocumentView.Baseline.SECTION
//            baselineColor = Color.rgb(0x4B77BE)
//
//            document {
//                text = """
//                    Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua.
//                    Ut enim ad mi~nim ve~niam, qu~is nos~t~rud exer~ci~ta~tion ul~lam~co la~bo~ris ni~si ut ali~qu~ip ex ea com~mo~do con~se~quat.
//                    Duis1 aute2 iru~re3 do~lor4 in5 rep~re~hen~de~rit6 in7 vo~lup~ta~te8 ve~lit9 es~se10 cil~lum11 do~lo~re12 eu13 fu~gi~at14 nul~la15 pa~ria~tur16.
//                    Ex~cep~te~ur sint oc~cae~cat cu~pi~da~tat non pro~i~dent1, sunt in cul~pa* qui of~fi~cia de~se~runt mol~lit anim2 id est la~bo~rum.
//                """.trimIndent().replace('~', '\u00AD')
//
//                borderStyle {
//                    horizontalPadding = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
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

//                // Пример 14.1
//                paragraph(1) {
//                    span on word(10) style { size = Size.em(1.4f) }
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style {
//                        baselineShift = Size.em(0.33f)
//                        size = Size.em(0.58f)
//                    }
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style {
//                        baselineShift = Size.em(-0.5f)
//                        size = Size.em(0.58f)
//                    }
//                }

//                // Пример 14.2
//                paragraph(1) {
//                    span on word(10) style { size = Size.em(1.4f) }
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style {
//                        verticalAlign = CharacterStyle.VAlign.BOTTOM
//                        size = Size.em(0.58f)
//                    }
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style {
//                        verticalAlign = CharacterStyle.VAlign.TOP
//                        size = Size.em(0.58f)
//                    }
//                }

//                // Пример 14.3
//                paragraph(1) {
//                    span on word(10) style { size = Size.em(1.4f) }
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style {
//                        verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM
//                        size = Size.em(0.58f)
//                    }
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style {
//                        verticalAlign = CharacterStyle.VAlign.TOP
//                        size = Size.em(0.58f)
//                    }
//                }

//                // Пример 14.4
//                paragraph(1) {
//                    span on word(10) style {
//                        size = Size.em(1.4f)
//                        leading = Size.dp(0f)
//                    }
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style {
//                        verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM
//                        size = Size.em(0.58f)
//                        leading = Size.dp(0f)
//                    }
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style {
//                        verticalAlign = CharacterStyle.VAlign.TOP
//                        size = Size.em(0.58f)
//                    }
//                }

//                // Пример 14.4.2
//                paragraph(1) {
//                    span on word(10) style {
//                        size = Size.em(1.4f)
//                        leading = Size.ratio(1f)
//                    }
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style {
//                        verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM
//                        size = Size.em(0.58f)
//                        leading = Size.ratio(1f)
//                    }
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style {
//                        verticalAlign = CharacterStyle.VAlign.TOP
//                        size = Size.em(0.58f)
//                    }
//                }

//                // Пример 14.5
//                characterStyle {
//                    leading = Size.fh(1.15f)
//                }
//
//                paragraph(1) {
//                    span on word(10) style {
//                        size = Size.em(1.4f)
//                        leading = Size.ratio(1f)
//                    }
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style {
//                        verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM
//                        size = Size.em(0.58f)
//                        leading = Size.ratio(1f)
//                    }
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style {
//                        verticalAlign = CharacterStyle.VAlign.TOP
//                        size = Size.em(0.58f)
//                    }
//                }

//                // Пример 14.6
//                characterStyle {
//                    leading = Size.fh(1.15f)
//                }
//
//                paragraph(0) {
//                    span on 0 style {
//                        size = Size.em(1.4f)
//                        leading = Size.ratio(1f)
//                    }
//                }
//
//                paragraph(1) {
//                    span on word(10) style {
//                        size = Size.em(1.4f)
//                        leading = Size.ratio(1f)
//                    }
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style {
//                        verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM
//                        size = Size.em(0.58f)
//                        leading = Size.ratio(1f)
//                    }
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style {
//                        verticalAlign = CharacterStyle.VAlign.TOP
//                        size = Size.em(0.58f)
//                    }
//                }

//                // Пример 14.7
//                characterStyle {
//                    leading = Size.fh(1.15f)
//                }
//
//                firstBaselineToTop = true
//
////                paragraph(0) {
////                    span on 0 style {
////                            size = Size.em(1.4f),
////                            leading = Size.ratio(1f))
////                }
//
//                paragraph(1) {
//                    span on word(10) style {
//                        size = Size.em(1.4f)
//                        leading = Size.ratio(1f)
//                    }
//                }
//
//                paragraph(2) {
//                    span all Regex("""\d+""") style {
//                        verticalAlign = CharacterStyle.VAlign.BASELINE_TO_BOTTOM
//                        size = Size.em(0.58f),
//                        leading = Size.ratio(1f)
//                    }
//                }
//
//                paragraph(3) {
//                    span all Regex("""\*|\d""") style {
//                        verticalAlign = CharacterStyle.VAlign.TOP
//                        size = Size.em(0.58f)
//                    }
//                }

//            }
//        }


//        /* Пример 15 - схлопывание */
//        documentView {
//            document {
////                marginCollapsing = false
////                ignoreFirstMargin = true
////                ignoreLastMargin = true
//
//                borderStyle {
//                    margin = Size.dp(4f)
//                    border = Border.px(1f, Color.BLACK)
//                    horizontalPadding = Size.mm(2f)
//                }
//
//                paragraphStyle {
//                    align = ParagraphStyle.Align.JUSTIFY
//                    spaceBefore = Size.mm(5f)
//                    spaceAfter = Size.mm(5f)
//                }
//
//                text = """
//                    Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua.
//                    Ut enim ad mi~nim ve~niam, qu~is nos~t~rud exer~ci~ta~tion ul~lam~co la~bo~ris ni~si ut ali~qu~ip ex ea com~mo~do con~se~qu~at.
//                    Duis aute iru~re do~lor in rep~re~hen~de~rit in vo~lup~ta~te ve~lit es~se cil~lum do~lo~re eu fu~gi~at nul~la pa~ria~tur.
//                """.trimIndent().replace('~', '\u00AD')
//
//                paragraph(0..2) {
//                    borderStyle.backgroundColor = Color.rgb(0x26A65B)
//                }
//            }
//        }


//        /* Примеры 16.1-16.4 */
//        documentView {
//            document {
////                marginCollapsing = false
////                ignoreFirstMargin = true
////                ignoreLastMargin = true
//
//                borderStyle {
//                    margin = Size.dp(4f)
//                    border = Border.px(1f, Color.BLACK)
//                }
//
//                paragraphStyle {
//                    align = ParagraphStyle.Align.JUSTIFY
//                    spaceBefore = Size.mm(5f)
//                    spaceAfter = Size.mm(5f)
////                    spaceBefore = Size.mm(10f)
////                    spaceAfter = Size.mm(10f)
//                }
//
//                section {
//                    ignoreFirstMargin = true
//                    ignoreLastMargin = true
//
//                    borderStyle {
//                        verticalMargin = Size.mm(10f)
////                        verticalMargin = Size.mm(5f)
////                        border = Border.dp(1f, Color.BLACK)
//                        horizontalPadding = Size.mm(2f)
//                        backgroundColor = Color.rgb(0xCF000F)
//                        marginColor = Color.argb(0.7f, 0xCF000F)
//                    }
//
//                    text = "Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et do~lo~re mag~na ali~qua."
//                            .replace('~', '\u00AD')
//
//                    paragraph(0).borderStyle.backgroundColor = Color.rgb(0x26A65B)
//                    paragraph(0).borderStyle.marginColor = Color.argb(0.7f, 0x26A65B)
//                }
//            }
//        }

//        /* Пример 17 */
//        documentView {
//            document {
////                marginCollapsing = false
//
//                borderStyle {
//                    margin = Size.dp(4f)
//                    border = Border.px(1f, Color.BLACK)
//                }
//
//                paragraphStyle {
//                    align = ParagraphStyle.Align.JUSTIFY
//                    spaceBefore = Size.mm(5f)
//                    spaceAfter = Size.mm(5f)
//                }
//
//                section {
//                    borderStyle {
//                        verticalMargin = Size.mm(5f)
//                        border = Border.dp(1f, Color.BLACK)
//                        horizontalPadding = Size.mm(2f)
//                        backgroundColor = Color.rgb(0xCF000F)
//                        marginColor = Color.argb(0.7f, 0xCF000F)
//                    }
//
//                    section {
//                        text = ("Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing " +
//                                "elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et " +
//                                "do~lo~re mag~na ali~qua.")
//                                .replace('~', '\u00AD')
//
//                        borderStyle {
//                            verticalMargin = Size.mm(5f)
//                            border = Border.dp(1f, Color.BLACK)
//                            horizontalPadding = Size.mm(2f)
//                            backgroundColor = Color.rgb(0x22A7F0)
//                            marginColor = Color.argb(0.7f, 0x22A7F0)
//                        }
//
//                        paragraph(0).borderStyle.backgroundColor = Color.rgb(0x26A65B)
//                        paragraph(0).borderStyle.marginColor = Color.argb(0.7f, 0x26A65B)
//                    }
//                }
//            }
//        }

//        /* Пример 18 */
//        documentView {
//            document {
////                marginCollapsing = false
//
//                borderStyle {
//                    margin = Size.dp(4f)
//                    border = Border.px(1f, Color.BLACK)
//                }
//
//                paragraphStyle {
//                    align = ParagraphStyle.Align.JUSTIFY
//                    spaceBefore = Size.mm(5f)
//                    spaceAfter = Size.mm(5f)
//                }
//
//                section {
//                    borderStyle {
//                        verticalMargin = Size.mm(5f)
//                        horizontalPadding = Size.mm(2f)
//                        backgroundColor = Color.rgb(0xCF000F)
////                        marginColor = Color.argb(0.7f, 0xCF000F)
//                    }
//
//                    section {
//                        text = ("Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing " +
//                                "elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et " +
//                                "do~lo~re mag~na ali~qua.")
//                                .replace('~', '\u00AD')
//
//                        borderStyle {
//                            verticalMargin = Size.mm(5f)
//                            horizontalPadding = Size.mm(2f)
//                            backgroundColor = Color.rgb(0x22A7F0)
////                            marginColor = Color.argb(0.7f, 0x22A7F0)
//                        }
//
//                        paragraph(0).borderStyle.backgroundColor = Color.rgb(0x26A65B)
////                        paragraph(0).borderStyle.marginColor = Color.argb(0.7f, 0x26A65B)
//                    }
//                }
//
//                section {
//                    borderStyle {
//                        verticalMargin = Size.mm(5f)
//                        horizontalPadding = Size.mm(2f)
//                        backgroundColor = Color.rgb(0xCF000F)
////                        marginColor = Color.argb(0.7f, 0xCF000F)
//                    }
//
//                    section {
//                        text = ("Lo~rem ip~sum do~lor sit amet, con~sec~te~tur adi~pis~cing " +
//                                "elit, sed do eius~mod tem~por in~ci~di~dunt ut la~bo~re et " +
//                                "do~lo~re mag~na ali~qua.")
//                                .replace('~', '\u00AD')
//
//                        borderStyle {
//                            verticalMargin = Size.mm(5f)
//                            horizontalPadding = Size.mm(2f)
//                            backgroundColor = Color.rgb(0x22A7F0)
////                            marginColor = Color.argb(0.7f, 0x22A7F0)
//                        }
//
//                        paragraph(0).borderStyle.backgroundColor = Color.rgb(0x26A65B)
////                        paragraph(0).borderStyle.marginColor = Color.argb(0.7f, 0x26A65B)
//                    }
//                }
//            }
//        }


//        /* Пример 19??? */
//        documentView {
//            fontList {
//                family("sans_serif") from Font(Typeface.SANS_SERIF)
//                family("serif") from Font(Typeface.SERIF)
///            }
//
//            document {
////                marginCollapsing = false
//                ignoreFirstMargin = true
//                ignoreLastMargin = true
//
//                text = """
//                    Lorem ipsum
//                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
//                    Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
//                    Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
//                    Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
//                """.trimIndent()
//
//                borderStyle {
//                    horizontalPadding = Size.dp(8f)
//                    border = Border.px(1f, Color.BLACK)
//                    margin = Size.dp(4f)
//                }
//
//                characterStyle {
//                    size = Size.pt(8f)
//                    font = "sans_serif"
//                }
//
//                paragraphStyle {
//                    firstLeftIndent = Size.pt(16f)
//                    spaceBefore = Size.pt(8f)
//                    spaceAfter = Size.pt(8f)
//                }
//
//                paragraph(0) {
//                    characterStyle {
//                        size = Size.pt(16f)
//                        bold = true
//                        font = "serif"
//                    }
//                    paragraphStyle {
//                        spaceBefore = Size.pt(16f)
//                        spaceAfter = Size.pt(16f)
//                    }
//                }
//            }
//        }

    }
}

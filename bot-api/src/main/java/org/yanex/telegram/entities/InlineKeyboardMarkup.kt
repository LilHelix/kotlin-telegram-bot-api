package org.yanex.telegram.entities

import com.google.gson.annotations.SerializedName as Name

/**
 * This object represents an inline keyboard that appears right next to the message it belongs to.
 *
 * @property inlineKeyboard List of button rows, each represented by an List of InlineKeyboardButton objects.
 */
data class InlineKeyboardMarkup(
        @Name("inline_keyboard") val inlineKeyboard: List<List<InlineKeyboardButton>>) : Reply